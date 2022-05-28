package cl.maestros;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard hum1 = new Wizard();
		
		Ninja hum2 = new Ninja();
		
		Samurai hum3 = new Samurai();
		Samurai hum4 = new Samurai();
		
		hum1.attack( hum2);
		
		hum3.attack(hum2);
		
		hum1.heal(hum2);
		hum1.fireBall(hum2);
		
		hum2.stealth(hum1);
		hum2.runAway();
		
		
		hum3.deathBlow(hum2);
		hum3.meditate();
		
		System.out.println(hum3.howMany());
	
		
	}

}
