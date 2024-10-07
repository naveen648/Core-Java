package day33;

public class Practice1 {
	
	int id;
	static int no;
	
	static{
		System.out.println("Inside static block");
		System.out.println(no);
//		System.out.println(id);  error not static can't access directly
		//create a object to access non-static members inside static block
		
		Practice1 p1=new Practice1();
		
		System.out.println(p1.id);
		System.out.println(p1.no);
		
		
	}

	public static void main(String[] args) {
		
//		System.out.println(UnKnown1.method());
		
		
	}

}
