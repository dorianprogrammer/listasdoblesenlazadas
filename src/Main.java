import javax.swing.JOptionPane;

public class Main  {

	public static void main(String[] args) {
		ListaDoble lista = new ListaDoble();
		
		lista.add("1");
		lista.add("2");
		lista.add("4");
		lista.add("5");
	
		Invertir v = new Invertir();
		v.IzquierdaDerecha();
	}
	
}

class Invertir extends ListaDoble {
	
	public void DerechaIzquierda() {
		
		Nodo temporal;
		temporal = FinDeLista;
		while (temporal!= null) {
			temporal = temporal.getPunteroAnterior();
			System.out.println(temporal.getDato());
		}
	}
	
	public void IzquierdaDerecha() {
	
		Nodo temporal;
		temporal = InicioDeLista;
		while (temporal!= null) {
			JOptionPane.showMessageDialog(null, temporal.getDato().toString(),"Datos registrados",1);
			temporal = temporal.getPunteroSiguiente();
			
		}	
		
	}	
	
}
