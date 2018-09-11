package vista;

import javax.swing.JOptionPane;

import modelo.Superman;

public class Interfaz 
{
	public void imprimirResultado(Object object)
	{
		String cadena = "";
		cadena = "Superman puede" + object;
		
		escribirResultado(cadena);
	}
	
	public void imprimirResultado1(Object object)
	{
		String cadena1 = "";
		cadena1 = "El aeroplano puede"+ object;
		
		escribirResultado1(cadena1);
	}
	
	public void imprimirResultado2(Object object)
	{
		String cadena2 = "";
		cadena2 = "El pajaro puede"+ object;
		
		escribirResultado2(cadena2);
	}
	public void escribirResultado(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena, "", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirResultado1(String cadena1)
	{
		JOptionPane.showMessageDialog(null, cadena1, "", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirResultado2(String cadena2)
	{
		JOptionPane.showMessageDialog(null, cadena2, "", JOptionPane.INFORMATION_MESSAGE);
	}


}
