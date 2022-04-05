package Modelo;

public class Actividad {
	public String titulo;
	public String descripcion;
	public String tipo;
	public int fecha;
	public int hora_inicio;
	public int hora_fin;
	public Participante participante;
	
	public Actividad() {
		String titulo = "";
		String descripcion = "";
		String tipo = "";
		int fecha = 0;
		int hora_inicio = 0;
		int hora_fin = 0;
		participante = new Participante();
	}
	public Actividad (String xtitulo, String xdescripcion, String xtipo, int xfecha, int xhora, String nombre_part, String correo_part) {
		this.titulo = xtitulo;
		this.descripcion = xdescripcion;
		this.tipo = xtipo;
		this.fecha = xfecha;
		this.hora_inicio = xhora;
		this.participante = new Participante(nombre_part, correo_part, false);
		
	}
	public void modificarhora_fin(int horafin) {
		this.hora_fin = horafin;
	}
	public void modificarfecha (int yfecha) {
		this.fecha = yfecha;
	}
}
