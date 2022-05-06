package cl.cris;

import java.util.ArrayList;
import java.util.Collections;

public class BasicJava {
	
	public void contarDosCincoCinco () {
		
		for (int i = 1; i <=255 ; i++) {			
			System.out.println(i);
		}
		
	}
	
	public void soloImpares() {
		for (int i = 1; i <= 255; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public void contarSumarDosCincoCinco() {
		int suma = 0;
		for(int i = 1; i<= 255; i++) {
			suma += i;
			System.out.println("Nuevo número:"+ i + " Suma: "+ suma);
		}
	}
	
	public void recorrerArray() {
		int[] arreglox = {1,3,5,7,9,13};
		for (int i=0; i<arreglox.length; i++) {
			System.out.println(arreglox[i]);
		}		
	}
	
	public ArrayList<Integer> encontrarMax(ArrayList<Integer> arr2){
		System.out.println(Collections.max(arr2));
		return arr2;
	}

	public void promediar(Integer[] arrayDos) {
		double contador = 0;
		int suma = 0;
		for (int i=0 ; i<arrayDos.length; i++) {
			suma += arrayDos[i];
			contador += 1;
		}
		double promedio = suma/contador;
		System.out.println("Promedio de: "+ promedio );
	}

	public void arregloImpar() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i<=255; i++) {
			if(i%2!=0) {
				y.add(i);
			}
		}
		System.out.println(y);
		
	}

	public void arregloY(Integer[] arrayTres) {
		int contador = 0;
		int y = 3;
		for(int i = 0; i < arrayTres.length; i++) {
			if(arrayTres[i] > y) {
				contador += 1;
			}
		}
		System.out.println(contador);
		
	}
	
	
	
}
