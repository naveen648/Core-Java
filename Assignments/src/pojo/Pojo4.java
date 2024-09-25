package pojo;
import java.util.Scanner;
public class Pojo4 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Details : ");
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		int phone=sc.nextInt();
		sc.nextLine();
		String password=sc.nextLine();
		String address=sc.nextLine();
		
		
		
		
		
		if(email.contains("@gmail.com")||email.contains("@yahoo.com")) {
			
			Customer4 m4=new Customer4(id, name, email, phone, password, address);
			
			System.out.println("ID : "+m4.getId());
			System.out.println("NAME : "+m4.getName());
			System.out.println("EMAIL : "+m4.getEmail());
			System.out.println("PHONE : "+m4.getPhone());
			System.out.println("PASSWORD : "+m4.getPassword());
			System.out.println("ADDRESS : "+m4.getAddress());
		}
		else {
			System.out.println();
			System.out.println("Please Enter the Valid Email : ");
		}
		
	}

}

class Customer4 {
	private int id;
	private String name;
	private String email;
	private int phone;
	private String password;
	private String address;
	
	
	public Customer4(int id, String name, String email, int phone, String password, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

