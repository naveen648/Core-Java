package day33;

class Situation2 {

	public static void main(String[] args) {
		
		//understand working of class members
		
		//Code segment loads
		System.out.println(Demo2.a);
				
	}

}

class Demo2{
	
	static int a;
	
	//try to use this with and without static to understand working of memory

	static
	{
		System.out.println("Inside static block");
	}
	
	static void disp() {
		
	}
	
}