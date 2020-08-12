package practicas.bootcamp;

public class Cafetera extends Electrodomestico{
	
	private double litros;
	
	public void elegirSabor(String sabor) {
		System.out.println("Sabor elegido: " + sabor);
	}
	
@Override

	public void encender() {
		System.out.println("Cafetera encendiendo");
}
	
}
