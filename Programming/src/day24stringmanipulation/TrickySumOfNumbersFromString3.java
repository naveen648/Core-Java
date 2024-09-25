package day24stringmanipulation;

import java.util.Scanner;

public class TrickySumOfNumbersFromString3 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		checkSpecificCharacters(s);
		//expected output is 6
		
		
	}

	public static void checkSpecificCharacters(String s) {
		
		char tmp;
		String s1="";
		
		int s2=0;
		
		for(int i=0; i<s.length(); i++) {
			
			tmp=s.charAt(i);
			if(((tmp>='A' && tmp<='Z') || (tmp>='a' && tmp<='z'))  ) {
				
				s1=s1+s.charAt(i);
				
			}
			else if((tmp>='0' && tmp<='9')) {
				s2=s2+(s.charAt(i)-48);
			}
			
		}
		System.out.println(s1+s2);
	}
}
