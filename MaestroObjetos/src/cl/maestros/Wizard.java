package cl.maestros;

public class Wizard extends Human {
	private Integer health = 50;
	private Integer intelligence = 8;
	
	public Wizard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	
	//metodo para que el mago use sanar 
	public void heal(Human paciente) {
		paciente.setHealth(paciente.getHealth()+this.getIntelligence());
		System.out.println("Wizard uso Curación, sano " + this.getIntelligence()  +" de salud, La vida del amigo subio a "+ paciente.getHealth());
	}
	//metodo para que el mago use Bola de fuego
	public void fireBall(Human enemigo) {
		enemigo.setHealth(enemigo.getHealth()-(this.getIntelligence()*3));
		System.out.println("Wizard uso FireBall, el daño es de "+ this.getIntelligence()*3 +"  la vida del enemigo quedo en "+ enemigo.getHealth() );
	}
	
	
	
	
}
