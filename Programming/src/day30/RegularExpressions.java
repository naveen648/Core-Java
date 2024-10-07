package day30;

import java.util.Arrays;
import java.util.HashSet;

public class RegularExpressions {
	
	public static void removeDomainUrls(String s) {
		
//		HashSet<String> hs=new HashSet<>(Arrays.asList(s.split(",")));
		HashSet<String> hs=new HashSet<>();
		String[] t=s.split(",");
		
		System.out.println("-----Before-----");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		System.out.println();
		
		System.out.println("-----After-----");
		for(int i=0; i<t.length; i++) {
			
//			String[] tmp=t[i].split(".");
//			System.out.println(tmp.length);
//			System.out.println(tmp[1]);
//			hs.add(tmp[1]);
			
			String[] tmp=t[i].split("\\.");
			hs.add(tmp[1]);
			
		}
		
		for(String urls : hs) {
			System.out.println(urls);
		}
	}
	
	public static void main(String[] args) {
		
		String s="www.fb.com,www.tap.com,www.google.com,www.fb.com,www.tap.com,www.microsoft.com,www.insta.com";
		
		removeDomainUrls(s);
	}
}


