package Modelo;

public class Participante {
	
	public String nombre;
	public String correo;
	public boolean due�o;
	
	public Participante() {
		String nombre = "";
		String correo = "";
	}
	public Participante (String xnombre, String xcorreo, boolean xdue�o) {
		this.nombre = xnombre;
		this.correo = xcorreo;
		this.due�o = xdue�o;
	}
	
}
