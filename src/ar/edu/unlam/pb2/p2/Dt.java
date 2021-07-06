package ar.edu.unlam.pb2.p2;

public class Dt extends Miembro{
	
	public Dt(String nombre, String equipo, String tipo, Integer edad, String dni) {
		super(nombre, equipo, tipo, dni);
		setEdad(edad);
	}

	private Integer edad;

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
