package decisiones;

public class Decisiones {

	public static void main(String[] args) {
		
		
		int a= 20;
		String numero ;
		if (a>0) {
			numero="positivo";
			System.out.printf("El numero %d es %s.%n",a, numero);
			if (a% 2 == 0) {
				numero=" par";
				System.out.printf("El numero %d es %s.%n",a, numero);
					if (a% 5 ==0) {
						numero=" divisible por 5";
						System.out.printf("El numero %d es %s.%n",a, numero);
					
					
						} else if (a% 5 !=0) {
								numero="no es divisible por 5";
								System.out.printf("El numero %d  %s.%n",a, numero);
							}
			}
				else if (a% 2 !=0 ) {
					numero=" impar";
					System.out.printf("El numero %d es %s.%n",a, numero);
						if (a% 5 !=0) {
							numero="no es divisible por 5";
							System.out.printf("El numero %d  %s.%n",a, numero);
						
					} else if (a% 5 ==0) {
						numero=" divisible por 5";
						System.out.printf("El numero %d es %s.%n",a, numero);
						
					}
				}
				else if (a% 5 !=0) {
					numero="no es divisible por 5";
					System.out.printf("El numero %d  %s.%n",a, numero);
				}
		} 
		if (a>0 && a% 2 == 0 && a% 5 ==0 ) {
			System.out.println("El numero lo cumple todo");
		} else {
			System.out.println("El numero no lo cumple todo");
		}
		
		
		
		
		
		
		
	}

}
