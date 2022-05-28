package cl.maestros;

public class Samurai extends Human {
	private Integer health = 200;
	private Integer contador = 0;

	

	public Samurai() {
		super();
		howMany();
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	
	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	//Metodo par que el samurai asesine al oponente pero reduce su vida a la mitad
	public void deathBlow(Human victima) {
		victima.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println("Samurai uso Muerte Subita, el enemigo murio pero la vida del samurai bajo a la mitad, quedo en "+ this.getHealth());
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
		System.out.println("Samurai practicó Yoga, su vida subió a "+this.getHealth());
	}
	
	public String howMany() {
		contador ++;
		return "Cantidad de Samurai: " +contador;
	}
	
}
