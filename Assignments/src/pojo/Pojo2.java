package pojo;
import java.util.Scanner;
public class Pojo2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Customers : ");
		int n=sc.nextInt();
		Customer2[] m2=new Customer2[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the Customer Details : ");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String email=sc.nextLine();
			int phone=sc.nextInt();
			sc.nextLine();
			String password=sc.nextLine();
			String address=sc.nextLine();
			
			m2[i]=new Customer2();
			m2[i].setId(id);
			m2[i].setName(name);
			m2[i].setEmail(email);
			m2[i].setPhone(phone);
			m2[i].setPassword(password);
			m2[i].setAddress(address);
			
			System.out.println();
			
		}
		
		for(Customer2 obj : m2) {
			System.out.println("ID : "+obj.getId());
			System.out.println("NAME : "+obj.getName());
			System.out.println("EMAIL : "+obj.getEmail());
			System.out.println("PHONE : "+obj.getPhone());
			System.out.println("PASSWORD : "+obj.getPassword());
			System.out.println("ADRESS : "+obj.getAddress());
			
		}
		
	}

}

class Customer2 {
	private int id;
	private String name;
	private String email;
	private int phone;
	private String password;
	private String address;
	
	public Customer2() {
		
	}
	
	public Customer2(int id, String name, String email, int phone, String password, String address) {
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

