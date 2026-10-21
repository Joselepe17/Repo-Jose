package bucles;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int cantidad=0;
		
		for(int i=0 ; i<=1_000; i+=100) {
			cantidad++;
			suma+=i;
			
		 } 
		System.out.println( "La suma de los "  + cantidad 
				 + " elementos pedidos es " +  suma );
	}

}
