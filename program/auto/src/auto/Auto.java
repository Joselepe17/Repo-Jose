package auto;

public class Auto {

	public static void main(String[] args) {
		
		int x= 10 ;
		System.out.println(x);//10
		x++;
		System.out.println(x);//11
		System.out.println(++x);//12
		System.out.println(x++);//12
		System.out.println(x);//13
		System.out.println(x++);//13
		System.out.println(++x);//15
		System.out.println(++x);//16
		++x;
		x++;
		System.out.println(++x);//19
		System.out.println(x++);//19
		System.out.println(++x);//21
		
		char A = 'c';
		char B;
		System.out.println(A++);//c
		System.out.println(A++);//d
		System.out.println(++A);//f
		B = --A;//B=e
		System.out.println(++A);//f
		A++;
		--B;
		System.out.println(B++);//d
		System.out.println(++B);//f
		System.out.println(++A);//h
		System.out.println(B--);//f
		System.out.println(A);//h
		System.out.println(B);//e
		
		int i= 1, j=1, k=1 ;
		System.out.println("a) i = ++j= "+ i=++j);
		
	}
	

}
