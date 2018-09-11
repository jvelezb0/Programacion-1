package modelo;

public class Mundo 
{
	Bird br;
	Superman su;
	Airplane ai;
	
	public Mundo()
	{
		br = new Bird();
		su = new Superman();
		ai = new Airplane();
	}

	public Bird getBr() {
		return br;
	}

	public void setBr(Bird br) {
		this.br = br;
	}

	public Superman getSu() {
		return su;
	}

	public void setSu(Superman su) {
		this.su = su;
	}

	public Airplane getAi() {
		return ai;
	}

	public void setAi(Airplane ai) {
		this.ai = ai;
	}
	
	
}
