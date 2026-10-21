package gonzalezCorralJoseManuel;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a= 2;
		double b= 5;
		double c= 5;
	if	(a+b>c) {
		System.out.println("El triangulo es valido");
		
		 if (a==b &&b==c) {
		System.out.println("El triangulo es equilatero");
		}
		 if (a==b&& a!=c) {
			 System.out.println("El triangulo es isosceles");
		 }
		 if (a!=b && b!=c && a!=c) {
			 System.out.println("El triangulo es escaleno");
		 }
	} else  {
		System.out.println("El triangulo no es valido");
	}


}
}
