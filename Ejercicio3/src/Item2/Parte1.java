package Item2;

public class Parte1 {

	public static void main(String[] args) {
		String saludo = "hola que tal";
		byte[] decodedBytes = saludo.getBytes();
		for (int i = 0; i < decodedBytes.length; i++) {
			decodedBytes[i]++;
		}
		String saludodecod = new String(decodedBytes);
		  System.out.println("String sin correr una letra: " + saludo);
		  System.out.println("String con 1 espacio corrido: " + saludodecod);

	}

}
