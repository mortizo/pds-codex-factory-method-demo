package com.mycompany.pds.codex.factory.method.demo;

/**
 * Contrato por factura: monto facturado más bonos por entregables terminados.
 */
public final class ContratoFactura extends Contrato {
    private final double montoFacturado;
    private final int entregablesCompletados;
    private final double bonoPorEntregable;

    public ContratoFactura(double montoFacturado, int entregablesCompletados,
                           double bonoPorEntregable) {
        validarNoNegativo("montoFacturado", montoFacturado);
        validarNoNegativo("bonoPorEntregable", bonoPorEntregable);
        if (entregablesCompletados < 0) {
            throw new IllegalArgumentException("entregablesCompletados no puede ser negativo");
        }
        this.montoFacturado = montoFacturado;
        this.entregablesCompletados = entregablesCompletados;
        this.bonoPorEntregable = bonoPorEntregable;
    }

    @Override
    public double calcularSueldo() {
        return montoFacturado + entregablesCompletados * bonoPorEntregable;
    }
}
