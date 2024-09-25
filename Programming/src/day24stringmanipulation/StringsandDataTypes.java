package day24stringmanipulation;

import java.util.Scanner;

public class StringsandDataTypes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		checkSpecificCharacters(s);
		
		
	}

	public static void checkSpecificCharacters(String s) {
		
		int vc=0;
		int cc=0;
		int num=0;
		int sc=0;
//		char tmp;
		
		//never give constants in 1st place
		for(int i=0; i<s.length(); i++) {
			
			char tmp=s.charAt(i);
			if((tmp>='A' && tmp<='Z') || (tmp>='a' && tmp<='z')) {
				System.out.println("Hii");
				if(!((tmp=='A'||tmp=='E'||tmp=='I'||tmp=='O'||tmp=='U') 
						|| (tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u'))) {
					cc++;
				}
				else {
					vc++;
				}
			}
			else if(tmp>='0' && tmp<='9') {
				num++;
			}else {
				sc++;
			}
		}
		
		System.out.println("Vowel Count : "+vc);
		System.out.println("Constants Count : "+cc);
		System.out.println("Numericals : "+num);
		System.out.println("Special Characters : "+sc);
	}

}
