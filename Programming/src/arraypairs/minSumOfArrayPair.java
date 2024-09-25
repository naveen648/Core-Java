package arraypairs;

import java.util.Arrays;
import java.util.Scanner;

public class minSumOfArrayPair {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int[] arr=new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			int res=minPairSum(arr);
			System.out.println(res);
		}
		}

	public static int minPairSum(int[] arr) {
		
		Arrays.sort(arr);
		return arr[0]+arr[1];
		
		
	}
}
