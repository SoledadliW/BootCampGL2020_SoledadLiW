package practicas.bootcamp;

public interface Animal {

	public void dormir();
	
	public void sonidoAnimal();
	
	default void come (String s) {
		System.out.println("El " + s + " se alimenta");
	}
	
	static void camina(String s) {
		System.out.println("El " + s + " camina");
	}
	
}
