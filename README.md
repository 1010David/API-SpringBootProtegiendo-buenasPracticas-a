📝 Spring Boot 3: Mejores Prácticas y Seguridad para una API REST
Este repositorio contiene ejemplos y prácticas implementadas durante el curso "Spring Boot 3: aplique las mejores prácticas y proteja una API Rest". A continuación, se describen los conceptos y técnicas aprendidos en las diferentes secciones del curso.

🛠️ Personalización de respuestas con ResponseEntity
En esta sección, aprendiste a:

Usar la clase ResponseEntity de Spring para personalizar los retornos de los métodos en una clase Controller.
Modificar el código HTTP devuelto en las respuestas de la API.
Agregar encabezados personalizados a las respuestas de la API.
Utilizar los códigos HTTP más apropiados para cada operación realizada en la API.
Ejemplo de código:

java
Copiar código
@GetMapping("/example")
public ResponseEntity<String> exampleEndpoint() {
    return ResponseEntity.status(HttpStatus.OK)
                         .header("Custom-Header", "CustomValue")
                         .body("Respuesta personalizada");
}
⚠️ Manejo de excepciones con @RestControllerAdvice
En esta sección, aprendiste a:

Crear una clase para aislar el manejo de excepciones usando @RestControllerAdvice.
Utilizar @ExceptionHandler para capturar excepciones específicas.
Manejar errores 404 (Not Found) y 400 (Bad Request) para errores de validación de Bean Validation.
Simplificar el JSON devuelto en casos de error de validación.
Ejemplo de código:

java
Copiar código
@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
🔐 Autenticación y autorización con Spring Security
En esta sección, aprendiste a:

Agregar Spring Security al proyecto.
Comprender el proceso de autenticación y autorización en una API REST.
Implementar autenticación Stateless usando configuraciones de Spring Security.
Ejemplo de configuración:

java
Copiar código
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http.csrf(csrf -> csrf.disable())
               .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
               .httpBasic(withDefaults())
               .build();
}
🏷️ Generación de tokens con java-jwt
En esta sección, aprendiste a:

Agregar la biblioteca Auth0 java-jwt como dependencia del proyecto.
Utilizar esta biblioteca para generar tokens JWT.
Inyectar propiedades del archivo application.properties usando @Value.
Devolver un token JWT al autenticar un usuario.
Ejemplo de generación de token:

java
Copiar código
public String generateToken(String username) {
    return JWT.create()
              .withSubject(username)
              .withExpiresAt(new Date(System.currentTimeMillis() + 86400000)) // 1 día
              .sign(Algorithm.HMAC256(secret));
}
🛡️ Implementación de filtros con OncePerRequestFilter
En esta sección, aprendiste a:

Entender cómo funcionan los Filters en una solicitud HTTP.
Implementar un Filter extendiendo de OncePerRequestFilter.
Utilizar java-jwt para validar tokens recibidos en la API.
Realizar autenticación de la solicitud con SecurityContextHolder.
Restringir o permitir solicitudes según la URL y el verbo HTTP.
Ejemplo de filtro:

java
Copiar código
public class JwtAuthFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("Authorization");
        if (token != null && validateToken(token)) {
            SecurityContextHolder.getContext().setAuthentication(getAuthentication(token));
        }
        filterChain.doFilter(request, response);
    }
}
📚 Resumen del Aprendizaje
Durante este curso, adquiriste habilidades clave para proteger y mejorar una API REST con Spring Boot 3:

Personalización de respuestas con ResponseEntity.
Manejo avanzado de excepciones con @RestControllerAdvice y @ExceptionHandler.
Seguridad y autenticación con Spring Security y JWT.
Implementación de filtros para validar solicitudes de manera eficiente.
🚀 Próximos Pasos
Aplicar estas técnicas en proyectos reales.
Mejorar continuamente tus APIs con buenas prácticas y seguridad avanzada.
Explorar más sobre testing con JUnit para garantizar la calidad del código.
