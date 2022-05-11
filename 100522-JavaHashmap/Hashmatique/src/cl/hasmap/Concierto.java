package cl.hasmap;

import java.util.HashMap;
import java.util.Set;

public class Concierto {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Gimme Tha Power", "La policia te esta estorcionando...");
		trackList.put("Hit Me", "Cuando chico queria ser como superman...");
		trackList.put("Frijolero", "You ya estouy hasta la maudre de que mei pongan sombrerou...");
		trackList.put("Marciano", "Me convierto en marciano uuoh oh oh! no se ni como me llamo... ");
		
		Set<String> keys = trackList.keySet();
		for (String key : keys) {
			System.out.print(key+": ");
			System.out.println(trackList.get(key));
		}
		
		String lyrics = trackList.get("Frijolero");
		System.out.println("Letra de la Cancion: "+lyrics);
		

	}

}
