package com.example.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContratoTest {

    @Test
    void calculaSueldoDeContratoFijo() {
        Contrato contrato = new ContratoFijo(1_500, 200, 5, 12);
        assertEquals(1_760, contrato.calcularSueldo(), 0.001);
    }

    @Test
    void calculaSueldoDeContratoPorFactura() {
        Contrato contrato = new ContratoFactura(1_200, 3, 75);
        assertEquals(1_425, contrato.calcularSueldo(), 0.001);
    }

    @Test
    void calculaSueldoDeContratoTemporalConRecargo() {
        Contrato contrato = new ContratoTemporal(120, 10, 8.50);
        assertEquals(1_147.50, contrato.calcularSueldo(), 0.001);
    }

    @Test
    void creadoresConstruyenElProductoCorrecto() {
        assertInstanceOf(ContratoFijo.class,
                new CreadorContratoFijo(1_500, 200, 5, 12).crearContrato());
        assertInstanceOf(ContratoFactura.class,
                new CreadorContratoFactura(1_200, 3, 75).crearContrato());
        assertInstanceOf(ContratoTemporal.class,
                new CreadorContratoTemporal(120, 10, 8.50).crearContrato());
    }

    @Test
    void rechazaValoresNegativos() {
        assertThrows(IllegalArgumentException.class,
                () -> new ContratoTemporal(-1, 0, 8.50));
    }
}
