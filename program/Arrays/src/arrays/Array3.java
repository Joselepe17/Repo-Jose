package arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1, 2, 3, 4};
		int [] nums2= {0, 0, 0, 0};
		for(int i=0; i<nums.length; i++) {
			nums2[i]= nums[i]*2;
			
			System.out.println(nums2[i]);
		}
		
	}

}
