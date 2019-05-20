
package Colecciones;

import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*TreeSet <String> ordenaPersonas = new TreeSet<String>();
		ordenaPersonas.add("sandra");
		ordenaPersonas.add("ana");
		ordenaPersonas.add("diana");
		
		for (String persona : ordenaPersonas) {
			System.out.println(persona);
			 
		}*/
		
		TreeSet <Articulo> ordenaArticulos = new TreeSet<Articulo>();
		Articulo primero = new Articulo(0001, "prticulo uno");
		Articulo segundo = new Articulo(0002000, "xarticulo dos");
		Articulo tercero = new Articulo(0003, "articulo tres");
		
		
		ordenaArticulos.add(segundo);
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		
		
		for (Articulo articulo : ordenaArticulos) {
			System.out.println(articulo.getDescipcion());
		}
		
		System.out.println("segundo TreeSet");
		//Articulo comparadorArticulo = new Articulo();
		//TreeSet <Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulo);
		
		//ComparadorArticulos comparador = new ComparadorArticulos();
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo> (new Comparator<Articulo>() {
			public int compare(Articulo o1, Articulo o2) {
			String descripcionA = o1.getDescipcion();
			String descripcionB = o2.getDescipcion();
			return descripcionA.compareTo(descripcionB);
			}
			
		});
		ordenaArticulos2.add(segundo);	
		ordenaArticulos2.add(tercero);
		ordenaArticulos2.add(primero);
		for (Articulo articulo : ordenaArticulos2) { 
			System.out.println(articulo.getDescipcion());
		}
		
	}
}


class Articulo implements Comparable<Articulo> /*Comparator<Articulo>*/{
	private int numero_articulo;
	private String descripcion;
	
	//public Articulo() {};
	
	
	public Articulo(int num, String desc) {
		this.numero_articulo = num;
		this.descripcion = desc;
	}
	
	public String getDescipcion () {
		
		return descripcion;
	}
	
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;

	}

	//@Override
	/*public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String descripcionA = o1.getDescipcion();
		String descripcionB = o2.getDescipcion();
		
		return descripcionA.compareTo(descripcionB);
	
	}*/
	
}

/*class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String descripcionA = o1.getDescipcion();
		String descripcionB = o2.getDescipcion();
		return descripcionA.compareTo(descripcionB);
		
	}
	
}*/
