package cl.empresa;

import java.util.Scanner;

public class PitagorasTest {
	
	public void calcularHipotenusa() {
		Scanner sc = new Scanner (System.in);
		Pitagoras pitoTet = new Pitagoras ();
		
	//  Se solicita valor del cateto A y se asigna el valor a la variable a
			System.out.println("Ingrese Valor de Cateto A: ");
			int a = Integer.parseInt(sc.nextLine());
			
			// Se solicita valor del cateto B y se asigna el valor a la variable b
			System.out.println("Ingrese Valor de Cateto B: ");
			int b = Integer.parseInt(sc.nextLine());
			
			double c = pitoTet.calcularHipotenusa(a, b);
			System.out.println("El valor de C es :" + c);
	}
	
}
