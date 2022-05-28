package cl.maestros;

public class Ninja extends Human {
	private Integer stealth = 10;
	

	public Ninja() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getStealth() {
		return stealth;
	}


	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}


	//Metodo par robar (sumar) vida al ninja y desontar la vida de otro 
	public void stealth(Human victima) {
		victima.setHealth(victima.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println("Ninja uso Sigilo de " + this.getStealth()+", la vida del Ninja subio a "+this.getHealth()+", y la "+
			 "vida de la victima se quedo en "+victima.getHealth());
	}
	
	//metodo para huir del Ninja pero reduce la vida
	public void runAway() {
		this.setHealth(this.getHealth()-10);
		System.out.println("Ninja a escapado a salvo pero no sano, su vida quedo en " + this.getHealth());
	}
	

}
