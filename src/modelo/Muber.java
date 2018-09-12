package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Muber {
	/**
	 * El id de Muber.
	 */
	private Long id;

	/**
	 * Colección con todos los pasajeros de la empresa.
	 */
	private Collection<Pasajero> pasajeros = new ArrayList<Pasajero>();

	/**
	 * Colección con todos los conductores de la empresa.
	 */
	private Collection<Conductor> conductores = new ArrayList<Conductor>();

	/**
	 * Colección de todas los viajes.
	 */
	private Collection<Viaje> viajes = new ArrayList<Viaje>();
	
	/**
	 * Colección de todas los viajes finalizados.
	 */
	//private Collection<Viaje> finalizados = new ArrayList<Viaje>();

	/**
	 * Colección de todas los viajes pendientes (aun no fueron finalizados).
	 */
	//private Collection<Viaje> pendientes = new ArrayList<Viaje>();


	/**
	 * Constructor vacío.
	*/
	public Muber(){}
	
	/**
	 * Constructor.
	 * 
	 * @param pasajeros
	 * 			Colección de pasajeros de la empresa.
	 * @param conductores
	 * 			Colección de conductores de la empresa.
	 * @param viajesFinalizados
	 * 			Colección de viajes finalizados.
	 * @param viajesPendientes
	 * 			Colección de viajes sin finalizar.
	 */
	 	
	public Muber(Collection<Pasajero> pasajeros, Collection<Conductor> conductores, Collection<Viaje> viajes) {
	  super();
	  this.setConductores(conductores);
	  this.setPasajeros(pasajeros);
	  this.setViajes(viajes);
	  
	}

	/**
	 * Getter.
	 * 
	 * @return el id de muber.
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Setter.
	 * 
	 * @param id
	 *			es el id de muber.
	 */
	public void setId(Long id) {
	this.id = id;
	}

	/**
	 * Getter.
	 * 
	 * @return la colección de pasajeros de Muber.
	 */
	public Collection<Pasajero> getPasajeros() {
	  return pasajeros;
	}

	/**
	 * Setter.
	 * 
	 * @param pasajeros
	 *			es la colección de pasajeros de Muber.
	 */
	public void setPasajeros(Collection<Pasajero> pasajeros) {
	  this.pasajeros = pasajeros;
	}

	/**
	 * Getter.
	 * 
	 * @return la colección de conductores de Muber.
	 */
	public Collection<Conductor> getConductores() {
	  return conductores;
	}

	/**
	 * Setter.
	 * 
	 * @param transportes
	 *			es la colección de conductores de Muber.
	 */
	public void setConductores(Collection<Conductor> conductores) {
	  this.conductores = conductores;
	}
	
	/**
	 * Setter.
	 * 
	 * @param viajes
	 *			es la colección de viajes de Muber.
	 */
	public void setViajes(Collection<Viaje> viajes) {
	  this.viajes = viajes;
	}
	
	/**
	 * Getter.
	 * 
	 * @return la colección de viajes de Muber.
	 */
	public Collection<Viaje> getViajes() {
	  return viajes;
	}

	/**
	 * Getter.
	 * 
	 * @return la colección de viajes finalizados.
	 */
	public Collection<Viaje> getFinalizados() {
	    Collection<Viaje> finalizados = new ArrayList<Viaje>();
	    for (Viaje viaje : this.getViajes()) {
	      if (viaje.getFinalizado())
	    	  finalizados.add(viaje);
	    }
	  return finalizados;
	}

	/**
	 * Getter.
	 * 
	 * @return la colección de viajes sin finalizar.
	 */
	public Collection<Viaje> getPendientes() {
	    Collection<Viaje> pendientes = new ArrayList<Viaje>();
	    for (Viaje viaje : this.getViajes()) {
	      if (!viaje.getFinalizado())
	    	  pendientes.add(viaje);
	    }
	  return pendientes;
	}
	
	/**
	 * Finaliza un viaje.
	 * 
	 * @param el viaje a finalizar.
	 */
	public void finalizarViaje(Viaje viaje) {
	  viaje.finalizarViaje();
	}
	
	/**
	 * Agrega un pasajero a Muber.
	 * 
	 * @param pasajero
	 */
	public void agregarPasajero(Pasajero pasajero) {
	    this.getPasajeros().add(pasajero);
	  }
	
	/**
	 * Agrega un conductor a Muber.
	 * 
	 * @param conductor
	 */
	public void agregarConductor(Conductor conductor) {
	    this.getConductores().add(conductor);
	  }
	
	/**
	 * Agrega un viaje a Muber.
	 * 
	 * @param viaje
	 */
	public void agregarViaje(Viaje viaje) {
	    this.getViajes().add(viaje);
	  }
}
