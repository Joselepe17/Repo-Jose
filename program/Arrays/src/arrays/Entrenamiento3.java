package arrays;

public class Entrenamiento3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= {4, 7, 10, 3, 8, 6};
		int suma=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] %2 ==0) {
				suma++;
			}
		}
		System.out.printf("Hay %d números pares %n", suma);
		
	}

}
