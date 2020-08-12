package practicas.bootcamp;

public class VariableInstancia {
	
	int engPoints;
	int mathsPoints;
	int phyPoints;

public static class PointDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableInstancia obj = new VariableInstancia();
		obj.engPoints = 50;
		obj.mathsPoints = 80;
		
		System.out.println("Valores del primer objeto: ");
		System.out.println(obj.engPoints);
		System.out.println(obj.mathsPoints);
	
		}
	}
}
