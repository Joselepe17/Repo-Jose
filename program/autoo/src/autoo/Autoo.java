package autoo;

public class Autoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1, j = 1, k =1;
		System.out.println("a) i = ++j -> " + (i=++j));//i=2 j=2 
		i = 1; j = 1; k =1;
		System.out.println("b) i = k++ ->" + (i=k++));//i=1 k=2
		i = 1; j = 1; k =1;
		System.out.println("c) i = k + ++j ->" + ( i = k + ++j));//i=3 k=1 j=2
		i = 1; j = 1; k =1;
		System.out.println("d) i = i + j++ ->" + ( i = i + j++));//i1=2 i2=1 j=2
		i = 1; j = 1; k =1;
		System.out.println("e) i = j + ++k ->" + ( i = j + ++k));//i=3 j=1 k=2
		i = 1; j = 1; k =1;
		System.out.println("f) i = ++j + k++ ->" + (i = ++j + k++));//i=3 j=2 k=2
		i = 1; j = 1; k =1;
		System.out.println("g) j = k-- + --i ->" + ( j = k-- + --i));//j=1 k=0 i=0
		i = 1; j = 1; k =1;
		System.out.println("h) i = k + 1 + ++j -> " + (i = k + 1 + ++j));//i=3 k=1 j=1
	}

}
