package Mock;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		patternFun(n);
	}

	public static void patternFun(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
