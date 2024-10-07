package day33;

public class Situation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(UnKnown.a);
		
		UnKnown ob1 = new UnKnown(1);
		
		System.out.println(ob1.id);
		System.out.println(ob1.a);

	}

}

class UnKnown{
	int id;
	static int a=method();
	
	static {
		System.out.println("Inside static block");
//		System.out.println(a);
	}
	
	static int method() {
		System.out.println("Inside Static Method");
//		i=30;
		return 10+20;
	}
	
	UnKnown(int id){
		this.id=id;
		this.a=id;//confusing
	}
	
}
