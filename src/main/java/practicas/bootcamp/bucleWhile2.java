package practicas.bootcamp;

public class bucleWhile2 {

	public void interado() {
		
	int i = 1;
	
	while(i <= 50 ){
			
		if (i % 2 == 0){
				
			System.out.println("Valor iterado " + i + "par");
			i++;	
		} 
		else {
			System.out.println("Valor iterado " + i + "impar");
		}
		
	}
}
}
