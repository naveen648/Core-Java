package pojo;
import java.util.Scanner;
public class Pojo6 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Details : ");
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		String phone=sc.nextLine();
		String address=sc.nextLine();
		
		Restaurant m6=new Restaurant();
		
		m6.setId(id);
		m6.setName(name);
		m6.setEmail(email);
		m6.setPhone(phone);
		m6.setAddress(address);
		
		System.out.println("ID : "+m6.getId());
		System.out.println("NAME : "+m6.getName());
		System.out.println("EMAIL : "+m6.getEmail());
		System.out.println("PHONE : "+m6.getPhone());
		System.out.println("ADRESS : "+m6.getAddress());
		
	}

}

class Restaurant {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Restaurant(int id, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address=address;
	}
	public Restaurant() {

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

