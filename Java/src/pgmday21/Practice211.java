package pgmday21;

import java.util.Scanner;

public class Practice211 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();  // Read the number of elements
			int[] arr = new int[n];

			// Reading the array elements
			for (int i = 0; i < n; i++) {
			    arr[i] = scanner.nextInt();
			}

			// Compare every pair and print if the second value is larger than the first
			for (int i = 0; i < n; i++) {
			    for (int j = i + 1; j < n; j++) {
			        if (arr[j] > arr[i]) {
			            System.out.println(arr[i] + " " + arr[j]);
			        }
			    }
			}
		}
	}

}
