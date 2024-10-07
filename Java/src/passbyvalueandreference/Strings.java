package passbyvalueandreference;

public class Strings {
	public static void main(String[] args) {
		String s="Hello";
		
		fun1(s);
		fun2(s);
		System.out.println("Inside Main s = "+s);
		System.out.println("Inside Main s = "+s);
	}

	public static void fun1(String s) {
		
		s=s+"Hii";
		
		System.out.println("Inside fun1 s = "+s);
	}
	
	public static String fun2(String s) {
		s=s+"HiiBro";
		System.out.println("Inside fun2 s = "+s);
		return s;
		
	}
	
	
}
