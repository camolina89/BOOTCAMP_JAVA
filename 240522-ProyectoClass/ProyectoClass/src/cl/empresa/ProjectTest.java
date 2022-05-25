package cl.empresa;

public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project py1 = new Project();
		py1.setNombre("Quillon");
		py1.setDescripcion("Desarrollo de SGE en Laravel");
		
		System.out.println(py1);
		System.out.println(py1.elevatorPitch());
		
		Project py2 = new Project("Chillán");
		py2.setDescripcion("Desarrollo de Sitio Web en java");
		System.out.println(py2);
		
		Project py3 = new Project("Bulnes","Desarrollo de intranet en una App movil");
		System.out.println(py3);
	}

}
