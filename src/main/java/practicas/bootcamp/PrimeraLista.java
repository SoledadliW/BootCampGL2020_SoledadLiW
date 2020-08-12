package practicas.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> letters = new ArrayList<String>();
	letters.add("A");
	letters.add("B");
	letters.add("C");
	System.out.println(letters);
	System.out.println(letters.size());
	
	letters.add(1,"X");
	System.out.println(letters);
	
	}

}
