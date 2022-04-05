package Modelo;
import java.util.ArrayList;
public class Proyecto {
	public String nombre_proyecto;
	public String descripcion;
	public int fecha_inicio;
	public int fecha_fin;
	public Participante due�o;
	private ArrayList<Participante> participantes;
	public Actividad actividad;
	private ArrayList<Actividad> actividades;
	public Proyecto () {
		String nombre_proyecto = "";
		String descripci�n = "";
		int fecha_inicio = 0;
		int fecha_fin = 0;
		this.participantes = new ArrayList<Participante>() ;
		this.actividades = new ArrayList<Actividad>() ;
		}
	public void CrearProyecto (String nombre, String xdescripcion, int fecha, String nombre_due�o, String correo_due�o) {
		this.nombre_proyecto = nombre;
		this.descripcion = xdescripcion;
		this.fecha_inicio = fecha;
		this.due�o = new Participante(nombre_due�o, correo_due�o, true);
		this.participantes.add(due�o);
	}
	public void AgregarActividad (String titulo, String descripcion, String tipo, int fecha, int hora, String nombre_participante, String correo_participante ) {
		this.actividad = new Actividad(titulo, descripcion, tipo, fecha, hora, nombre_participante, correo_participante);
		this.participantes.add(new Participante(nombre_participante, correo_participante, false));
	}
	public void CerrarActividad (int hora_fin) {
		this.actividad.modificarhora_fin(hora_fin);
		this.actividades.add(this.actividad) ;
	}
	public void CerrarProyecto (int fechafin) {
		this.fecha_fin = fechafin;
	}
	
}
