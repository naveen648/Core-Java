package day28;

public class Situation1Heterogeneous {

	public static void main(String[] args) {
		
//		int[] int=new int[5];  //heterogeneous elements not possible

//		int[0]="Hello";
//		int[1]=22;
//		int[2]=85.655;
//		int[3]='A';
//		int[3]=56.3;
		
		Object[] obj=new Object[5];
		
		obj[0]="Hello";
		obj[1]=22;
		obj[2]=85.655;
		obj[3]='A';
		obj[3]=56.3;
		
		for(Object o : obj) {
			System.out.println(o);
		}
		
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);			
		}
		
	}

}
