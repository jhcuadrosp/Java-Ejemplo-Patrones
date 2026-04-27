# Java-Ejemplo-Patrones

Ejercicio educativo de Java puro para practicar Programación Orientada a Objetos y el patrón de diseño **Adapter**.

## Caso de estudio

El aplicativo modela dispositivos de manipulación de un televisor. Inicialmente el sistema funciona con una jerarquía de clases para dispositivos como:

- `ControlInfrarrojo`
- `PanelTV`

Estos dispositivos comparten operaciones básicas:

- Encender.
- Apagar.
- Manipular volumen.
- Cambiar entrada.

Luego se requiere incorporar un `SmartPhone`, que puede realizar las mismas acciones mediante WiFi y una aplicación. Sin embargo, sus procesos internos siguen una secuencia diferente:

- Encender: iniciar aplicación, scanear dispositivos en la red, seleccionar dispositivo, iniciar dispositivo.
- Apagar: iniciar aplicación, scanear dispositivos en la red, seleccionar dispositivo, detener dispositivo.
- Manipular volumen: iniciar aplicación, scanear dispositivos en la red, seleccionar dispositivo, manipular volumen.
- Cambiar entrada: iniciar aplicación, scanear dispositivos en la red, seleccionar dispositivo, cambiar entrada.

Por esta diferencia, `SmartPhone` no debe heredar directamente de `DispositivoManipulacionTV`.

## Patrón recomendado

El patrón recomendado es **Adapter**.

Se usa porque permite incorporar una clase con una interfaz incompatible (`SmartPhone`) dentro de un sistema que ya espera trabajar con otra abstracción (`DispositivoManipulacionTV`).

La solución consiste en crear un `AdaptadorSmartPhone` que se comporte como un dispositivo de manipulación de TV, pero que internamente delegue las acciones al `SmartPhone` ejecutando la secuencia correcta.

## Por qué no otros patrones

- `Strategy`: sirve para intercambiar algoritmos, pero aquí el problema principal es adaptar una interfaz incompatible.
- `Template Method`: requiere una estructura común basada en herencia, justo lo que se quiere evitar para `SmartPhone`.
- `Bridge`: sería útil para rediseñar la separación entre abstracción e implementación, pero resulta más grande de lo necesario para este caso.
- `Facade`: simplifica operaciones complejas, pero no adapta directamente una clase a la interfaz esperada por el sistema.

## Estructura del proyecto

```text
src/main/java/com/ejemplo/televisor
src/main/java/com/ejemplo/televisor/dispositivo
src/main/java/com/ejemplo/televisor/smartphone
src/main/java/com/ejemplo/televisor/adaptador
```

## Clases previstas

- `Main`: demostrará el uso del sistema.
- `DispositivoManipulacionTV`: definirá las operaciones esperadas para controlar el televisor.
- `ControlInfrarrojo`: dispositivo existente que controla el televisor directamente.
- `PanelTV`: dispositivo existente que controla el televisor desde el panel físico.
- `SmartPhone`: clase nueva con operaciones propias de conexión WiFi y aplicación.
- `AdaptadorSmartPhone`: adaptador que permite usar `SmartPhone` como `DispositivoManipulacionTV`.

## Conceptos aplicados

- Encapsulamiento en las clases concretas.
- Herencia o implementación de una abstracción común para los dispositivos existentes.
- Polimorfismo al tratar `ControlInfrarrojo`, `PanelTV` y `AdaptadorSmartPhone` como dispositivos de manipulación de TV.
- Abstracción mediante el contrato común `DispositivoManipulacionTV`.
- Patrón Adapter para respetar el principio abierto/cerrado.

## Notas técnicas

- Usar Java 17 o superior.
- No usar Spring Boot.
- No usar frameworks externos.
- No usar base de datos.
- No requiere Maven ni Gradle.
