# Llanquihue Tour - Gestión de Tours

## Descripción

Sistema básico de gestión de tours para la agencia de turismo Llanquihue Tour
(Región de Los Lagos), desarrollado en Java. Su propósito es reemplazar la gestión
manual del catálogo por un programa que lee los tours desde un archivo de texto,
los almacena en una colección y permite recorrerlos y filtrarlos.

## Estructura del proyecto

```
llanquihue-tour/
├── src/
│   ├── data/
│   │   └── GestorDatos.java
│   ├── model/
│   │   └── Tour.java
│   └── ui/
│       └── Main.java
├── resources/
│   └── tours.txt
└── README.md
```

## Clases implementadas

| Paquete | Clase | Descripción |
|---|---|---|
| `model` | `Tour` | Representa un tour. Contiene nombre, tipo y precio. |
| `data` | `GestorDatos` | Lee `tours.txt` línea por línea, separa los datos con `split(";")` y retorna un `ArrayList<Tour>`. |
| `ui` | `Main` | Muestra el catálogo completo y filtra los tours de aventura. |

## Archivo de datos

El archivo `resources/tours.txt` tiene un tour por línea, con el formato
`nombre;tipo;precio` y sin espacios entre los campos:

```
Paseo Lacustre;Aventura;15000
```

## Funcionamiento

- **Lectura:** `GestorDatos` convierte cada línea del archivo en un objeto `Tour`.
- **Colección:** los objetos se almacenan en un `ArrayList`.
- **Recorrido y filtrado:** `Main` recorre la lista y muestra solo los tours de tipo "Aventura".

## Cómo compilar y ejecutar

Desde la carpeta raíz del proyecto:

```
javac -d out src/model/*.java src/data/*.java src/ui/*.java
java -cp out ui.Main
```

Requiere tener instalado JDK 17 o superior.

## Autora

Natalie Duchens - Desarrollo Orientado a Objetos, Duoc UC