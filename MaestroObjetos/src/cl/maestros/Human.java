package cl.maestros;

public class Human {
	private Integer strength = 3 ;
	private Integer intelligence = 3;
	private Integer stealth = 3;
	private Integer health = 100;
	
	public Human() {
		super();
	}

	public Human(Integer strength, Integer intelligence, Integer stealth, Integer health) {
		super();
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
	}
	
	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	
	public void attack(int daño, Human enemigo) {
		enemigo.setHealth(enemigo.getHealth()-daño);
		System.out.println("Atacaste al enemigo con "+ daño +" de daño, su vida es "+ enemigo.getHealth() +".");
	}
	
	
}
