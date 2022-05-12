package cl.empresa.modelo;

import java.util.ArrayList;

public class Sucursal {
	//Atributos
	private String address;
	private ArrayList <Trabajador> listaTrabajadores;
	
	
	public Sucursal(String address, ArrayList<Trabajador> listaTrabajadores) {
		super();
		this.address = address;
		this.listaTrabajadores = listaTrabajadores;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}


	public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}


	@Override
	public String toString() {
		return "Sucursal [address=" + address + ", listaTrabajadores=" + listaTrabajadores + "]";
	}
	
	
	public void sueldos(int sueldo) {
		int contador = 0;
		for (Trabajador list : listaTrabajadores) {
			if (list.getSueldo() > sueldo) {
				contador += 1;
			}
		}
		System.out.println("Hay "+ contador + " trabajador(es) con un sueldo sobre los "+ sueldo + " pesos en la sucursal ubicada en " + address );
	}
	
	
	
	
}
