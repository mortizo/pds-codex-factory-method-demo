package com.example.factorymethod;

/**
 * Creador abstracto del patrón Factory Method.
 */
public abstract class CreadorContrato {

    public abstract Contrato crearContrato();

    /**
     * Operación común que trabaja con el producto sin conocer su clase concreta.
     */
    public double calcularSueldo() {
        return crearContrato().calcularSueldo();
    }
}
