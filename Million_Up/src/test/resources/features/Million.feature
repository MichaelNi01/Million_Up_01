
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag1
  Scenario Outline: Crear usuario y hacer login
    Given Abrir navegador e ingresar pagina web
    When Ingresar <usuario> usuario
    When Ingresar <pass> pass
    When Seleccionar pestaña login
    When Ingresar <usuario> usuario
    When Ingresar <pass> pass
    Then Verificar mensaje de exito

    Examples: 
      | usuario| pass 	 |
      | "name1"| "pass1" |
      
  @tag2
  Scenario Outline: Crear usuario y hacer login incorrecto
    Given Abrir navegador e ingresar pagina web
    When Ingresar <usuario> usuario
    When Ingresar <pass> pass
    When Seleccionar pestaña login
    When Ingresar <usuario_incorrecto> usuario
    When Ingresar <pass_incorrecto> pass
    Then Verificar mensaje de falla

    Examples: 
      | usuario| pass 	 | usuario_incorrecto | pass_incorrecto |
      | "name1"| "pass1" | "name2"						| "pass2"					|
    
	@tag3
  Scenario Outline: Validar que no permite crear usuario con longitud muy corta
    Given Abrir navegador e ingresar pagina web
    When Ingresar <usuario> usuario
    When Ingresar <pass> pass
    Then Verificar alerta de error por longitud de usuario muy corta

    Examples: 
      | usuario| pass 	 |
      |"n"     | "pass1" |      

  @tag4
  Scenario Outline: Validar que no permite crear password con longitud muy corta
    Given Abrir navegador e ingresar pagina web
    When Ingresar <usuario> usuario
    When Ingresar <pass> pass
    Then Verificar alerta de error por longitud de password muy corta

    Examples: 
      | usuario| pass 	 |
      |"name1"     | "p" |