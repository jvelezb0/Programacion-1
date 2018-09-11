package modelo;

public class Bird extends Animal implements Flyer
{
private String dato;
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		String despear = "Puede despegar";
		return despear;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		String land = "Puede aterrizar";
		return land;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		String volar = "Puede volar";
		return volar;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		String comer  = "Puede comer";
		return comer;
	}
	
	public String datosBr()
	{
		dato = " "+ land() + "," +fly() + ","+ eat();
		return dato;
		
	}
}
