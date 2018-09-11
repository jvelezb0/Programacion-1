package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	Mundo bd;
	Interfaz gui;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new Interfaz();
		
		gui.imprimirResultado(bd.getSu().datosSu());		
		gui.imprimirResultado1(bd.getAi().datosAi());
		gui.imprimirResultado2(bd.getBr().datosBr());
	}
	
}
