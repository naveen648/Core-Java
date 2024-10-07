package day34;

class Parent{
	float heigth=5.8f;
	String eyeColor="Brown";
	String skinColor="Olive Brown";
	String HairColor="Black";
}

class Child extends Parent{
	
}
public class Inheritance {

	public static void main(String[] args) {
		
		Child c=new Child();
		
		System.out.println(c.heigth);
	}

}
