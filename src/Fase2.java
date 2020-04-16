
import java.util.ArrayList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		
		char nombre;
		
		List<Character> nom = new ArrayList<Character>();
		int i;
		
		nom.add('N');
		nom.add('u');
		nom.add('r');
		nom.add('i');
		nom.add('a');
		
		for (i = 0; i < nom.size(); i++) {
			nombre = nom.get(i);
			System.out.print(nombre +" ");
			
			if(nom.get(i) == 'a'|| nom.get(i) == 'e' || nom.get(i) == 'i'|| nom.get(i) == 'o'||nom.get(i) == 'u' ) {
				System.out.println( nom.get(i) + "Soy una VOCAL");
				} else if (nom.get(i) != 'a'|| nom.get(i) != 'e' || nom.get(i) != 'i'|| nom.get(i) != 'o'||nom.get(i) != 'u' ){
				System.out.println("Soy una CONSONANTE");
				}else {
				System.out.println("Els noms de persones no contenen números!");
				}
			}
		}
				

}
		
