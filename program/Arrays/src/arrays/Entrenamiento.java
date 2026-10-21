package arrays;

public class Entrenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums=new int[10];
		for(int i=0; i<nums.length; i++) {
			nums[i]=(i+1)*5;
		}
		int cuantos=0;
		for(int num: nums) {
			if(num%10==0) {
				cuantos++;
			}
		}
		int [] nums1= new int[cuantos];
		int posicion=0;
		for(int num: nums) {
			if (num%10==0) {
				nums1[posicion]=num;
				posicion++;
				
			}
		}
		for(int a: nums) {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int a:nums1) {
			System.out.print(a +" ");
		}
	}

}
