package cl.empresa.modelo;

public class Trabajador {
	//Atributos
	private String nameTrabajador;
	private String ocupacion;
	private int sueldo;
	
	
	//Constructor lleno
	public Trabajador(String nameTrabajador, String ocupacion, int sueldo) {
		super();
		this.nameTrabajador = nameTrabajador;
		this.ocupacion = ocupacion;
		this.sueldo = sueldo;
	}
	
	
	public Trabajador(String nameTrabajador, String ocupacion) {
		super();
		this.nameTrabajador = nameTrabajador;
		this.ocupacion = ocupacion;
	}







	public String getNameTrabajador() {
		return nameTrabajador;
	}






	public void setNameTrabajador(String nameTrabajador) {
		this.nameTrabajador = nameTrabajador;
	}






	public String getOcupacion() {
		return ocupacion;
	}






	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}






	public int getSueldo() {
		return sueldo;
	}






	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}






	@Override
	public String toString() {
		return "Trabajador [nameTrabajador=" + nameTrabajador + ", ocupacion=" + ocupacion + ", sueldo=" + sueldo + "]";
	}





	public String mostrarTrabajador() {
		return "- Trabajador "+ nameTrabajador + " tiene como ocupación "+ ocupacion;
	}
	
	
	
	
	
	
	//Metodos
	
	
}
