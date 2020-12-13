package Chou.Million_Up.definitions;

import Chou.Million_Up.Pageobject.Pageobject;
import Chou.Million_Up.steps.pasos;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Definitions {
	
	@Steps
	pasos steps;
	
	@Given("^Abrir navegador e ingresar pagina web$")
	public void abrir_navegador_e_ingresar_pagina_web() {
	   steps.abrir_navegador();
	    
	}


	@When("^Ingresar \"([^\"]*)\" usuario$")
	public void ingresar_usuario(String arg1) {
	    steps.ingresar_usuario(arg1);
	
	}
	
	

	@When("^Ingresar \"([^\"]*)\" pass$")
	public void ingresar_pass(String arg1) throws InterruptedException {
	    steps.ingresar_pass(arg1);
	   
	}
	
	@When("^Seleccionar pestaña login$")
	public void seleccionar_pestaña_login() {
		steps.seleccionar_login();
	}

	@Then("^Verificar mensaje de exito$")
	public void verificar_mensaje_de_exito() {
		steps.validar_login();
	}
	
	@Then("^Verificar mensaje de falla$")
	public void verificar_mensaje_de_falla() {
		steps.validar_login_fallido();
	}
	
	@Then("^Verificar alerta de error por longitud de usuario muy corta$")
	public void verificar_alerta_de_error_por_longitud_de_usuario_muy_corta() throws InterruptedException {
	   steps.validar_ventana_emergente_usuario();
	}
	
	@Then("^Verificar alerta de error por longitud de password muy corta$")
	public void verificar_alerta_de_error_por_longitud_de_password_muy_corta() throws InterruptedException {
	   steps.validar_ventana_emergente_pass();
	}

}
