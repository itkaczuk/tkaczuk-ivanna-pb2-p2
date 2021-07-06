package ar.edu.unlam.pb2.p2;

public class Jugador extends Miembro {
	
	public Jugador(String nombre, String equipo, String tipo) {
		super(nombre, equipo, tipo);
		// TODO Auto-generated constructor stub
	}
	private Integer dni;
	private Integer nroCamiseta;
	private String posicion;
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getNroCamiseta() {
		return nroCamiseta;
	}
	public void setNroCamiseta(Integer nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
