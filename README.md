## Laboratorio 03
Nombre: Jerry Anderson Huaynacho Mango

Este repositorio contiene dos proyectos en Java que utilizan clases y métodos genéricos para resolver problemas comunes de estructuras de datos y operaciones matemáticas.

## Proyecto 1: Lista Genérica

### Descripción

Implementa una estructura de datos tipo Lista Enlazada Simple usando Programación Orientada a Objetos y tipos genéricos. Incluye las operaciones básicas de inserción, eliminación, búsqueda y recorrido.

### Archivos principales

* `Node.java`: Clase que representa un nodo de la lista.
* `Lista.java`: Clase que representa la lista enlazada genérica.
* `Main.java`: Clase de prueba que crea una lista de alumnos y ejecuta operaciones sobre ella.

### Operaciones implementadas

* `add(T data)`: Agrega un nuevo elemento al final de la lista.
* `remove(T data)`: Elimina el primer nodo que contenga el dato.
* `contains(T data)`: Verifica si el dato está en la lista.
* `size()`: Devuelve el número de elementos.
* `isEmpty()`: Verifica si la lista está vacía.
* `clear()`: Elimina todos los elementos de la lista.
* `printList()`: Imprime los elementos.

---

## Proyecto 2: Calculadora Genérica

### Descripción

Implementa una calculadora interactiva con menú que permite operar con `Integer` o `Double`, según selección del usuario. Usa métodos genéricos para realizar operaciones aritméticas comunes.

### Archivos principales

* `Operador.java`: Clase que almacena dos valores genéricos.
* `Main.java`: Clase principal que contiene los métodos para las operaciones y el menú interactivo.

### Operaciones implementadas

* `suma(T valor1, T valor2)`
* `resta(T valor1, T valor2)`
* `producto(T valor1, T valor2)`
* `division(T valor1, T valor2)` (con validación por división entre cero)
* `potencia(T base, T exponente)`
* `raizCuadrada(T valor)`
* `raizCubica(T valor)`

### Menú interactivo

El usuario puede:

* Elegir la operación deseada.
* Seleccionar el tipo de datos (`Integer` o `Double`).
* Ingresar los valores.
* Ver el resultado de la operación.
* Repetir hasta seleccionar la opción "Salir".

---
### Compilación y ejecución

```bash
javac calculadora/*.java
java calculadora.Main
```

```bash
javac estructuras/*.java
java estructuras.Main
```

---
