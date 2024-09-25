package day22;

public class Strings {
	
	public static void main(String[] args) {
		String s1=1+1+"1";  //**** Calculated from RHS to LHS ****// 21
		String s2=1+"1"+1;  //**** Calculated from RHS to LHS ****// 111
		String s3="1"+1+1;  //**** Calculated from RHS to LHS ****// 111
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
