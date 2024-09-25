package day28;

public class PojoPractice1 {

	public static void main(String[] args) {
		
		Model6 m = new Model6(1,"Allen Walker",56434541);
		
		System.out.println(m.getId());
		System.out.println(m.getcName());
		System.out.println(m.getcNum());
//		System.out.println(m.getId()+" "+m.getcName()+" "+m.getcNum());
		
		System.out.println();
		
		Model6 m1 = new Model6(2,"Enriques Iglesias",56434541);
		
		System.out.println(m1.getId());
		System.out.println(m1.getcName());
		System.out.println(m1.getcNum());
		System.out.println(m.getId()+" "+m.getcName()+" "+m.getcNum());
		
	
		
		
	}

}

class Model6{
	
	int id;
	String cName;
	int cNum;
	
	

	public Model6() {
		super();
	}
	
	//make it private
	Model6(int id, String cName, int cNum) {
		super();
		this.id = id;
		this.cName = cName;
		this.cNum = cNum;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	
	
}
