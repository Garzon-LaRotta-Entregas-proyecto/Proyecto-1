package Modelo;
import java.util.ArrayList;
public class Proyecto {
	public String nombre_proyecto;
	public String descripcion;
	public int fecha_inicio;
	public int fecha_fin;
	public Participante dueño;
	private ArrayList<Participante> participantes;
	public Actividad actividad;
	private ArrayList<Actividad> actividades;
	public Proyecto () {
		String nombre_proyecto = "";
		String descripción = "";
		int fecha_inicio = 0;
		int fecha_fin = 0;
		this.participantes = new ArrayList<Participante>() ;
		this.actividades = new ArrayList<Actividad>() ;
		}
	public void CrearProyecto (String nombre, String xdescripcion, int fecha, String nombre_dueño, String correo_dueño) {
		this.nombre_proyecto = nombre;
		this.descripcion = xdescripcion;
		this.fecha_inicio = fecha;
		this.dueño = new Participante(nombre_dueño, correo_dueño, true);
		this.participantes.add(dueño);
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
