package com.mycompany.pds.codex.factory.method.demo;

public final class CreadorContratoFactura extends CreadorContrato {
    private final double montoFacturado;
    private final int entregablesCompletados;
    private final double bonoPorEntregable;

    public CreadorContratoFactura(double montoFacturado, int entregablesCompletados,
                                  double bonoPorEntregable) {
        this.montoFacturado = montoFacturado;
        this.entregablesCompletados = entregablesCompletados;
        this.bonoPorEntregable = bonoPorEntregable;
    }

    @Override
    public Contrato crearContrato() {
        return new ContratoFactura(montoFacturado, entregablesCompletados, bonoPorEntregable);
    }
}
