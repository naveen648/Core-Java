
public class StringConstantPool {

	public static void main(String[] args) {
		
		String s2="JAVA";
		String s1="JAVA";
		//True because we are comparing references of same in String Constant Pool
		System.out.println(s1==s2);
		//True because we are comparing Values
		System.out.println(s1.equals(s2));
		
		// TODO Auto-generated method stub
	}

}
