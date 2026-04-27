package com.ejemplo.televisor.dispositivo;

/**
 * Representa un control infrarrojo tradicional para manipular el televisor.
 */
public class ControlInfrarrojo implements DispositivoManipulacionTV {

    @Override
    public void encender() {
        System.out.println("Control infrarrojo: enviando senal para encender el televisor.");
    }

    @Override
    public void apagar() {
        System.out.println("Control infrarrojo: enviando senal para apagar el televisor.");
    }

    @Override
    public void manipularVolumen() {
        System.out.println("Control infrarrojo: ajustando el volumen con botones fisicos.");
    }

    @Override
    public void cambiarEntrada() {
        System.out.println("Control infrarrojo: cambiando la entrada del televisor.");
    }
}
