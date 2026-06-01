package org.taller;

public class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}