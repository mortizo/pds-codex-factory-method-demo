package com.example.factorymethod;

/**
 * Producto abstracto del patrón Factory Method.
 */
public abstract class Contrato {

    /**
     * Calcula la remuneración total según las reglas del tipo de contrato.
     *
     * @return remuneración total
     */
    public abstract double calcularSueldo();

    protected static void validarNoNegativo(String nombre, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException(nombre + " no puede ser negativo");
        }
    }
}
