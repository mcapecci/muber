package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Viaje {
	private Long id;
	private String origen;
	private String destino;
	private Date fecha;
	private float costoTotal;
	private int cantMaximaPasajeros;
	private boolean finalizado;
	private Conductor conductor;
	private Collection<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private Collection<Calificacion> calificaciones = new ArrayList<Calificacion>();
	
	@Override
	public String toString() {
		return "Viaje [finalizado=" + finalizado + ", origen=" + origen 
				+ ", destino=" + destino + ", fecha=" + fecha 
				+ ", costoTotal=" + costoTotal + ", cantMaximaPasajeros="
				+ cantMaximaPasajeros + "]";
	}

	/**
	 * Constructor vacío.
	*/
	public Viaje(){}

	/**
	 * Constructor.
	 * 
	 * @param conductor
	 * 			conductor del viaje.
	 * @param pasajeros
	 * 			colección de pasajeros del viaje.
	 * @param origen
	 * 			origen del viaje.
	 * @param destino
	 * 			destino del viaje.
	 * @param fecha
	 * 			fecha del viaje.
	 */
	public Viaje(Conductor conductor, Collection<Pasajero> pasajeros, String origen, String destino, Date fecha) {
	    this.setConductor(conductor);
	    this.setPasajeros(pasajeros);
	    this.setOrigen(origen);
	    this.setDestino(destino);
	    this.setFecha(fecha);
	    Tarifador tarifador = new Tarifador();
	    this.setCostoTotal(tarifador.calcularCosto(this));
	    this.setFinalizado(false);
  }

	/**
	 * Getter.
	 * 
	 * @return el id del viaje.
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Setter.
	 * 
	 * @param id
	 *			es el id del Viaje.
	 */
	public void setId(Long id) {
	this.id = id;
	}
	
	/**
	 * Agrega un pasajero al viaje.
	 * 
	 * @param unPasajero
	 */
	public void agregarPasajero(Pasajero pasajero) {
	    this.getPasajeros().add(pasajero);
	    this.recalcularValor();
	  }

	/**
	 * Calcula el valor del viaje.
	 * 
	 */
	private void recalcularValor() {
	    Tarifador tarifador = new Tarifador();
	    this.setCostoTotal(tarifador.calcularCosto(this));
	
	  }

	
	public void finalizarViaje(){
	    this.setFinalizado(true);
	}

	/**
	 * Getter.
	 * 
	 * @return los pasajeros del viaje.
	 */
	public Collection<Pasajero> getPasajeros() {
		  return pasajeros;
		}
	
	/**
	 * Setter.
	 * 
	 * @param pasajeros
	 *			es la colección de pasajeros del viaje.
	 */
	public void setPasajeros(Collection<Pasajero> pasajeros) {
	  this.pasajeros = pasajeros;
	}

	/**
	 * Getter.
	 * 
	 * @return el origen del viaje.
	 */
	public String getOrigen() {
	    return origen;
	  } 

	/**
	 * Setter.
	 * 
	 * @param origen
	 *			el origen del viaje.
	 */
	public void setOrigen(String origen) {
	    this.origen = origen;
	  }
	
	/**
	 * Getter.
	 * 
	 * @return el destino del viaje.
	 */
	public String getDestino() {
	    return destino;
	  } 

	/**
	 * Setter.
	 * 
	 * @param destino
	 *			el destino del viaje.
	 */
	public void setDestino(String destino) {
	    this.destino = destino;
	  }

	/**
	 * Getter.
	 * 
	 * @return la fecha del viaje.
	 */
	public Date getFecha() {
	    return fecha;
	  }

	/**
	 * Setter.
	 * 
	 * @param fecha
	 *			fecha del viaje.
	 */
	public void setFecha(Date fecha) {
	    this.fecha = fecha;
	  }

	/**
	 * Getter.
	 * 
	 * @return el costo total cobrado para el viaje.
	 */
	public float getCostoTotal() {
	    return costoTotal;
	  }
	
	/**
	 * Setter.
	 * 
	 * @param costoTotal
	 *			los empleados que trabajan en la mudanza.
	 */
	public void setCostoTotal(float costoTotal) {
	    this.costoTotal = costoTotal;
	  }

	public boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	/**
	 * @return the cantMaximaPasajeros
	 */
	public int getCantMaximaPasajeros() {
		return cantMaximaPasajeros;
	}

	/**
	 * @param cantMaximaPasajeros the cantMaximaPasajeros to set
	 */
	public void setCantMaximaPasajeros(int cantMaximaPasajeros) {
		this.cantMaximaPasajeros = cantMaximaPasajeros;
	}

	/**
	 * @return the conductor
	 */
	public Conductor getConductor() {
		return conductor;
	}

	/**
	 * @param conductor the conductor to set
	 */
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Collection<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Collection<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
}
