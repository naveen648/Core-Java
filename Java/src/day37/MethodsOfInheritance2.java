package day37;


class Plane1{
	
	void takeOff() {
		System.out.println("Plane Taking Off");
	}
	
	void fly() {
		System.out.println("Plane is flying");
	}
	
	void land() {
		System.out.println("Plane is Landing");
	}
	
}

class CargoPlane1 extends Plane1{
	
//	@Override
	void fly() {
		System.out.println("CargoPlane is flying");
	}
	void cargoPlane1() {
		System.out.println("Cargo Plane is carrying Cargo");
	}
}

class PassengerPlane1 extends Plane1{
//	@Override
	void fly() {
		System.out.println("PassengerPlane is flying");
	}
	
	void passengerPlane1() {
		System.out.println("Passenger Plane is carrying Passengers");
	}
}

class FighterPlane1 extends Plane1{
	void fly() {
		super.fly();
		System.out.println("FighterPlane is flying");
	}
	
	void fighterPlane1() {
		System.out.println("FighterPlane is carrying Weapons");
	}
}



public class MethodsOfInheritance2 {
	public static void main(String[] args) {
		
		CargoPlane1 cp=new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		
		cp.fly();
		pp.fly();
		fp.fly();
		
		Plane1 p1=new Plane1();
		p1.fly();
		
		Plane1 p2=new CargoPlane1();
		p2.fly();
		
		//
//		
//		CargoPlane1 cp3=new CargoPlane1();
//		PassengerPlane1 pp3 = new PassengerPlane1();
//		FighterPlane1 fp3 = new FighterPlane1();
//		
//		cp3.fly();
//		pp3.fly();
//		fp3.fly();
//		
//		//
//		
//		Plane1 cp1=new CargoPlane1();
//		Plane1 pp1 = new PassengerPlane1();
//		Plane1 fp1 = new FighterPlane1();
//		
//		cp1.fly();
//		pp1.fly();
//		fp1.fly();
//		
//		//
//		
//		Plane1 cp2=new Plane1();
//		Plane1 pp2 = new Plane1();
//		Plane1 fp2 = new Plane1();
//		
//		cp2.fly();
//		pp2.fly();
//		fp2.fly();
		
	}
}

