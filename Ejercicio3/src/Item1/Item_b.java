package Item1;

public class Item_b {

	public static void main(String[] args) {
		int arreglo[] = {3, 8, 1};
		boolean ascender = true;
		if(ascender) {
			int n = arreglo.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int indiceMinimo = i;
	            
	            for (int j = i + 1; j < n; j++) { 
	                if (arreglo[j] < arreglo[indiceMinimo]) {
	                    indiceMinimo = j;
	                }
	            }
	            
	            int temp = arreglo[indiceMinimo];
	            arreglo[indiceMinimo] = arreglo[i];
	            arreglo[i] = temp;
	        }
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
		}else {
			int n = arreglo.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int indiceMinimo = i;
	            
	            for (int j = i + 1; j < n; j++) { 
	                if (arreglo[j] > arreglo[indiceMinimo]) {
	                    indiceMinimo = j;
	                }
	            }
	            
	            int temp = arreglo[indiceMinimo];
	            arreglo[indiceMinimo] = arreglo[i];
	            arreglo[i] = temp;
	        }
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
		}

	}

}
