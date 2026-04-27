package com.ejemplo.televisor;

import com.ejemplo.televisor.adaptador.SmartPhoneAdapter;
import com.ejemplo.televisor.dispositivo.ControlInfrarrojo;
import com.ejemplo.televisor.dispositivo.DispositivoManipulacionTV;
import com.ejemplo.televisor.dispositivo.PanelTV;
import com.ejemplo.televisor.smartphone.SmartPhone;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que demuestra el uso polimorfico de los dispositivos
 * de manipulacion del televisor.
 */
public class Main {

    /**
     * Ejecuta el ejemplo del patron Adapter.
     *
     * @param args argumentos de consola no utilizados.
     */
    public static void main(String[] args) {
        DispositivoManipulacionTV controlInfrarrojo = new ControlInfrarrojo();
        DispositivoManipulacionTV panelTV = new PanelTV();

        SmartPhone smartPhone = new SmartPhone();
        DispositivoManipulacionTV smartPhoneAdapter = new SmartPhoneAdapter(smartPhone);

        List<DispositivoManipulacionTV> dispositivos = new ArrayList<>();
        dispositivos.add(controlInfrarrojo);
        dispositivos.add(panelTV);
        dispositivos.add(smartPhoneAdapter);

        for (DispositivoManipulacionTV dispositivo : dispositivos) {
            mostrarSeparador(dispositivo);
            dispositivo.encender();
            dispositivo.manipularVolumen();
            dispositivo.cambiarEntrada();
            dispositivo.apagar();
            System.out.println();
        }
    }

    private static void mostrarSeparador(DispositivoManipulacionTV dispositivo) {
        System.out.println("========================================");
        System.out.println("Dispositivo: " + dispositivo.getClass().getSimpleName());
        System.out.println("========================================");
    }
}
