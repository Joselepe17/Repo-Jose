package arrays;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {12, 7, 25, 3, 18};
		int numero=3;
		int posicion=-1;
		for(int i=0; i<nums.length; i++) {
			
			
				if(nums[i]==numero) {
					posicion=i;
					break;
				}
			
		}
		if(posicion>=0) {
			System.out.println("El número está en la posición "+ posicion);
		}else {
			System.out.println("El número no está");
		}
	}

}
