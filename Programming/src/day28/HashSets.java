package day28;

import java.util.Arrays;
import java.util.HashSet;

public class HashSets {
	
	public static void main(String[] args) {
		
//		Demo d1=new Demo();
		
		Integer[] arr= {1,2,3,4,5,6,7};
		
		HashSet hs1=new HashSet();
		
		hs1.add(1);
		hs1.add(10.2);
		hs1.add("Hello");
		hs1.add('H');
		hs1.add(10.26521);
		hs1.add(null);
		hs1.add(hs1);
//		hs1.add(d1);
		
		
				
		System.out.println(hs1);
		
		Character[] a= {'a','b','c','d'};
		HashSet<Character> hs3=new HashSet<>(Arrays.asList(a));
		System.out.println(hs3);
		
	}
	
}
class Demo{
	int id;
	String name;
}
