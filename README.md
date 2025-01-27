## Spring Boot 3: API de Gestión de Pacientes y Médicos

### Descripción
[Descripción concisa del proyecto y su objetivo]

### Tecnologías
* Spring Boot 3
* Java 11
* Spring Security
* JWT
* [Otras tecnologías utilizadas]


### Funcionalidades
* Gestión de pacientes (alta, baja, modificación)
* Gestión de médicos (alta, baja, modificación)
* Reserva de citas
* ...

### Desarrollo
* **Estructura del proyecto:**
  * Controladores
  * Servicios
  * Repositorios
  * Entidades
* **Buenas prácticas:**
  * Manejo de excepciones
  * Seguridad
  * Personalización de respuestas
* **Código de ejemplo:**
  * [Ejemplo de controlador con ResponseEntity]
  * [Ejemplo de @ExceptionHandler]
  * ...

### Seguridad
* Autenticación: JWT
* Autorización: Roles y permisos
* Protección contra:
  * Inyección SQL
  * XSS
  * CSRF

### Documentación
* Swagger UI

### Contribuciones


### Seguridad
* **Autenticación:**
  * Implementación de autenticación basada en tokens JWT.
  * Generación de tokens personalizados con claims específicos (id de usuario, roles).
  * Almacenamiento seguro de la clave secreta utilizada para firmar los tokens.
* **Autorización:**
  * Utilización de roles y permisos para restringir el acceso a los recursos.
  * Configuración de Spring Security para proteger los endpoints.
* **Protección contra vulnerabilidades:**
  * Implementación de filtros para validar los tokens JWT en cada solicitud.
  * Uso de parámetros de entrada escapados para prevenir inyecciones SQL.
  * Protección contra XSS mediante el escape de caracteres especiales en las respuestas.
* **Cifrado:**
  * Cifrado de contraseñas utilizando algoritmos fuertes (bcrypt, Argon2).
