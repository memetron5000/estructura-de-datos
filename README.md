# Guía del Sistema de Gestión de Empleados

Requisitos y funcionalidades del sistema de gestión de empleados, abarcando la carga de datos, autenticación de usuarios, gestión de cuentas, y manejo de mensajería interna.

## 1. Carga de Empleados desde Archivo

- **Archivo**: `Empleados.txt`
- **Descripción**: Contiene la información personal y de contacto de cada empleado.
- **Estructura del Archivo**:
    - **Nombre Completo**
    - **Cédula de Ciudadanía**
    - **Fecha de Nacimiento**
    - **Ciudad de Nacimiento**
    - **Teléfono**
    - **Correo Electrónico**
    - **Dirección**:
        - Calle
        - Nomenclatura
        - Barrio
        - Ciudad
        - Urbanización
        - Número de Apartamento
- **Funcionalidad**: Al iniciar el sistema, se debe cargar automáticamente la información de los empleados desde este archivo.

## 2. Organización de Empleados

- **Criterio de Organización**: Número de Identificación (Cédula de Ciudadanía).
- **Funcionalidad**: Los empleados se mantienen ordenados en la colección de usuarios según su número de identificación, de menor a mayor. Al agregar un nuevo empleado, el sistema reorganiza automáticamente la colección.

## 3. Autenticación de Usuarios

- **Archivo**: `Password.txt`
- **Descripción**: Almacena las contraseñas de los usuarios junto con su rol en el sistema.
- **Estructura del Archivo**:
    - **Cédula de Ciudadanía**
    - **Contraseña**
    - **Rol**: "empleado" o "administrador"
- **Proceso de Autenticación**:
    1. El usuario ingresa su cédula y contraseña.
    2. El sistema verifica la información en el archivo `Password.txt`.

## 4. Funcionalidades del Administrador

El usuario con rol de "administrador" tiene las siguientes funcionalidades adicionales:

| Funcionalidad         | Descripción                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| **Registrar Usuarios** | Añadir nuevos empleados al sistema.                                          |
| **Cambiar Contraseñas**| Modificar la contraseña de cualquier usuario.                                |
| **Eliminar Usuarios**  | Eliminar empleados del sistema.                                              |
| **Consistencia**       | Al realizar cambios, actualizar los archivos `Empleados.txt` y `Password.txt`.|

## 5. Funcionalidades del Empleado

El usuario con rol de "empleado" tiene acceso a las siguientes funcionalidades:

- **Revisar Bandeja de Entrada**
- **Enviar Mensajes a Otros Usuarios**

## 6. Bandeja de Entrada

- **Estructura**: Cada mensaje incluye:
    - Fecha de recepción
    - Título del mensaje
    - Nombre del remitente
- **Funcionalidad**:
    - Presentar la lista de mensajes recibidos.
    - Permitir la selección de un mensaje específico para su lectura.
- **Sugerencia de Implementación**: Usar una lista doble para la bandeja de entrada.

## 7. Redacción de Mensajes

- **Información Solicitada**:
    - Cédula del destinatario
    - Título del mensaje
    - Contenido del mensaje
- **Automatización**: El sistema asigna automáticamente la fecha y hora de envío a cada mensaje.

## 8. Envío de Mensajes

- **Proceso**: Al enviar un mensaje, el sistema lo añade a la bandeja de entrada del destinatario correspondiente.

## 9. Almacenamiento de Mensajes

- **Archivo de Almacenamiento**:
    - Los mensajes se guardan en archivos de texto, nombrados con la cédula del empleado seguida por "BA" (Bandeja de Entrada).
    - **Ejemplo**: `12345678BA.txt`
