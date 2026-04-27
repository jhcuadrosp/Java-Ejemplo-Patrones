package com.ejemplo.televisor.dispositivo;

/**
 * Define las operaciones basicas que debe ofrecer cualquier dispositivo
 * que manipule un televisor.
 */
public interface DispositivoManipulacionTV {

    /**
     * Enciende el televisor.
     */
    void encender();

    /**
     * Apaga el televisor.
     */
    void apagar();

    /**
     * Manipula el volumen del televisor.
     */
    void manipularVolumen();

    /**
     * Cambia la entrada del televisor.
     */
    void cambiarEntrada();
}
