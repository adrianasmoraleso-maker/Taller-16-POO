package org.taller;

public class PruebaMensajero {
    public static void main(String[] args) {

        System.out.println("\n============== Sistema de envío de mensajes ==============\n");

        Mensajero[] mensajeros = {
                new MensajeroEmail(),
                new MensajeroSMS(),
                new MensajeroNotificacion()
        };

        for (Mensajero m : mensajeros) {
            m.enviarMensaje("Holaaaaaaaa! este es un mensaje de prueba ✉ ☺");
        }
    }
}