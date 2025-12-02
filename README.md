#  Sistema de Gestión de Biblioteca

Proyecto integrador de **Programación II (2025)**.  
El objetivo es desarrollar un programa en Java (modo consola) que modele la gestión básica de una biblioteca, aplicando los conceptos de programación estructurada, POO, colecciones y manejo de excepciones.

---

##  **Descripción del Proyecto**

El sistema permite administrar libros y usuarios de una biblioteca, pudiendo realizar las siguientes operaciones:

- Agregar nuevos libros  
- Listar todos los libros disponibles    
- Eliminar o modificar libros  
- Mostrar los libros actualmente prestados  
- Editar la información de un libro existente, con manejo de excepciones personalizadas

---

##  **Estructura del Proyecto**

Biblioteca/  
│  
├── src/  
│ ├── Main.java  
│ ├── modelos/  
│ │ ├── Libro.java  
│ │ └── Usuario.java  
│ ├── servicios/  
│ │ └── BibliotecaService.java  
│ └── excepciones/  
│   └── ElementoNoEncontradoException.java  
│  
└── README.md  

---

---

## **Integrantes del equipo**

| Nombre completo              | Rol / Función principal   | Rama en Git |  
|------------------------------|---------------------------|-------------|  
| Nicolás Daniel Roman Moreno  | Crear métodos y funciones | rama-nicolas|  
| Matias Chazarreta            | Crear métodos y funciones | rama-matias |

---
---
## **Cosas a Agregar o Faltantes**

+ Sin nada que agregar


## **Explicaión del Proyecto**

Este proyecto es un Sistema de Gestión de Biblioteca desarrollado en Java y ejecutado por consola.
El objetivo es permitir administrar libros dentro de una biblioteca de manera ordenada, aplicando programación estructurada, POO, colecciones, excepciones y buenas prácticas con Git.

Primero, tenemos la clase Libro, que representa cada libro del sistema. Contiene la información básica como código, título, autor y stock.
Esta clase hereda de MaterialBiblioteca e implementa la interfaz Identificable, lo que me permite manejar diferentes materiales de forma polimórfica.

Luego, toda la lógica del programa está en BibliotecaService.
Ahí se administra una lista de libros, se controla el stock y se implementan las operaciones principales del sistema, como:

Agregar libros: valida que no haya códigos duplicados. Si el código ya existe, permite elegir si aumentar el stock o ingresar otro código.

Listar libros: muestra todos los libros ordenados por código usando lambdas.

Prestar libros: reduce el stock, guarda el libro en la lista de prestados y, si el stock llega a cero, lo elimina del inventario.

Editar la información de un libro: permite modificar título, autor y stock, e incluye manejo de una excepción personalizada.

Listar libros prestados: muestra los libros que ya fueron prestados.

También incluí una excepción personalizada llamada
ElementoNoEncontradoException, que se usa cuando se intenta modificar un libro que no existe.

Finalmente, en el Main está el menú principal.
Desde ahí el usuario puede elegir cada operación.
El menú usa Scanner, validaciones y un bucle para que el programa funcione de forma continua hasta que el usuario elija salir.