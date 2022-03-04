package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instituto i1 = new Instituto ();
		Instituto i2 = new Instituto ("IES AUGUSTOBRIGA", "C/ Antonio Concha", 1000, true);
		
		
		System.out.println("Institutos:\n");
		System.out.printf("|Instituto: %s|\n|Calle: %s|\n|Alumnos: %d|\n|¿Es Bilingüe?: %b|", 
				i2.getNombre(), i2.getDireccion(), i2.getNumAlumnos(), i2.isBilingue());
	}

}
