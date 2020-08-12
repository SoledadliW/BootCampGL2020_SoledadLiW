package practicas.bootcamp;

public interface Persona {
	
	public void hablar();
	public void dormir();
	
	default void comer(String s) {
		
		System.out.println("La " + s + " se alimenta");
	}

}
