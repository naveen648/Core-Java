package passbyvalueandreference;

public class StringsBuilders {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hello");
		
		fun1(s);
		fun2(s);
		System.out.println("Inside Main s = "+s);
		System.out.println("Inside Main s = "+s);
		
	}

	public static void fun1(StringBuilder s) {
		
		s.append("Hii");
		
		System.out.println("Inside fun1 s = "+s);
	}
	
	public static StringBuilder fun2(StringBuilder s) {
		
		s=s.append("HiiBro");
		System.out.println("Inside fun2 s = "+s);
		return s;
		
	}
	
	
}
