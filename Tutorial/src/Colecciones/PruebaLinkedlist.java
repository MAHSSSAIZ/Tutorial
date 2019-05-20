package Colecciones;

import java.util.*;
	
public class PruebaLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> personas = new LinkedList<String>();
		personas.add("juana");
		personas.add("sandra");
		personas.add("ana");
		personas.add("eva");
		
		System.out.println(personas.size());
		
		ListIterator <String> it = personas.listIterator();
		it.next();
		it.add("antonio");
		
		
		//personas.addFirst("Primer elemento");
		//personas.addLast("Ultimo elemento");
		
		
		
		for (String persona : personas) {
			System.out.println(persona.toString());
		}
		
		System.out.println(personas.size());
		//personas.removeFirst();
		
		for (String persona : personas) {
			System.out.println(persona.toString());
		}
		
		System.out.println(personas.size());
				
	}

}
