#Conversor de Monedas :tw-1f4b4: :tw-1f4b5: :tw-1f4b6: :tw-1f4b7: :tw-1f4b8:

###Descripción 
Este proyecto consiste en un Conversor de Monedas elaborado en Java, que permite la conversión de diversas monedas mediante el uso de una API **(ExchangeRate-API)** que ofrece tasas de cambio actualizadas en tiempo real. El conversor es capaz de enviar solicitudes a la API, procesar la respuesta en formato JSON y presentar los resultados de forma clara y eficiente a los usuarios. Además, la aplicación mantiene un registro de las conversiones realizadas, anotando la fecha y hora de cada operación, facilitando así el seguimiento histórico de las mismas.

###  Tecnologías Empleadas
Lenguaje de Programación: Java
API de Conversión de Monedas: Utiliza una API que proporciona tasas de cambio en tiempo real, permitiendo calcular conversiones entre diferentes monedas.
Librería Gson: Se utilizó Gson para deserializar las respuestas JSON de la API en objetos manipulables en Java.
Gestión de Versiones: Se empleó Git/GitHub para el manejo de versiones y colaboración en el desarrollo del proyecto.
Entorno de Desarrollo Integrado: IntelliJ IDEA.

###Clases y Funciones
**Main.java**
Es el punto de entrada del programa, encargado de la interacción con el usuario a través de la consola. Ofrece un menú de opciones y administra las solicitudes de conversión de divisas.

**ConsultaMoneda.java**
Clase dedicada a enviar peticiones a la API externa para adquirir las tasas de cambio actuales entre monedas.

**ConversorDeMoneda.java**
Esta clase administra la lógica de conversión de monedas, incluyendo métodos para almacenar y convertir valores monetarios, así como para recuperar respuestas de la API.

**GeneradorDeArchivo.java**
Responsable de almacenar el historial de consultas en un archivo de texto, manteniendo un registro accesible de todas las operaciones realizadas.

### Acceso al Proyecto
Para acceder al proyecto tendras que descargar el repositorio de github y abrirlo desde Intellij IDEA.


###Desarrollado por
**Erick Gonzalez **
