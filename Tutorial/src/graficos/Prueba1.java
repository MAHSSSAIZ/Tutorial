package graficos;

import javax.swing.JOptionPane;

public class Prueba1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		boolean sonido=false;
		String tipo_sonido = JOptionPane.showInputDialog("Indique respuesta (Si o No)");

		// Pregunta por el valor sin tener en cuenta las mayúsculas/minísculas 
		System.out.println(tipo_sonido);
		if(tipo_sonido.equalsIgnoreCase("SI")){
		sonido=true;
		System.out.println("Por true");
		}
		else {
		sonido=false;
		System.out.println("Por false");
		}
		// Primero cambia la variable a mayúsculas y luego pregunta por el contenido
		tipo_sonido=tipo_sonido.toUpperCase();
		System.out.println(tipo_sonido);
		//if (tipo_sonido=="SI") {
		if (tipo_sonido.equals("SI")) {
		sonido=true;
		System.out.println("Por true");
		}
		else {
		sonido=false;
		System.out.println("Por false");
		}
		
				
	}

}
