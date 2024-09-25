package passbyvalueandreference;

public class PrimitivePassbyValue_Reference {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		fuc(a,b);
		
		System.out.println(a);
		System.out.println(b);
		
//		A1 a1= new A1();
		
		
	}

	public static void fuc(int a, int b) {
		
		a=110;
		b=120;
		System.out.println(a);
		System.out.println(b);
		
	}

}
class A1{
	int a;
	int b;
}
