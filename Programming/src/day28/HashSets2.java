package day28;

import java.util.Arrays;
import java.util.HashSet;

public class HashSets2 {
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,6,7};
		HashSet<Integer> hs1=new HashSet<>(Arrays.asList(arr));
		System.out.println(hs1);
		
		//		String s="mississippi";
		////	char[] a1;
		//	HashSet<Character> hs2=new HashSet<>();
		//	for(char c : s) {
		//		hs2.add(c);
		//	}
		//	System.out.println(hs2);
				
		Character[] a= {'a','b','c','d'};
		HashSet<Character> hs3=new HashSet<>(Arrays.asList(a));
		System.out.println(hs3);
		
	}
}
