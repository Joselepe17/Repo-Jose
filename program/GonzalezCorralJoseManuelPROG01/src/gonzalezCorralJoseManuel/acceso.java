package gonzalezCorralJoseManuel;

public class acceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad=18 ;
		boolean esSocio=true;
		boolean vaConAdulto=false;
		
	
		System.out.printf("%d %s%n", edad, edad>=18 ? "Acceso permitido":
			edad<18 && edad>14 && vaConAdulto && esSocio?
					"Acceso permitido": "Acceso denegado" );
		
		
	}
	
	

}
