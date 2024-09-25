package pojo;

import java.util.Scanner;

public class Pojo13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Details of Menu");
		int id=sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		String description = sc.nextLine();
		
		Menu3 m3 = new Menu3(id,name,price,description);
		
		System.out.println();
		System.out.println(m3.getId());
		System.out.println(m3.getName());
		System.out.println(m3.getPrice());
		System.out.println(m3.getDescription());
	}
	
}

class Menu3{
	private int id;
	private String name;
	private int price;
	private String Description;
	
	public Menu3(int id, String name, int price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		Description = description;
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
