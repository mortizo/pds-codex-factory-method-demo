package com.mycompany.pds.codex.factory.method.demo;

/**
 * Producto abstracto del patrón Factory Method.
 */
public abstract class Contrato {

    public abstract double calcularSueldo();

    protected static void validarNoNegativo(String nombre, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException(nombre + " no puede ser negativo");
        }
    }
}
