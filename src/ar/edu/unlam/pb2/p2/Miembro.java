package ar.edu.unlam.pb2.p2;

public class Miembro {

	private String nombre;
	private String equipo;
	private String tipo;
	

	public Miembro(String nombre, String equipo, String tipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.tipo = tipo;
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
	
}
