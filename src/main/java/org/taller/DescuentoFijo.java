package org.taller;

// DescuentoFijo — extensión sin modificar la clase base
public class DescuentoFijo extends Descuento {
    private double monto;

    public DescuentoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double aplicar(double precio) {
        return precio - monto;
    }
}
