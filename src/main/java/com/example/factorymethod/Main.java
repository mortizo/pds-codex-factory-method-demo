package com.example.factorymethod;

import java.util.List;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        List<CreadorContrato> creadores = List.of(
                new CreadorContratoFijo(1_500.00, 200.00, 5, 12.00),
                new CreadorContratoFactura(1_200.00, 3, 75.00),
                new CreadorContratoTemporal(120, 10, 8.50)
        );

        String[] tipos = {"Contrato fijo", "Contrato por factura", "Contrato temporal"};
        for (int i = 0; i < creadores.size(); i++) {
            System.out.printf("%s: $%.2f%n", tipos[i], creadores.get(i).calcularSueldo());
        }
    }
}
