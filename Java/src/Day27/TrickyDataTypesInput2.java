package Day27;

import java.util.Scanner;

public class TrickyDataTypesInput2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			// try giving Enter while taking input while taking input from String & see differences 
			// try giving space while taking input while taking input from String & see differences 
			
			int a=sc.nextInt();
			
			
			byte b=sc.nextByte();
			
			
			String s=sc.nextLine();
			
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(s);
		}
	}
}
