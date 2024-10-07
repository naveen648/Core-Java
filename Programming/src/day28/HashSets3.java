package day28;

import java.util.Arrays;
import java.util.HashSet;

public class HashSets3 {
	
	public static void main(String[] args) {
		
		
		Integer[] arr= {1,2,3,4,5,6,7};
		
		HashSet<Demo1> hs1=new HashSet<>();
		Demo1 s1=new Demo1(1,"Naveen","Bng");
		Demo1 s2=new Demo1(2,"Dude","Bng");
		
		hs1.add(s1);
		hs1.add(s2);
//		System.out.println();
		
		
				
		System.out.println(hs1);
		
		Character[] a= {'a','b','c','d'};
		HashSet<Character> hs3=new HashSet<>(Arrays.asList(a));
		System.out.println(hs3);
		
	}
	
}
class Demo1{
	int id;
	String name;
	String address;
	
	Demo1(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
}
