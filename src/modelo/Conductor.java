package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Conductor extends Usuario{
	
	private Date fechaVencimientoLicencia;
	private Collection<Calificacion> calificaciones = new ArrayList<Calificacion>();
	private Collection<Viaje> viajes = new ArrayList<Viaje>();

	/**
	 * 
	 */
	public Conductor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getFechaVencimientoLicencia() {
		return fechaVencimientoLicencia;
	}

	public void setFechaVencimientoLicencia(Date fechaVencimientoLicencia) {
		this.fechaVencimientoLicencia = fechaVencimientoLicencia;
	}
	
	public Collection<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Collection<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	public Collection<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Collection<Viaje> viajes) {
		this.viajes = viajes;
	}

	public float puntajePromedio()
	{
		float promedio = 0;
		for (Calificacion c : this.getCalificaciones()) {
			promedio = promedio + c.getPuntaje();
		    }
		promedio = promedio / this.getCalificaciones().size();
				
		return promedio;
	}
	
	public boolean isConductor()
	{
		return true;
	}
	
}
