import java.util.*;
public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer > map = new HashMap<String, Integer >();
		map.put("N", 1);
		map.put("u", 1);
		map.put("r", 1);
		map.put("i", 1);
		map.put("a", 1);	
		
		System.out.print(map);

	}

}

class Letras{
	
	public Letras(String letras) {
		
		letra = letras;
		numeroVeces = 0;
	}
	
	public String toString() {
		return "Letra= " + letra + ", veces presente en el nombre" + numeroVeces;
	}
	private String letra;
	
	private Integer numeroVeces;
}