# Parcial E2: Aplicación de Gestión de Eventos

Esta es una aplicación sencilla para gestionar eventos. Permite a los usuarios visualizar una lista de eventos existentes y añadir nuevos eventos mediante un formulario intuitivo.

---

## Funcionalidades

### 1. **Visualización de eventos**
- La pantalla principal muestra una lista de eventos con información básica, incluyendo:
  - Nombre del evento.
  - Descripción breve.
  - Precio.

### 2. **Creación de nuevos eventos**
- Al hacer clic en el ícono **+** en la barra superior, el usuario es redirigido a un formulario donde puede registrar un nuevo evento.
- El formulario permite capturar los siguientes datos:
  - Nombre del evento.
  - Descripción.
  - Ubicación.
  - Precio.
  - Fecha.
  - Aforo (capacidad máxima).

---

## Diseño de la interfaz

- **Pantalla principal:** 
  - Muestra una lista de eventos en formato de tarjeta, con un diseño limpio y minimalista.
  - Incluye un ícono de acción flotante para agregar nuevos eventos.

- **Formulario de creación de eventos:**
  - Diseñado con un enfoque en la simplicidad.
  - Organizado con campos de texto para cada dato del evento.
  - Incluye botones para guardar los datos o cerrar el formulario.

---

## Uso

1. **Visualizar eventos existentes:**
   - Al abrir la aplicación, se cargará automáticamente una lista de eventos ficticios como ejemplo.

2. **Añadir un evento:**
   - Haz clic en el ícono **+** en la barra superior.
   - Completa el formulario con los datos del nuevo evento.
   - Pulsa el botón **Guardar** para registrar el evento (se imprimirá en consola como demostración).

3. **Cerrar el formulario:**
   - Haz clic en el botón **Cerrar** para regresar a la lista de eventos.

---

## Requisitos

- **Android SDK**: Compatible con Android 5.0 (API nivel 21) o superior.
- **Entorno de desarrollo**: Android Studio con soporte para Compose.

---

## Futuras mejoras

- Implementar una base de datos local para almacenar los eventos creados.
- Añadir validación de los campos del formulario (ejemplo: verificar que el precio sea un valor numérico).
- Mostrar los eventos registrados en la lista principal en lugar de imprimirlos en consola.
- Añadir soporte para eliminar o editar eventos existentes.

---

## Autor

Aplicación desarrollada como parte de un proyecto práctico en Android con Jetpack Compose. 
