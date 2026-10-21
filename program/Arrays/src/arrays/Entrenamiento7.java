package arrays;

public class Entrenamiento7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1= {1, 3, 5, 7};
		int [] nums2= {2, 4, 6, 8};
		int [] nums3= new int [4];
		for (int i=0; i< nums3.length; i++) {
			nums3[i]=nums1[i]*nums2[i];
			System.out.print(nums3[i]+ " ");
		}
		
	}

}
