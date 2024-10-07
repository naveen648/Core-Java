package day37;

class Plane{
	void fly() {
		System.out.println("Plane is flying");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("CargoPlane is flying");
	}
}

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("PassengerPlane is flying");
	}
}

class FighterPlane extends Plane{
	void fly() {
		System.out.println("FighterPlane is flying");
	}
}



public class MethodsOfInheritance {
	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		cp.fly();
		pp.fly();
		fp.fly();
		
		//
		
		CargoPlane cp3=new CargoPlane();
		PassengerPlane pp3 = new PassengerPlane();
		FighterPlane fp3 = new FighterPlane();
		
		cp3.fly();
		pp3.fly();
		fp3.fly();
		
		//
		
		Plane cp1=new CargoPlane();
		Plane pp1 = new PassengerPlane();
		Plane fp1 = new FighterPlane();
		
		cp1.fly();
		pp1.fly();
		fp1.fly();
		
		//
		
		Plane cp2=new Plane();
		Plane pp2 = new Plane();
		Plane fp2 = new Plane();
		
		cp2.fly();
		pp2.fly();
		fp2.fly();
		
	}
}

