package pojo;
import java.util.Scanner;
public class Pojo7 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Customers : ");
		
		int n=sc.nextInt();
		Restaurant5[] r2=new Restaurant5[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Enter the Customer Details : ");
			
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String email=sc.nextLine();
			String phone=sc.nextLine();
			String address=sc.nextLine();
			System.out.println();
			
			r2[i]=new Restaurant5();
			
			r2[i].setId(id);
			r2[i].setName(name);
			r2[i].setEmail(email);
			r2[i].setPhone(phone);
			r2[i].setAddress(address);
			
		}
		
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("ID : "+r2[i].getId());
			System.out.println("NAME : "+r2[i].getName());
			System.out.println("EMAIL : "+r2[i].getEmail());
			System.out.println("PHONE : "+r2[i].getPhone());
			System.out.println("ADRESS : "+r2[i].getAddress());
			
		}
		
	}

}

class Restaurant2 {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Restaurant2(int id, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address=address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

