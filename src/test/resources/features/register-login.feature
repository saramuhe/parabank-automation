Feature: Registro y login plataforma Parabank

  Scenario: Crear cuenta y loguearse exitosamente
    Given que el usuario ingresa a la pagina de Parabank
    When el usuario se registra con datos validos
    And el usuario inicia sesion con las credenciales registradas
    Then el usuario ingresa correctamente a la plataforma Parabank
