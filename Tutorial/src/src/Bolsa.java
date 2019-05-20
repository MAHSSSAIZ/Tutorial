package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable{

	private ArrayList lista= new ArrayList();
	private int tope;
	 
	public Bolsa(int tope) {
	super();
	this.tope = tope;
	}
	
	public void add(Object objeto ) {
	if (lista.size()<=tope) {
	 
	lista.add(objeto);
	}else {
	 
	throw new RuntimeException("no caben mas");
	}
	 
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}
	
	

}
