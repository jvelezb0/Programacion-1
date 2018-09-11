package modelo;

public class Airplane extends Vehicle implements Flyer
{
	private String dato;
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		String despegar = "Puede despegar";
		return despegar;
	}

	@Override
	public String land() {
		String aterrizar = "Puede aterrizar";
		return aterrizar;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		String volar = "Puede volar";
		return volar;
	}
	
	public String datosAi()
	{
		dato = " "+takeOff() +","+ land() + "," +fly();
		
		return dato;	
	}
	
}
