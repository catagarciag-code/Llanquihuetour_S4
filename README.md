
![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# LlanquihueTour_S4 🏔️ Gestión de Tours Turísticos

Proyecto desarrollado en Java (Java Application) para la gestión y filtrado de servicios turísticos de la agencia **Llanquihue Tour**, procesando datos almacenados en archivos planos.

---
---

## 👤 Autora

- **Nombre completo:** Catalina García Santana
- **Sección:** PRY220
- **Carrera:** Analista Programador Computacional
- **Sede:** Duoc UC Online
  
---

## 📋 Descripción del Proyecto

La aplicación **LlanquihueTour** lee información sobre tours desde un archivo plano de texto (`tours.txt`), mapea cada registro a objetos del modelo `Tours` y los almacena dinámicamente en una colección (`ArrayList`). Posteriormente, permite recorrer la lista y realizar filtrados según criterios específicos (como el tipo o categoría de tour).

---

## 📁 Estructura del Proyecto

El proyecto está organizado en paquetes según la arquitectura modular solicitada:

```text
Llanquihuetour_S4/
├── README.md
└── src/
    ├── data/
    │   └── GestorDatos.java        # Lectura de archivo plano y poblamiento del ArrayList
    ├── model/
    │   └── Tours.java              # Clase modelo con atributos (nombre, tipo, precio)
    ├── resources/
    │   └── tours.txt               # Archivo de datos estructurado (Nombre;Tipo;Precio)
    └── ui/
        └── LlanquihueTour.java     # Clase principal (Main) que ejecuta la carga y filtros
```
---
# 💻 Requisitos y Ejecución
Lenguaje: Java (JDK 17 o superior)
IDE Recomendado: NetBeans / IntelliJ IDEA

Pasos para ejecutar: 
* Clonar o descargar el repositorio.
* Abrir el proyecto.
* Ejecutar la clase principal LlanquihueTour.java localizada en el paquete ui.
---
