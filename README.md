# Sistema de Reserva de Citas Médicas

Sistema de gestión de citas médicas desarrollado en Java con interfaz gráfica Swing para la administración de consultorios, médicos, pacientes y agendamiento de citas.

## Descripción

Este es un proyecto del curso de Algoritmo y Estructura de datos I de CIBERTEC. Es un sistema integral de gestión de citas médicas que permite administrar pacientes, médicos, consultorios y el registro de citas.

## Requisitos

- Java JDK 8 o superior
- IDE compatible con proyectos Java (Eclipse, IntelliJ IDEA, NetBeans, o VS Code)

## Estructura del Proyecto

```
proyecto_barberia/
├── src/
│   ├── clases/
│   │   ├── Paciente.java
│   │   ├── Medico.java
│   │   ├── Consultorio.java
│   │   └── Cita.java
│   ├── gui/
|   |   |── Consultorio
|   |   |   |── GUIConsultorio.java
|   |   |   |── GUIMantenimientoConsultorio.java
|   |   |── Medico
|   |   |   |── GUIMedico.java
|   |   |   |── GUIMantenimientoMedico.java
|   |   |── RegistroCitas
|   |   |   |── GUIRegistroCitasAdicionar.java
|   |   |   |── GUIRegistroCitasConsultar.java
│   │   └── MenuPrincipal.java
│   └── img/
└── bin/
```

## Instalación

1. Clona el repositorio:
```bash
git clone https://github.com/byrogr/proyecto-reservas-citas-medicas-g7-cibertec.git
```

2. Abre el proyecto en tu IDE favorito

3. Asegúrate de que el JDK esté configurado correctamente

4. Compila y ejecuta el proyecto desde la clase principal `Menu_Principal.java`

## Ejecución

Para ejecutar el proyecto:

1. Navega hasta la clase `gui.Menu_Principal`
2. Ejecuta el método `main()`
3. Se abrirá la ventana principal del sistema con el menú de opciones

## Desarrollo

Este proyecto fue desarrollado como parte de un proyecto académico en CIBERTEC.

## Funcionalidades

El sistema está diseñado para facilitar:
- Alta, baja y modificación de pacientes
- Registro y gestión de médicos por especialidad
- Control de consultorios disponibles
- Agendamiento de citas médicas
- Consultas y reportes del sistema


## Autor

Desarrollado por estudiantes de CIBERTEC

## Licencia

Este proyecto es de uso académico.
