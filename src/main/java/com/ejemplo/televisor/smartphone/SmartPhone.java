package com.ejemplo.televisor.smartphone;

/**
 * Representa un telefono inteligente que controla el televisor mediante
 * una aplicacion y conexion WiFi.
 */
public class SmartPhone {

    /**
     * Inicia la aplicacion movil para controlar el televisor.
     */
    public void iniciarAplicacion() {
        System.out.println("SmartPhone: iniciando la aplicacion de control remoto.");
    }

    /**
     * Busca televisores disponibles en la red WiFi.
     */
    public void scanearDispositivosEnLaRed() {
        System.out.println("SmartPhone: scaneando dispositivos disponibles en la red WiFi.");
    }

    /**
     * Selecciona el televisor que sera manipulado.
     */
    public void seleccionarDispositivo() {
        System.out.println("SmartPhone: seleccionando el televisor encontrado.");
    }

    /**
     * Envia la orden para iniciar el televisor seleccionado.
     */
    public void iniciarDispositivo() {
        System.out.println("SmartPhone: enviando orden para iniciar el televisor.");
    }

    /**
     * Envia la orden para detener el televisor seleccionado.
     */
    public void detenerDispositivo() {
        System.out.println("SmartPhone: enviando orden para detener el televisor.");
    }

    /**
     * Manipula el volumen desde la aplicacion movil.
     */
    public void manipularVolumen() {
        System.out.println("SmartPhone: manipulando el volumen desde la aplicacion.");
    }

    /**
     * Cambia la entrada del televisor desde la aplicacion movil.
     */
    public void cambiarEntrada() {
        System.out.println("SmartPhone: cambiando la entrada desde la aplicacion.");
    }
}
