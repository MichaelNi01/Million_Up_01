package Chou.Million_Up.steps;

import Chou.Million_Up.Pageobject.Pageobject;

public class pasos {
	
	Pageobject Pageo;
	
	public void abrir_navegador () {
		Pageo.open();
	}
	
	public void ingresar_usuario (String arg1) {
		Pageo.ingresar_usuario(arg1);
	}
	
	public void ingresar_pass (String arg1) throws InterruptedException {
		Pageo.ingresar_pass(arg1);
	}
	
	public void seleccionar_login () {
		Pageo.seleccionar_login();
	}
	
	public void validar_login () {
		Pageo.verificar_login();
	}
	
	public void validar_login_fallido () {
		Pageo.verificar_login_fallido();
	}
	
	public void validar_ventana_emergente_usuario () throws InterruptedException {
		Pageo.verificar_alerta();
	}
	
	public void validar_ventana_emergente_pass () throws InterruptedException {
		Pageo.verificar_alerta_password();
	}

}
