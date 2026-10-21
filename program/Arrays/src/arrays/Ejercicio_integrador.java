package arrays;

public class Ejercicio_integrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1, 2, 3, 4, 5};
		int n= nums.length;
		int [] nums1= new int[n];
		
		for(int i=0; i<n;i++) {
			nums1[n-1-i]=nums[i];
		}
		for(int a:nums1) {
			System.out.print(a + " ");
		}
	}

}
