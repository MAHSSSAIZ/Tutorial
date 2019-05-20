package src;

public class Prueba_Genericos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Bolsa_Generica<Chocolatina> bolsa= new Bolsa_Generica<Chocolatina>(3);
		 Chocolatina c= new Chocolatina("milka");
		 Chocolatina c1= new Chocolatina("milka");
		 Chocolatina c2= new Chocolatina("ferrero");
		 //Golosina g1= new Golosina("gominola");
		 //Golosina g2= new Golosina("chicle");
		 
		 bolsa.add(c);
		 bolsa.add(c1);
		 bolsa.add(c2);
		 //bolsa.add(g1);
		 //bolsa.add(g2);
		 
		 for (Chocolatina choco : bolsa) {
		 
		 System.out.println(choco.getMarca());
		 
		 }
		 
		 
		 Bolsa_Generica<Golosina> bolsa_golosinas= new Bolsa_Generica<Golosina>(3);
		 Golosina g1 = new Golosina("chicles");
		 
		 Golosina g2 = new Golosina("piruletas");
		 Golosina g3 = new Golosina("nubes");
		 
		 bolsa_golosinas.add(g1);
		 bolsa_golosinas.add(g2);
		 bolsa_golosinas.add(g3);
		 
		 
		 for (Golosina golosina: bolsa_golosinas) {
			 System.out.println("El contenido de la bolsa de chuches es:"+ golosina.getNombre());
			 
		 }
		 
		
	}
}
