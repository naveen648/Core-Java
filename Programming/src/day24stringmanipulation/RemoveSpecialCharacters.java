package day24stringmanipulation;

import java.util.Scanner;

public class RemoveSpecialCharacters {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		checkSpecificCharacters(s);
		
		
	}

	public static void checkSpecificCharacters(String s) {
		
		char tmp;
		String s1="";
		
		for(int i=0; i<s.length(); i++) {
			
			tmp=s.charAt(i);
			if(((tmp>='A' && tmp<='Z') || (tmp>='a' && tmp<='z')) || 
					(tmp>='0' && tmp<='9') ) {
				
				s1=s1+s.charAt(i);
				
			}
			
		}
		System.out.println(s1);
	}
}
