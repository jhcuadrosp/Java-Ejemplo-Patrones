package com.ejemplo.televisor.dispositivo;

/**
 * Representa el panel fisico integrado en el televisor.
 */
public class PanelTV implements DispositivoManipulacionTV {

    @Override
    public void encender() {
        System.out.println("Panel TV: encendiendo el televisor desde el boton del panel.");
    }

    @Override
    public void apagar() {
        System.out.println("Panel TV: apagando el televisor desde el boton del panel.");
    }

    @Override
    public void manipularVolumen() {
        System.out.println("Panel TV: ajustando el volumen desde el panel frontal.");
    }

    @Override
    public void cambiarEntrada() {
        System.out.println("Panel TV: cambiando la entrada desde el panel del televisor.");
    }
}
