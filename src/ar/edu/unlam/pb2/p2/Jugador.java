package ar.edu.unlam.pb2.p2;

public class Jugador extends Miembro {
	
	
	private Integer nroCamiseta;
	private String posicion;
	
	public Jugador(String nombre, String equipo, String tipo, String dni, Integer nroCamiseta, String posicion) {
		super(nombre, equipo, tipo, dni);
		setNroCamiseta(nroCamiseta);
		setPosicion(posicion);
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
