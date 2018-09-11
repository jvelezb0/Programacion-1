package modelo;

public class Superman extends Kryptonian implements Flyer
{
private String dato;
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		String despegar = "despegar";
		return despegar;
	}

	@Override
	public String land() {
		String land  = "puede aterrizar";

		return land;
	}

	@Override
	public String fly() {
		String volar = "puede volar";

		return volar;
	}

	@Override
	public String eat() {
		String comer = "puede comer";

		return comer;
	}
	
	public String leapBuilding()
	{
		String leap = "saltar Edificio";
		return leap;
	}
	
	public String stopBullet()
	{
		String bullet = "Detener balas";
		return bullet;
	}
	
	public String datosSu()
	{	
		dato =" " + takeOff()+ ", "+ land() +", "+ fly() +", "+ eat() +", "+ leapBuilding() +", "+ stopBullet();
		return dato;
	}
}
