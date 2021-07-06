package ar.edu.unlam.pb2.p2;


import java.util.HashMap;
import java.util.Map;

public class Partido {
	
	private Integer id;
	private Map<Integer, Jugador> jugadores;
	
	public Partido(Integer id, Map<Integer, Jugador> jugadores) {
		super();
		setId(id);
		setJugadores(new HashMap<Integer, Jugador>());
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Map<Integer, Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Map<Integer, Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	

}
