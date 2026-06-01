package org.taller;

// MensajeroNotificacion — otra extensión
public class MensajeroNotificacion extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}