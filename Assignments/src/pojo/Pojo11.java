package pojo;

import java.util.Scanner;

public class Pojo11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Details of Menu");
		int id=sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		String description = sc.nextLine();
		
		Menu1 m1 = new Menu1();
		
		m1.setId(id);
		m1.setName(name);
		m1.setPrice(price);
		m1.setDescription(description);
		
		System.out.println();
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getPrice());
		System.out.println(m1.getDescription());
	}
	
}

class Menu1{
	private int id;
	private String name;
	private int price;
	private String Description;
	
	public Menu1() {
		
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
