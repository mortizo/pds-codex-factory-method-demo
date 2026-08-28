package com.example.factorymethod;

/**
 * Contrato temporal: horas normales y horas extra con recargo del 50 %.
 */
public final class ContratoTemporal extends Contrato {
    private static final double FACTOR_HORA_EXTRA = 1.5;

    private final double horasNormales;
    private final double horasExtra;
    private final double tarifaPorHora;

    public ContratoTemporal(double horasNormales, double horasExtra, double tarifaPorHora) {
        validarNoNegativo("horasNormales", horasNormales);
        validarNoNegativo("horasExtra", horasExtra);
        validarNoNegativo("tarifaPorHora", tarifaPorHora);
        this.horasNormales = horasNormales;
        this.horasExtra = horasExtra;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSueldo() {
        double pagoNormal = horasNormales * tarifaPorHora;
        double pagoExtra = horasExtra * tarifaPorHora * FACTOR_HORA_EXTRA;
        return pagoNormal + pagoExtra;
    }
}
