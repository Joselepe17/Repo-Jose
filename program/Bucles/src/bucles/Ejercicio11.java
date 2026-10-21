package bucles;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=29;
		int ultimo=(num/2+1)*2;
		for(int i=51; i>=num; i--) {
			if(i%2==0 ) {
				System.out.print( i);
				if (i!=ultimo) {
					System.out.print("-");
				}
			}
		}
	}

}
