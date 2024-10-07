package day28;

public class Situation1Heterogeneous2 {

	public static void main(String[] args) {
		
		Object[] obj=new Object[5];
		
		obj[0]="Hello";
		obj[1]=22;
		obj[2]=85.655;
		obj[3]='A';
		obj[3]=56.3;
		
		for(Object o : obj) {
			System.out.println(o);
		}
		
	}

}
