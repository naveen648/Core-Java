package pgm20;

import java.util.Scanner;

public class RearrangeArrays {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int[] arrs=new int[n];
			
			for (int i = 0; i < arrs.length; i++) {
				arrs[i]=sc.nextInt();
			}
			
			reArrangeArrays(arrs);	
		}
	}

	public static void reArrangeArrays(int[] arr) {
		
		int i=arr.length-1,j=arr.length-1;
		while(i!=0) {
			if(arr[i]==-1) {
				i--;
			}
			else {
				arr[j]=arr[i];
				j--;
				i--;
			}
		}
		while(j>=0) {
			arr[j]=-1;
			j--;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
