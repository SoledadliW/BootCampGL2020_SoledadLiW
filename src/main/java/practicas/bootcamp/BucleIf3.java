package practicas.bootcamp;

import java.util.Scanner;

//4.3
public class BucleIf3 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double compra, descuento, total;
		
		entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor de la compra: ");
		compra = entrada.nextDouble();
		
		if (compra == 300) {
			
			descuento = compra * 0.20;
			total = compra - descuento;
			
			System.out.println("El descuento es de: " + descuento);
			System.out.println("El total de la compra es de: " + total);
			
		}else if(compra>350) {
			descuento = compra * 0.25;
			total = compra - descuento;
			
			System.out.println("El descuento es de: " + descuento);
			System.out.println("El total de la compra es de: " + total);
			
		}else {
			total = compra;
			System.out.println("Sin descuentos, el total es: " + total);
		}

	}

}
