package pgmday21;

import java.util.Scanner;

public class ConsecutiveArrays {
	
	public static void main(String[] args) {
															
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] arr=new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scanner.nextInt();
			}
			
			rearrangeArrays(arr);
		}
	}

	public static void rearrangeArrays(int[] arrays) {
		for(int i=0; i<arrays.length-1;i++) {
			if(arrays[i]+1==arrays[i]) {
				System.out.print(arrays[i]+" ");
			}else {
//				System.out.println();
				System.out.println(arrays[i]);
			}
		}
		System.out.print(arrays[arrays.length-1]);
		
	}
	
}
