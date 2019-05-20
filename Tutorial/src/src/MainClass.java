package src;


import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseGenerica<Integer> entero = new ClaseGenerica<Integer>(88);
		entero.ClassType();
		
		ClaseGenerica<String> cadena = new ClaseGenerica<String>("texto");
		cadena.ClassType();
		
		ClaseGenerica<Double> doble = new ClaseGenerica<Double>(16.54);
		doble.ClassType();

		
		List miLista = new LinkedList();
		
	}

}


class ClaseGenerica<T> {
	T objeto;
	
	public ClaseGenerica(T o) {
		objeto = o;
		
	}
	
	public void ClassType() {
		System.out.println("El tipo de clase de T es: "+ objeto.getClass().getName());
		
	}
	
	

}

