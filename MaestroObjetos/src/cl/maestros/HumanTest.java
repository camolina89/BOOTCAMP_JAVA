package cl.maestros;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard hum1 = new Wizard();
		
		Ninja hum2 = new Ninja();
		
		Samurai hum3 = new Samurai();
		
		hum1.attack(hum1.getStrength(), hum2);
		
		hum3.attack(hum3.getStrength(), hum2);
	}

}
