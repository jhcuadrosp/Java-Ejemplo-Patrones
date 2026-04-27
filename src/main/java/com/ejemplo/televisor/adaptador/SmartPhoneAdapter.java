package com.ejemplo.televisor.adaptador;

import com.ejemplo.televisor.dispositivo.DispositivoManipulacionTV;
import com.ejemplo.televisor.smartphone.SmartPhone;

/**
 * Adapta un {@link SmartPhone} a la interfaz esperada por el sistema.
 * Permite usar el smartphone como un {@link DispositivoManipulacionTV}
 * sin modificar la clase SmartPhone ni las clases existentes.
 */
public class SmartPhoneAdapter implements DispositivoManipulacionTV {

    private final SmartPhone smartPhone;

    /**
     * Crea un adaptador para un smartphone concreto.
     *
     * @param smartPhone telefono inteligente que sera adaptado.
     */
    public SmartPhoneAdapter(SmartPhone smartPhone) {
        if (smartPhone == null) {
            throw new IllegalArgumentException("El SmartPhone no puede ser nulo.");
        }
        this.smartPhone = smartPhone;
    }

    @Override
    public void encender() {
        prepararConexion();
        smartPhone.iniciarDispositivo();
    }

    @Override
    public void apagar() {
        prepararConexion();
        smartPhone.detenerDispositivo();
    }

    @Override
    public void manipularVolumen() {
        prepararConexion();
        smartPhone.manipularVolumen();
    }

    @Override
    public void cambiarEntrada() {
        prepararConexion();
        smartPhone.cambiarEntrada();
    }

    private void prepararConexion() {
        smartPhone.iniciarAplicacion();
        smartPhone.scanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
    }
}
