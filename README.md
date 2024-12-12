📝 Spring Boot 3: Mejores Prácticas y Seguridad para una API REST
Este README documenta los conceptos y técnicas aplicadas en el proyecto de gestión de pacientes y médicos, implementando buenas prácticas y medidas de seguridad con Spring Boot 3.

🛠️ Personalización de respuestas con ResponseEntity
Personalización de los retornos en los métodos Controller.
Modificación de los códigos HTTP devueltos en las respuestas.
Inclusión de encabezados personalizados.
Uso de los códigos HTTP adecuados para cada operación.

⚠️ Manejo de excepciones con @RestControllerAdvice

Centralización del manejo de excepciones con @RestControllerAdvice.
Captura de excepciones específicas con @ExceptionHandler.
Manejo de errores 404 (Not Found) y 400 (Bad Request) para validaciones.
Simplificación del JSON de respuestas en casos de error.

🔐 Autenticación y autorización con Spring Security

Integración de Spring Security en el proyecto.
Implementación de autenticación Stateless.
Configuración de autorizaciones para proteger los endpoints de la API.

🏷️ Generación de tokens con java-jwt

Uso de la biblioteca Auth0 java-jwt para generar tokens JWT.
Inyección de propiedades desde application.properties con @Value.
Generación y retorno de tokens al autenticar usuarios.

🛡️ Implementación de filtros con OncePerRequestFilter
Implementación de Filters para procesar las solicitudes HTTP.
Validación de tokens JWT en cada solicitud.
Autenticación mediante SecurityContextHolder.
Restricción y liberación de accesos según URL y método HTTP.

📚 Resumen del Aprendizaje

Este proyecto aplica las mejores prácticas y seguridad en una API REST con Spring Boot 3, cubriendo:

Personalización de respuestas con ResponseEntity.
Manejo centralizado de excepciones.
Autenticación y autorización con Spring Security y JWT.
Validación de solicitudes mediante filtros personalizados.
