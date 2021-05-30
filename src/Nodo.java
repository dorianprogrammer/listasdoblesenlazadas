
public class Nodo {
	
	
	private Nodo PunteroAnterior;
	private Nodo PunteroSiguiente;
	private String dato;
	
	public Nodo(Nodo punteroAnterior, Nodo punteroSiguiente, String dato) {
		super();
		PunteroAnterior = punteroAnterior;
		PunteroSiguiente = punteroSiguiente;
		this.dato = dato;
	}
	
	public Nodo(String dato) {
		this.dato = dato;
		PunteroSiguiente =null;
		PunteroAnterior=null;
	}

	public Nodo getPunteroAnterior() {
		return PunteroAnterior;
	}

	public void setPunteroAnterior(Nodo punteroAnterior) {
		PunteroAnterior = punteroAnterior;
	}

	public Nodo getPunteroSiguiente() {
		return PunteroSiguiente;
	}

	public void setPunteroSiguiente(Nodo punteroSiguiente) {
		PunteroSiguiente = punteroSiguiente;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}
	

}
