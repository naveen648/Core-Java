package Day27;

import java.util.Scanner;

public class TrickyDataTypesInput {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			
			
			sc.nextLine();  //use this to avoid input error from buffer memory
			
			// try giving Enter while taking input 
			// try giving space while taking input 
			
			//Buffer memory is in ram
			
			/*Because Buffer memory takes input from the Line8 and
			when we press enter the it means ENTER='\n' for Buffer Memory,
			while variable 'a' takes input along with it, it also takes Enter a=25\n but while
			scanning in Buffer Memory it scans the 25\n but Buffer reads only 25 and takes \n 
			along with it, but while scanning the nextLine there is \n in buffer memory
			which will take input as '\n' which means new line and doesn't take the input */
			String s=sc.nextLine();
			
			
			System.out.println(a);
			System.out.println(s);
		}
	}
}
