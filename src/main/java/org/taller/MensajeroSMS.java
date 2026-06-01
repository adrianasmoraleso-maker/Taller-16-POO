package org.taller;

// MensajeroSMS — extensión sin modificar la clase base
public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por SMS: " + mensaje);
    }
}