package com.mycompany.pds.codex.factory.method.demo;

public final class CreadorContratoFijo extends CreadorContrato {
    private final double salarioMensual;
    private final double bonoDesempeno;
    private final double horasExtra;
    private final double tarifaHoraExtra;

    public CreadorContratoFijo(double salarioMensual, double bonoDesempeno,
                               double horasExtra, double tarifaHoraExtra) {
        this.salarioMensual = salarioMensual;
        this.bonoDesempeno = bonoDesempeno;
        this.horasExtra = horasExtra;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    @Override
    public Contrato crearContrato() {
        return new ContratoFijo(salarioMensual, bonoDesempeno, horasExtra, tarifaHoraExtra);
    }
}
