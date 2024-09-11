Feature: Completar el formulario 10 veces exitosamente

  Scenario: El usuario completa el formulario y obtiene el hash de éxito
    Given el usuario está en la página de login
    When el usuario inicia sesión con sus credenciales
    And el usuario completa el formulario correctamente
    And repite el proceso por 10 ciclos
    Then el usuario debe obtener el hash de éxito