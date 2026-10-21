package gonzalezCorralJoseManuel;

public class vuelto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double P=40 ;
		double E=79.36 ;
		double cambio= E-P;
		double billetes10=  (int)cambio/10;
		
		
	
		
		
		System.out.println("El precio es " + P + " el pago ha sido de " + E );
		System.out.println("El cambio es " + (E-P));
		System.out.println("El cambio en billetes de 10 es de  " + (int) billetes10+ " billetes");
		double cambioEuros= cambio-(10*billetes10);
		System.out.println("El cambio en euros es de  " + (int) cambioEuros  );
		double cambioCentimos= cambioEuros-(int)cambioEuros;
		System.out.println("El cambio en centimos es de  " +  cambioCentimos  );
	}

}
