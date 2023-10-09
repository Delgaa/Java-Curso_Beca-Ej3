package Item1;

public class Item_a {

	public static void main(String[] args) {
		String unString = "Bajo el resplandor de la luna, las estrellas brillaban como diamantes en el cielo nocturno";
		char letra = 'a';
		int cont = 0;
		for(int i = 0; i < unString.length(); i++) {
			if(unString.charAt(i) == letra) {
				cont++;
			}
		}
		System.out.println("La letra \""+ letra + "\" aprarece en la oracion un total de: " + cont + " veces");
		
	}

}
