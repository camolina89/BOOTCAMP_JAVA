package cl.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	public static int count = 0 ;
	
	// Constructor Vacio
	public Pokemon() {
		super();
	}

	public Pokemon(String name, int health, String type) {
		super();
		this.name = name;
		this.health = health;
		this.type = type;
		
		count++;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//este metodo reduce la salud del pokemon atacado en 10 puntos
	public  void attackPokemon(Pokemon pokemon) {
		pokemon.health = pokemon.health - 10;
	}
	
	

}
