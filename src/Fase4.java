import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Fase4 {

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
			
		}
		
		System.out.println();

		List<Character> Name = new ArrayList<Character>();
		Character fullName;
		int j;

		
		Name.add('N');
		Name.add('u');
		Name.add('r');
		Name.add('i');
		Name.add('a');
		Name.add(' ');
		Name.add('P');
		Name.add('u');
		Name.add('i');
		Name.add('g');
		
		for (j = 0; j < Name.size(); j++) {
			fullName = Name.get(j);
			System.out.print(fullName +" ");
		}

	}

}
