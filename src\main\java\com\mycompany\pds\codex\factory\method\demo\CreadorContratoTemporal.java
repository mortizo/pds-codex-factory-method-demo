package com.mycompany.pds.codex.factory.method.demo;

public final class CreadorContratoTemporal extends CreadorContrato {
    private final double horasNormales;
    private final double horasExtra;
    private final double tarifaPorHora;

    public CreadorContratoTemporal(double horasNormales, double horasExtra, double tarifaPorHora) {
        this.horasNormales = horasNormales;
        this.horasExtra = horasExtra;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public Contrato crearContrato() {
        return new ContratoTemporal(horasNormales, horasExtra, tarifaPorHora);
    }
}
