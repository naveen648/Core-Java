package pojo;

import java.util.Scanner;

public class Pojo12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Menus to Create");
		int input=sc.nextInt();
		
		Menu2[] m2=new Menu2[input];
		
		for(int i=0; i<m2.length; i++) {
			
			System.out.println("Enter the Details of Menu");
			int id=sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			String description = sc.nextLine();
			
			/* Note: we get nullpointer exception if don't create object 
			   inside the array of reference */
			
			m2[i]=new Menu2();
			
			m2[i].setId(id);
			m2[i].setName(name);
			m2[i].setPrice(price);
			m2[i].setDescription(description);
			
			System.out.println();
		}
		
		for (int j = 0; j < m2.length; j++) {
			System.out.println(m2[j].getId());
			System.out.println(m2[j].getName());
			System.out.println(m2[j].getPrice());
			System.out.println(m2[j].getDescription());
		}
		
		
	}
	
}

class Menu2{
	private int id;
	private String name;
	private int price;
	private String Description;
	
	public Menu2() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
