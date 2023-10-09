package Item1;

public class Item_c {

	public static void main(String[] args) {
		int nums[]= {17, -12, 29, 5, -10};
		int x = 5, acum = 0;
		for(int num: nums) {
			if(num > x) {
				acum += num;
			}
		}
		  System.out.println("La suma de lo numeros en el array es: " + acum);
	}

}
