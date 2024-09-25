package passbyvalueandreference;

public class PassBy_Reference_Value {
	
	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;

	    // we pass the object to foo
	    foo(aDog);
	    System.out.println();
	    foo(oldDog);
	    System.out.println();
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println(aDog.getName().equals("Max")); // true
	    System.out.println(aDog.getName().equals("Fifi")); // false
	    System.out.println( aDog == oldDog); // true
	}

	public static void foo(Dog d) {
	    System.out.println(d.getName().equals("Max")); // true
	    // change d inside of foo() to point to a new Dog instance construct red with name member variable set to "Fifi"
//	    d = new Dog("Fifi");
//	    d = new Dog("Fifi");
	    System.out.println(d.getName().equals("Fifi")); // true
	    System.out.println(d.getName().equals("Max"));
	}

}

class Dog{
	private String name;
	
	Dog(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
//	setName(){
//		
//	}
	
	
	
	
}
