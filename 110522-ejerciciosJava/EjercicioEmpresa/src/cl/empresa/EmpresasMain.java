package cl.empresa;

import java.util.ArrayList;

import cl.empresa.modelo.Empresa;
import cl.empresa.modelo.Sucursal;
import cl.empresa.modelo.Trabajador;

public class EmpresasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se instancian los trabajadores
		Trabajador workerUno = new Trabajador("Pedrito1", "Carpintero1",750000);
		Trabajador workerDos = new Trabajador("Pedrito2", "Carpintero2",850000);
		Trabajador workerTres = new Trabajador("Pedrito3", "Carpintero3",650000);
		Trabajador workerCuatro = new Trabajador("Pedrito4", "Carpintero4",350000);
		Trabajador workerCinco = new Trabajador("Pedrito5", "Carpintero5",850000);
		
		
		//Se instancia una lista de trabajadores
		ArrayList<Trabajador> listaWorkers1 = new ArrayList<Trabajador>();
		//Se agregan 4 trabajadores a la lista 1
		listaWorkers1.add(workerUno);
		listaWorkers1.add(workerDos);
		listaWorkers1.add(workerTres);
		listaWorkers1.add(workerCuatro);

		
		//Se instancia la lista de trabajadores1 a la sucursal de maipon
		Sucursal sucursalMaipon = new Sucursal("Maipon", listaWorkers1);
		
		
		//Se instancia una segunda lista de trabajadores
		ArrayList<Trabajador> listaWorkers2 = new ArrayList<Trabajador>();
		//Se agrega 1 trabajador a la lista 2
		listaWorkers2.add(workerCinco);
		Sucursal sucursalArauco = new Sucursal ("Arauco", listaWorkers2);
		
		
		//Se instancia una lista de sucursales
		ArrayList<Sucursal> listaSucursal = new ArrayList<Sucursal>();
		//Se agregan 2 sucursales a la lista
		listaSucursal.add(sucursalMaipon);
		listaSucursal.add(sucursalArauco);
		
		//Se instancia una empresa
		Empresa emp = new Empresa("CodeCris SPA", listaSucursal);
		
		//muestra información del trabajador
		System.out.println(workerUno.mostrarTrabajador());
		
		//muestra la lista trabajadores de la sucursal maipon
		//System.out.println(sucursalMaipon);
		
		//muestra la lista trabajadores de la sucursal Arauco
		//System.out.println(sucursalArauco);
		
		//mostar que trabajadores tienen sueldo sobre x sueldo
		sucursalMaipon.sueldos(700000);
		
		//muestra la lista trabajadores de la sucursal maipon
		//System.out.println(listaSucursal);
		
		//mostar informacion de la empresa
		//System.out.println(emp);
		
		
		//Contar las sucursales de la empresa
		emp.cuantasSucursales();
		
		//Contar las sucursales de la empresa
		emp.cuantosTrabajadores();
	}

}
