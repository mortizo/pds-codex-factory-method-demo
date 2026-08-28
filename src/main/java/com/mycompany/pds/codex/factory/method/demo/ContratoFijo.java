package com.mycompany.pds.codex.factory.method.demo;

/**
 * Contrato fijo: salario mensual, bono de desempeño y pago de horas extra.
 */
public final class ContratoFijo extends Contrato {
    private final double salarioMensual;
    private final double bonoDesempeno;
    private final double horasExtra;
    private final double tarifaHoraExtra;

    public ContratoFijo(double salarioMensual, double bonoDesempeno,
                        double horasExtra, double tarifaHoraExtra) {
        validarNoNegativo("salarioMensual", salarioMensual);
        validarNoNegativo("bonoDesempeno", bonoDesempeno);
        validarNoNegativo("horasExtra", horasExtra);
        validarNoNegativo("tarifaHoraExtra", tarifaHoraExtra);
        this.salarioMensual = salarioMensual;
        this.bonoDesempeno = bonoDesempeno;
        this.horasExtra = horasExtra;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual + bonoDesempeno + horasExtra * tarifaHoraExtra;
    }
}
