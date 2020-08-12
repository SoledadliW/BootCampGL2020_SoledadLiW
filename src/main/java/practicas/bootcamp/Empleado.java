package practicas.bootcamp;

public class Empleado {

	public static double salario;
	public static String nombre = "Alex";
	
public static class EmpleadoDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		salario = 1000;
		System.out.println(Empleado.nombre + " tiene un salario promedio de "+ Empleado.salario);
	}

}
}