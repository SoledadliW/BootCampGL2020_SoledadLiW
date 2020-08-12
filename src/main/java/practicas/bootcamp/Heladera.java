package practicas.bootcamp;

public class Heladera extends Electrodomestico{

	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public void guardarElemento(String elemento) {
		
		System.out.println("Guardando " + elemento + " en la Heladera.");
	}
	
	public void extraerElemento(String elemento) {
		
		System.out.println("Extrayendo " + elemento + " en la Heladera.");
	}
	
//	private static void Herencia() {
//	System.out.println("\n");
//	System.out.println("## TEMA: Herencia ##");
//	
//	final Electrodomestico electrodomestico = new Electrodomestico();
//	final Heladera heladera = new Heladera();
//	electrodomestico.setMarca("Generica 1");	
//	electrodomestico.setColor("Blanco");
//	heladera.setMarca("Generica 2");
//	heladera.setColor("Gris");
//	
//	System.out.println("Electrodomestico - Marca: " + electrodomestico.getMarca() + " Color: " +
//			electrodomestico.getColor());
//
//	System.out.println("Heladera - Marca: " + heladera.getMarca() + " Color: " + heladera.getColor());
//	
//	electrodomestico.encender();
//	heladera.encender();
}

