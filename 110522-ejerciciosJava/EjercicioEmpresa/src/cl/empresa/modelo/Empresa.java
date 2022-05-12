package cl.empresa.modelo;

import java.util.ArrayList;

public class Empresa {
	//Atributos
	private String nameEmpresa;
	private ArrayList <Sucursal> listaSucursales;
	
	//Constructor
	public Empresa(String nameEmpresa, ArrayList<Sucursal> listaSucursales) {
		super();
		this.nameEmpresa = nameEmpresa;
		this.listaSucursales = listaSucursales;
	}

	public String getNameEmpresa() {
		return nameEmpresa;
	}

	public void setNameEmpresa(String nameEmpresa) {
		this.nameEmpresa = nameEmpresa;
	}

	public ArrayList<Sucursal> getListaSucursales() {
		return listaSucursales;
	}

	public void setListaSucursales(ArrayList<Sucursal> listaSucursales) {
		this.listaSucursales = listaSucursales;
	}

	@Override
	public String toString() {
		return "Empresa [nameEmpresa=" + nameEmpresa + ", listaSucursales=" + listaSucursales + "]";
	}
	
	
	public void cuantasSucursales() {
		int cantidadSucursal = listaSucursales.size();
		System.out.println("Esta empresa tiene " + cantidadSucursal + " sucursal(es)");
	}
	
	
	public void cuantosTrabajadores() {
		int contador = 0;
		for(Sucursal listSucu : listaSucursales) {			
			contador += listSucu.getListaTrabajadores().size();
			
			System.out.println("Esta Empresa Tiene "+contador+ " trabajador(es)");
			
			for (Trabajador listWorker : listSucu.getListaTrabajadores()) {
				System.out.println(listWorker.mostrarTrabajador());
			}			
		}
	}
	
	
	
	
	//Metodos
	
}
