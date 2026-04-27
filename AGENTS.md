# Instrucciones para Codex

Este proyecto es un ejercicio educativo de Java puro sobre Programación Orientada a Objetos y patrones de diseño.

## Objetivo

Implementar un aplicativo que modela dispositivos de manipulación de un televisor. El sistema ya cuenta con dispositivos como `ControlInfrarrojo` y `PanelTV`, que comparten operaciones básicas:

- Encender.
- Apagar.
- Manipular volumen.
- Cambiar entrada.

El ejercicio consiste en incorporar un `SmartPhone` que puede realizar las mismas acciones mediante WiFi y una aplicación, pero usando una secuencia interna diferente. La solución debe aplicar el patrón de diseño **Adapter** para integrar `SmartPhone` sin modificar la jerarquía existente.

## Patrón principal

Usar el patrón **Adapter** porque permite que una clase con una interfaz incompatible (`SmartPhone`) sea utilizada por el sistema como si fuera un `DispositivoManipulacionTV`.

El adaptador debe traducir las llamadas esperadas por el sistema:

- `encender()`
- `apagar()`
- `manipularVolumen()`
- `cambiarEntrada()`

Hacia las operaciones reales del smartphone:

- `iniciarAplicacion()`
- `scanearDispositivosEnLaRed()`
- `seleccionarDispositivo()`
- `iniciarDispositivo()`
- `detenerDispositivo()`
- `manipularVolumen()`
- `cambiarEntrada()`

## Reglas técnicas

- Usar Java puro, versión 17 o superior.
- No usar Spring Boot.
- No usar frameworks externos.
- No usar frameworks innecesarios.
- No usar base de datos.
- No usar Maven ni Gradle si el proyecto no lo requiere.
- Mantener el código simple, claro, educativo y entendible para estudiantes.
- Usar nombres en español para clases, métodos y atributos.
- Documentar brevemente las clases y métodos principales con comentarios JavaDoc.
- El proyecto debe poder ejecutarse desde una clase `Main`.
- Evitar modificar clases existentes cuando se pueda extender el sistema agregando nuevas clases.
- Priorizar el principio abierto/cerrado: abierto para extensión y cerrado para modificación.

## Antes de modificar archivos

- Primero explicar brevemente el plan.
- Luego implementar los cambios.
- Al final resumir los archivos creados o modificados.

## Estructura esperada

Usar la siguiente estructura de paquetes:

```text
com.ejemplo.televisor
com.ejemplo.televisor.dispositivo
com.ejemplo.televisor.smartphone
com.ejemplo.televisor.adaptador
```

## Clases esperadas

- `Main`, en `com.ejemplo.televisor`.
- `DispositivoManipulacionTV`, en `com.ejemplo.televisor.dispositivo`.
- `ControlInfrarrojo`, en `com.ejemplo.televisor.dispositivo`.
- `PanelTV`, en `com.ejemplo.televisor.dispositivo`.
- `SmartPhone`, en `com.ejemplo.televisor.smartphone`.
- `SmartPhoneAdapter`, en `com.ejemplo.televisor.adaptador`.
