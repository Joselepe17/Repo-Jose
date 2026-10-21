package arrays;

public class Entrenamiento11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {3, 5, 7, 2, 8};
		int minimo=nums[0];
		for(int num:nums) {
			if(num<minimo) {
				minimo=num;
			}
			
		}
		System.out.println("El minimo es "+ minimo);
	}

}
