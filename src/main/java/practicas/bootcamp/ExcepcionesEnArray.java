package practicas.bootcamp;

public class ExcepcionesEnArray {
	int [] array = {0, 1, 2, 3, 4, 5};
	
	int getValor(int indice) {
		return array[indice];
	}

	public static void main(String[] args) {
		ExcepcionEnArray ea = new ExcepcionEnArray();
		try {
			ea.getValor(6);
			
			System.out.println("valor " + ea.getValor(5));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Excepción: indice de array fuera de limites" + e.getMessage());
		}

	}

}
