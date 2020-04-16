
import java.util.ArrayList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		
		char nombre;
		
		List<Character> nom = new ArrayList<Character>();
		
		nom.add('N');
		nom.add('u');
		nom.add('r');
		nom.add('i');
		nom.add('a');
		
		for (int i = 0; i < nom.size(); i++) {
			nombre = nom.get(i);
			System.out.print(nombre +" ");
		}
		
	}

}
