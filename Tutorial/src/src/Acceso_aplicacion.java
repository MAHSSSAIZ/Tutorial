package src;
import javax.swing.*;


public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Miguel";
		String pass = "";
		
		while (clave.equals(pass)==false){
			
			pass = JOptionPane.showInputDialog("Por favor, introduce la contraseņa");
			
			if (clave.equals(pass)== false){
				System.out.println("Contraseņa incorrecta");
			}
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");
		
		
		
	}

}
