package Modelo;

public class Participante {
	
	public String nombre;
	public String correo;
	public boolean dueño;
	
	public Participante() {
		String nombre = "";
		String correo = "";
	}
	public Participante (String xnombre, String xcorreo, boolean xdueño) {
		this.nombre = xnombre;
		this.correo = xcorreo;
		this.dueño = xdueño;
	}
	
}
