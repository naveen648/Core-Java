package day28;

import java.util.Scanner;

public class Pojo2SplitMethod2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Customers to Create : ");
		
		int n=sc.nextInt();
		sc.nextLine();
		
		//Declaring Static Array of Model3
		Model3[] m=new Model3[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Enter The Details : ");
			
			//input of the Customer
			String input=sc.nextLine();
			String[] arr=input.split(",");
			
			m[i] =new Model3(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
						
		}
		
		System.out.println("Enter the Customer index no : ");
		int j=sc.nextInt();
	
		System.out.println(m[j].getId());
		System.out.println(m[j].getcName());
		System.out.println(m[j].getcNum());
		
		
		
		
		
		
	}

}

class Model3{
	
	int id;
	String cName;
	int cNum;
	
	public Model3() {
		super();
	}

	public Model3(int id, String cName, int cNum) {
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
