package Colecciones;
import java.util.*;
public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String, Empleado> mapaEmpleados = new HashMap<String, Empleado>();
		
		
		mapaEmpleados.put("A", new Empleado("Juan Bermudez"));
		mapaEmpleados.put("B", new Empleado("Pedro Gomez"));
		mapaEmpleados.put("C", new Empleado("Antonio Benitez"));
		
		System.out.println(mapaEmpleados);
		
		mapaEmpleados.remove("A");
		System.out.println(mapaEmpleados);
		mapaEmpleados.put("A", new Empleado("Juan Bermudez"));
		mapaEmpleados.put("C", new Empleado("Pepito Banderas"));
		System.out.println(mapaEmpleados);
		System.out.println("Imprime EntrySet");
		
		//System.out.println(mapaEmpleados.entrySet());
		
		for (Map.Entry<String, Empleado> entrada : mapaEmpleados.entrySet()) {
			String clave = entrada.getKey();
			String valor = entrada.getValue().toString();
			System.out.println("Clave " + clave);
			System.out.println("Valor: " + valor);
		}
		
		
		
	}

}

class Empleado{
	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		sueldo = 2000;
		
	}
	
	public String toString() {
		
		return "[Nombre : " + nombre + " Sueldo = " + sueldo + "]";
	}
	
}
