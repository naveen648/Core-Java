package day28;

import java.util.Scanner;

public class Pojo2SplitMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Enter The Details : ");
			String input=sc.next();
			String[] arr=input.split(",");
			
			Model1 m = new Model1(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
			
			System.out.println(m.getId());
			System.out.println(m.getcName());
			System.out.println(m.getcNum());
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}

class Model1{
	
	
	int id;
	String cName;
	int cNum;
	
	
	
	public Model1() {
		super();
	}

	public Model1(int id, String cName, int cNum) {
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
