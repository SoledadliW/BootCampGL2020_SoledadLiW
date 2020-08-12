package practicas.bootcamp;

import java.util.ArrayList;
import java.util.List;

class Electrodomestico {
	private String marca;
	private double peso;
	private char consumo;
	private String color;
	
	public void encender() {
		System.out.println("Encendiendo electrodoméstico");
	}

	public void apagar() {
		System.out.println("Apagado electrodoméstico");
	}
	
private static void polimorfismo() {
	
	System.out.println("\n");
	System.out.println("## TEMA: Polimorfismo ##");
	
	final Heladera heladera = new Heladera();
	final Televisor televisor = new Televisor();
	final Cafetera cafetera = new Cafetera();
	
	List<Electrodomestico> electrodomestico = new ArrayList<Electrodomestico>();
	electrodomestico.add(cafetera);
	electrodomestico.add(televisor);
	electrodomestico.add(heladera);
	
		for(Electrodomestico e : electrodomestico) {
			e.encender();
	}
}
	
}
