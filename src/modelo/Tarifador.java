package modelo;

public class Tarifador {
	/**
	 * La única instancia del Tarifador. Es un singleton.
	 */
	private static Tarifador instance = null;

	/**
	 * Constructor.
	 * 
	 * impide la instanciación, usar getInstance.
	 */
	protected Tarifador(){};
	
	/**
	 * Retorna la única instancia del singleton. Si no existe la crea.
	 * 
	 * @return la instancia única.
	 */
	public static Tarifador getInstance() {
	   if(instance == null) {
	      instance = new Tarifador();
	   }
	   return instance;
	}

	/**
	 * Calcula el costo final del viaje.
	 * 
	 * @return el costo final del viaje
	 */
	public float calcularCosto(Viaje viaje) {
	  float costo = 0;
	  //costo = (obtener costo entre origen y destino)
	  return costo;
	}

	public static void setInstance(Tarifador instance) {
		Tarifador.instance = instance;
	}
}
