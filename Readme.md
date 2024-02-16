## Calculadora Servidor en Java

Esta aplicación Java implementa una calculadora servidor que ofrece servicios remotos para operaciones matemáticas. Utiliza sockets para la comunicación con clientes, gestionando solicitudes de operandos, realizando cálculos y enviando resultados de manera eficiente.

### Uso

1. **Esperar Conexión:**
   - La aplicación espera la conexión de clientes en la dirección IP "192.168.0.10" y el puerto 6666.

2. **Enviar Opciones de Operación:**
   - Proporciona al cliente las opciones de operaciones matemáticas disponibles (suma, resta, multiplicación, división).

3. **Obtener Operando y Números:**
   - Recibe el tipo de operación y los operandos del cliente.

4. **Realizar Cálculo:**
   - Ejecuta el cálculo según la operación y envía el resultado al cliente.

5. **Continuación de Operaciones:**
   - Determina si el cliente desea realizar más operaciones.

### Configuración

- Asegúrate de tener una conexión de red estable.
- Modifica la dirección IP y el puerto en el método `waitingConnection` según sea necesario.

### Requisitos

- Java Development Kit (JDK)

### Ejecución

1. Compila el código.
2. Ejecuta la aplicación del servidor.
3. Espera la conexión de clientes y realiza operaciones matemáticas remotas.

Este proyecto es parte del esfuerzo por alcanzar la "33". ¡Vamos a por ello!
