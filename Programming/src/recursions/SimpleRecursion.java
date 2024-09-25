package recursions;

public class SimpleRecursion {
	
	public static void main(String[] args) {
//		int n=10;
		func(1);
	}

	public static void func(int n) {
		// TODO Auto-generated method stub
//		if(n==0)	return;
		
		System.out.println(n);
		
		func(n+1);
		
	}
	
}
