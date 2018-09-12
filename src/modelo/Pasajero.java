package modelo;

public class Pasajero extends Usuario {

	private float credito;

	/**
	 * 
	 */
	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the credito
	 */
	public float getCredito() {
		return credito;
	}

	/**
	 * @param credito the credito to set
	 */
	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	public void descontarCredito(float credito) {
		this.setCredito(this.getCredito() - credito);
	}
	
	public void agregarCredito(float credito) {
		this.setCredito(credito + this.getCredito());
	}
	
}
