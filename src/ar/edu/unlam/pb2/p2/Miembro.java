package ar.edu.unlam.pb2.p2;

public class Miembro {

	private String nombre;
	private String equipo;
	private String tipo;
	private String dni;
	

	public Miembro(String nombre, String equipo, String tipo, String dni) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.tipo = tipo;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
