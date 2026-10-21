package arrays;

public class Entrenamiento8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= new int[10];
		for(int i=0; i<nums.length; i++) {
			if(i%2==0) {
				nums[i]=i+2;
			}else if(i%2!=0) {
				nums[i]=i-2;
			}
		}
		for(int num:nums) {
			System.out.print(num +" ");
		}
		
		}

}
