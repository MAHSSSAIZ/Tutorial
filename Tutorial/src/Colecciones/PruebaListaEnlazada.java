package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Perú");
		
		LinkedList<String> capitales = new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("Mexico DC");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		
		ListIterator <String> iterA = paises.listIterator();
		ListIterator <String> iterB = capitales.listIterator();
		
		while (iterA.hasNext()) {
			
			if (iterB.hasNext()) {
				iterA.next();
				iterA.add(iterB.next());
				}
			
		}
		
		 iterB = capitales.listIterator();
		float i = 0;
		while (iterB.hasNext()) {
				
				//int i = iterB.nextIndex();
				int nextindex = iterB.nextIndex();
				System.out.println("NextIndex:" + nextindex);
			
				iterB.next();
				//System.out.println("NextIndex:" + iterB.nextIndex());
				
				//System.out.println("Posicion: " + i );
				
				float resto = i % 2;
				System.out.println("indice: " + i);	
				float division = i / 2;
				System.out.println("division: " + division);	
				System.out.println("resto: " + resto);	
				
				//System.out.println("Posicion: " + i + ".Resto: "+ resto);	
				
				if (resto > 0) {
					iterB.remove();
				}
				i ++;
		}
		paises.removeAll(capitales);
		System.out.println(paises);
		System.out.println(capitales);
		
	}

}
