package bucles;

public class Ejercicio9 {

	public static void main(String[] args) {
		int cantidad=0;
		int multiploDe=7;
		for(int i=1; i<=200; i++) {
			if(i % multiploDe ==0) {
				
				cantidad++;
			}
		} System.out.println("La cantidad de multiplos de 7 entre 1 y 200 es " + cantidad);
		}
	}


