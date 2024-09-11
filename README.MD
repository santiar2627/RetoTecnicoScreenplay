Proyecto de Automatización con Serenity BDD y Screenplay
Este proyecto es una prueba de automatización utilizando Serenity BDD, Cucumber, Gradle, y el patrón Screenplay. La prueba consiste en automatizar el llenado de un formulario web en una página de login y repetirlo durante 10 ciclos. Al final, se debe obtener un hash de éxito como validación.

Tecnologías Utilizadas
Serenity BDD: Framework para automatización de pruebas que permite generar informes detallados.
Cucumber: Para definir escenarios de prueba en lenguaje Gherkin.
Gradle: Sistema de construcción para la gestión de dependencias y ejecución de pruebas.
Screenplay Pattern: Un patrón de diseño que ayuda a estructurar pruebas de forma escalable y mantenible.
Selenium WebDriver: Para la interacción con el navegador (en este caso, Chrome).
Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de tener instaladas las siguientes herramientas en tu sistema:

Java Development Kit (JDK) - versión 11 o superior.
Gradle - versión 6 o superior.
Chrome - Última versión estable.
ChromeDriver - Compatible con la versión de Chrome instalada.
Git - Para clonar el repositorio.
Instalación de Dependencias
Clonar el repositorio:

bash
Copiar código
git clone https://github.com/santiar2627/RetoTecnicoScreenplay
cd nombre_del_proyecto
Configurar ChromeDriver:

Descarga el ChromeDriver compatible con tu versión de Chrome.
Asegúrate de que chromedriver esté disponible en tu variable de entorno PATH, o coloca el archivo en el directorio raíz del proyecto.
Instalar dependencias con Gradle:

bash
Copiar código
./gradlew clean build
Estructura del Proyecto
El proyecto sigue el patrón de diseño Screenplay y está estructurado de la siguiente manera:

bash
Copiar código
src
├── main
│   └── java
│       └── screenplay
│           ├── tasks             # Tareas como LogIn y CompleteForm
│           ├── questions         # Preguntas como SuccessHash
│           ├── user_interface    # Page Objects como LoginPage y ResultPage
└── test
└── java
└── screenplay
├── stepdefinitions   # Definición de pasos de Cucumber
└── runners           # Runners de Cucumber para ejecutar los escenarios
└── resources
└── features                  # Escenarios de Cucumber en formato Gherkin
Directorios Importantes
tasks: Contiene las tareas que los actores deben realizar, como navegar a la página de login y completar el formulario.
questions: Contiene las preguntas que los actores hacen para verificar resultados, como el hash de éxito.
user_interface: Contiene los localizadores de los elementos de la interfaz de usuario, como los campos de login y el campo del hash de éxito.
stepdefinitions: Implementación de los pasos definidos en los archivos .feature.
runners: Archivos que ejecutan los escenarios definidos en los archivos .feature.