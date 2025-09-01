# Reto de Automatización Encora

## Descripción

Este proyecto automatiza el flujo de registro e inicio de sesión de usuarios en la plataforma Parabank utilizando **Serenity Screenplay + Cucumber en Java**.  
Con diseño modular, Tasks, Questions y UI reutilizables, así como el uso de Faker para generar datos aleatorios en español.

---

## 📂 Estructura del Proyecto
```
src
├── main
│   └── java
│       ├── app.parabank.models         # Modelos de datos
│       ├── app.parabank.tasks          # Tareas Screenplay
│       ├── app.parabank.questions      # Questions Screenplay
│       └── app.parabank.ui             # User Interface            
|       └── app.parabank.utils          # Utilidades
└── test
    ├── java
    │   ├── drivers                     # Drivers personalizados
    │   └── stepdefinitions             # Step Definitions 
    |   └── runners                     # Runner
    └── resources
        └── features                    # Archivos .feature (Gherkin)
```

---

## 🛠️ Tecnologías

- Java 17+
- Serenity BDD (`4.1.14`)
- Cucumber (`7.14`)
- Selenium WebDriver (`4.19`)
- Java Faker (para generar nombres y direcciones en español)
- Gradle para manejo de dependencias y build
- JUnit como runner de tests

---

## 🚦 Flujo de Prueba

**Escenario: Registro e inicio de sesión exitoso**

1. Abrir la página principal de Parabank.
2. Registrar un nuevo usuario con datos aleatorios generados por Faker en español.
3. Validar mensaje de registro exitoso:  
   `"Welcome <username>"`
4. Cerrar sesión (Logout).
5. Iniciar sesión con las credenciales guardadas durante el registro.
6. Validar que el mensaje de bienvenida en el panel izquierdo contiene **FirstName LastName**.

---

## 📝 Feature

```gherkin
Feature: Registro y login plataforma Parabank
  Scenario: Crear cuenta y loguearse exitosamente
    Given que el usuario ingresa a la pagina de Parabank
    When el usuario se registra con datos validos
    And el usuario inicia sesion con las credenciales registradas
    Then el usuario ingresa correctamente a la plataforma Parabank
```

---

## 🔑 Implementaciones Clave

### Tasks
- **OpenPage**: Abre la URL de Parabank.
- **RegisterUser**: Completa el formulario de registro y recuerda username, password y firstName.
- **LoginUser**: Usa las credenciales guardadas para iniciar sesión.
- **LogoutUser**: Hace clic en el enlace de logout.

### Questions
- **LoginMessage**: Obtiene el mensaje de bienvenida en el panel izquierdo después del login.
- **RegisterMessage**: Obtiene el mensaje de bienvenida en el panel derecho después del registro.

### UI
Cada sección de la página tiene su propia clase UI con los Target locators.

## 🌍 Configuración de Drivers

Se implementaron **drivers personalizados** para ejecutar los tests en **Chrome, Firefox y Edge**:

- `CustomChromeDriver`
- `CustomFirefoxDriver`
- `CustomEdgeDriver`

Cada driver abre el navegador en **modo incógnito/privado** y con notificaciones bloqueadas.

Configuración en `serenity.conf`:

```hocon
serenity {
  webdriver {
    driver = chrome   # Navegador por defecto
    chrome.driver = drivers.CustomChromeDriver
    firefox.driver = drivers.CustomFirefoxDriver
    edge.driver = drivers.CustomEdgeDriver
  }
}
```
## ▶️ Ejecución de pruebas
- `Por defecto (Chrome):` 
    ```bash
    ./gradlew clean test aggregate
    ```
- `Firefox:`
    ```bash
    ./gradlew clean test aggregate -Dwebdriver.driver=firefox
    ```
- `Edge:`
    ```bash
    ./gradlew clean test aggregate -Dwebdriver.driver=edge
    ```
## 📊 Reportes

Serenity genera automáticamente:

- `target/site/serenity/index.html` → Reporte HTML completo.
- `target/parabank-cucumber.json` → Reporte JSON.
- `target/parabank-cucumber-results.xml` → Reporte JUnit XML.

---

