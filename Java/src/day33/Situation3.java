package day33;

class Situation3 {

	public static void main(String[] args) {
		
		/* it prints static block and then prints
		 * static variable slightly confusing but from 
		 * memory perspective, it is working properly*/
		
		Demo2 d2 = new Demo2();
		
		//default value=0
		System.out.println(Demo3.a);
		
		//we can also access using Object member default value=0
		System.out.println(d2.a);
		
		d2.a=20;
		
		//we can modify static variable using object class also
		System.out.println(Demo2.a);
		
		d2.a=30;
		
		//we can modify static variable value using object class also
		System.out.println(d2.a);
		
	}

}

class Demo3{
	
	static int a;
	
	static
	{
//		System.out.println(a);
		System.out.println("Inside static block");
	}
	
}