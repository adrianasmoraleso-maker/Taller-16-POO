package org.taller;

public class PruebaDescuento {
    public static void main(String[] args) {
        double precio = 100.0;
        Descuento d1 = new DescuentoPorcentaje(10);
        Descuento d2 = new DescuentoFijo(15);

        System.out.println("\n==================Sistema de descuento para tienda==================\n");

        System.out.println("Con descuento %: " + d1.aplicar(precio));
        System.out.println("Con descuento fijo: " + d2.aplicar(precio));
    }
}