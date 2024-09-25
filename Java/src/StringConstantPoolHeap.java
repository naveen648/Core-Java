
public class StringConstantPoolHeap {

	public static void main(String[] args) {
		
		String s2="JAVA";
		String s1=new String("JAVA");
		
		//False because we are comparing References
		System.out.println(s1==s2);  
		//True because we are comparing Values
		System.out.println(s1.equals(s2));
		
	}

}
