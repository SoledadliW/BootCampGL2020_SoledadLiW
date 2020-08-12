package practicas.bootcamp;

public class MainAnimal {
	
	public static void main(String[] args) {
	
		Perro dog = new Perro();
	
		dog.sonidoAnimal();
		dog.dormir();
		dog.come("Perro");
		Animal.camina("Perro");
		
	}
}