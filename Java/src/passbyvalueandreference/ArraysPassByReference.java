package passbyvalueandreference;

public class ArraysPassByReference {
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {10,20,30,40,50};
		
		System.out.println("Inside Main");
		
		for(int a:arr) {
			
			System.out.print(a+" ");
		}
		
		System.out.println();
		fun1(arr);
		System.out.println("inside Main After fun1()");
		
		for(int a:arr) {
			
			System.out.print(a+" ");
		}
	
	}

	public static void fun1(int[] arr) {
		
		int val=0;
		for(int i=arr.length-1; i>=0; i--) {
			val=val+10;
			arr[i]=val;
		}
		
		System.out.println("Inside fun1");
		
		for(int a:arr) {
			
			System.out.print(a+" ");
		}
		
		System.out.println();
		
	}
	

}
