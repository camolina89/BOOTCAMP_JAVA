package cl.zoo;

public class BatTest {

	public static void main(String[] args) {
		
		Bat batman = new Bat();
		batman.setEnergyLevel(300);
		
		// bat ataca a la ciudad 3 veces
		batman.attackTown();
		batman.attackTown();
		batman.attackTown();
		// bat come 2 humanos
		batman.eatHumans();
		batman.eatHumans();
		
		// bat vuela dos veces
		batman.fly();
		batman.fly();
		batman.displayEnergy();
	}

}
