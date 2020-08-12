package practicas.bootcamp;

public class Hombre implements Animal, Persona{

	@Override
	public void dormir() {
		System.out.println("El hombre duerme mucho");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre habla");
		
	}
	
	@Override
	public void comer(final String s) {
			System.out.println("El hombre come mucho");
		}
	
	public void main() {
		Hombre ho = new Hombre();
		ho.dormir();
		ho.hablar();
		ho.sonidoAnimal();
		ho.come("Hombre ");
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}
}
	
