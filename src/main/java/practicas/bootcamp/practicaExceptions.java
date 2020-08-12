package practicas.bootcamp;

public class practicaExceptions {

	String s = "ejercicio 2 sobre Excepciones";
		
	String getString() {
		return s;
}
		
public static void main(String[] args) {
		
	ExceptionNull en = null;
		
	try {
		en.getString();
	} catch (Exception e) {
		System.out.println("Se produjo una expción. " + e.getMessage());
		}
	}
}
