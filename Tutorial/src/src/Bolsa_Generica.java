package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa_Generica<T> implements Iterable<T>{
	private ArrayList<T> lista= new ArrayList<T>();
	private int tope;
	 
	public Bolsa_Generica(int tope) {
	super();
	this.tope = tope;
	}
	
	public void add(T objeto ) {
	if (lista.size()<=tope) {
	 
	lista.add(objeto);
	}else {
	 
	throw new RuntimeException("no caben mas");
	}
	 
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}

}
