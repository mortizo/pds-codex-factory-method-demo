package com.mycompany.pds.codex.factory.method.demo;

/**
 * Creador abstracto: delega la creación del producto a cada subclase concreta.
 */
public abstract class CreadorContrato {

    public abstract Contrato crearContrato();

    public double calcularSueldo() {
        return crearContrato().calcularSueldo();
    }
}
