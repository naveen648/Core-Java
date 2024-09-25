
public class StringHeap {

	public static void main(String[] args) {
		
		String s1=new String("JAVA");
		String s2=new String("JAVA");
		
		//False because we are comparing References addresses 1 in Heap Area 
		//and one more in String Constant Pool
		System.out.println(s1==s2);  
		//True because we are comparing Values
		System.out.println(s1.equals(s2));
		
	}

}
