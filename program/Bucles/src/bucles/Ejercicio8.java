package bucles;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int suma=0;
	
	for(int i=1; i<=100; i++) {
		if(i%5==0) {
			
			suma=suma+i;
		}
	} System.out.println("La suma de los multiplos de 5 entre 1 y 100 es " + suma);
	}

}
