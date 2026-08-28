package com.mycompany.pds.codex.factory.method.demo;

import java.util.List;

public final class PdsCodexFactoryMethodDemo {
    private PdsCodexFactoryMethodDemo() {
    }

    public static void main(String[] args) {
        System.out.println("Hola mundo...");
        List<CreadorContrato> creadores = List.of(
                new CreadorContratoFijo(1_500.00, 200.00, 5, 12.00),
                new CreadorContratoFactura(1_200.00, 3, 75.00),
                new CreadorContratoTemporal(120, 10, 8.50)
        );

        for (CreadorContrato creador : creadores) {
            Contrato contrato = creador.crearContrato();
            System.out.printf("%s: $%.2f%n",
                    contrato.getClass().getSimpleName(), contrato.calcularSueldo());
        }
    }
}
