# 🚗 Concesionaria - Java POO

Proyecto desarrollado en Java para practicar los principales conceptos de **Programación Orientada a Objetos (POO)** mediante la implementación de un sistema de concesionaria.

El sistema permite administrar distintos tipos de vehículos, como autos y motos, utilizando herencia, clases abstractas, interfaces y colecciones para almacenar y organizar la información.

## 📌 Funcionalidades

El sistema cuenta con dos tipos de vehículos:

- **Auto:** posee marca, modelo, precio y cantidad de puertas.
- **Moto:** posee marca, modelo, precio y cilindrada.

Ambos comparten los atributos y funcionalidades definidos en la clase abstracta `Vehiculo`.

## 🚘 Gestión de vehículos

El sistema permite:

- Registrar autos y motos.
- Mostrar la información de todos los vehículos.
- Encontrar el vehículo más caro.
- Encontrar el vehículo más barato.
- Filtrar vehículos cuyo modelo contiene la letra "Y".
- Ordenar vehículos por precio de mayor a menor.
- Ordenar vehículos por su orden natural (marca, modelo y precio).

## 🧩 Conceptos de POO aplicados

Durante el desarrollo se utilizaron:

- **Herencia:** para crear las clases `Auto` y `Moto` a partir de `Vehiculo`, reutilizando sus atributos y métodos.
- **Abstracción:** mediante la clase abstracta `Vehiculo`, que define las características y comportamientos comunes de los vehículos.
- **Interfaces:** mediante la interfaz `Informacion`, que establece las operaciones que debe implementar la clase `Concesionaria`.
- **Polimorfismo:** trabajando con distintos tipos de vehículos mediante una lista de tipo `Vehiculo` y utilizando una referencia de tipo interfaz para acceder a `Concesionaria`.
- **Encapsulamiento:** mediante el uso de atributos con distintos modificadores de acceso y métodos Getter.
- **Constructores y `super()`:** para inicializar los atributos propios y heredados de cada vehículo.
- **Sobrescritura de métodos:** mediante `toString()` para personalizar la representación de los objetos y `compareTo()` para definir el orden natural de los vehículos.
- **Comparable:** para establecer el orden natural de los vehículos por marca, modelo y precio.
- **Comparator:** para establecer criterios de ordenamiento adicionales, como el precio.

## 📚 Colecciones y API Stream

Se utilizaron:

- **Collections Framework:** mediante `List` y `ArrayList` para almacenar y administrar los vehículos.
- **API Stream:** utilizando `stream()`, `forEach()`, `filter()`, `max()`, `min()` y `sorted()` para recorrer, filtrar, buscar y ordenar los elementos de la colección.
- **Collections.sort():** para ordenar los vehículos según el orden natural definido en `compareTo()`.

## 🏗️ Estructura del proyecto

- **Vehiculo:** clase abstracta que contiene los atributos y comportamientos comunes.
- **Auto:** clase que hereda de `Vehiculo` y agrega el atributo puertas.
- **Moto:** clase que hereda de `Vehiculo` y agrega el atributo cilindrada.
- **Informacion:** interfaz que define las operaciones de gestión de vehículos.
- **Concesionaria:** clase que implementa `Informacion`, administra la colección de vehículos y contiene la lógica de las operaciones.
- **TestConcesionaria:** clase encargada de crear la concesionaria y ejecutar las pruebas de sus funcionalidades.

## 🛠️ Tecnologías utilizadas

- Java 21
- Programación Orientada a Objetos
- Lombok
- Maven
- Spring Boot
- Visual Studio Code