package com.mycompany.pds.codex.factory.method.demo;

import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContratoTest {

    @Test
    void creadorContratoFijoCreaContratoFijo() {
        CreadorContrato creador = new CreadorContratoFijo(1_500, 200, 5, 12);
        assertInstanceOf(ContratoFijo.class, creador.crearContrato());
    }

    @Test
    void creadorContratoTemporalCreaContratoTemporal() {
        CreadorContrato creador = new CreadorContratoTemporal(120, 10, 8.50);
        assertInstanceOf(ContratoTemporal.class, creador.crearContrato());
    }

    @Test
    void creadorContratoFacturaCreaContratoFactura() {
        CreadorContrato creador = new CreadorContratoFactura(1_200, 3, 75);
        assertInstanceOf(ContratoFactura.class, creador.crearContrato());
    }

    @Test
    void productosSeUtilizanMedianteReferenciasContrato() {
        List<Contrato> contratos = List.of(
                new CreadorContratoFijo(1_500, 200, 5, 12).crearContrato(),
                new CreadorContratoTemporal(120, 10, 8.50).crearContrato(),
                new CreadorContratoFactura(1_200, 3, 75).crearContrato()
        );

        assertEquals(List.of(1_760.0, 1_147.5, 1_425.0),
                contratos.stream().map(Contrato::calcularSueldo).toList());
    }

    @Test
    void creadorAbstractoNoCentralizaLaSeleccionDelProducto() throws NoSuchMethodException {
        assertTrue(Modifier.isAbstract(CreadorContrato.class.getModifiers()));
        assertTrue(Modifier.isAbstract(
                CreadorContrato.class.getDeclaredMethod("crearContrato").getModifiers()));
    }
}
