package pojo;
import java.util.Scanner;
public class Pojo1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		int phone=sc.nextInt();
		sc.nextLine();
		String password=sc.nextLine();
		String address=sc.nextLine();
		
		Customer1 m1=new Customer1();
		
		m1.setId(id);
		m1.setName(name);
		m1.setEmail(email);
		m1.setPhone(phone);
		m1.setPassword(password);
		m1.setAdress(address);
		
		System.out.println("ID : "+m1.getId());
		System.out.println("NAME : "+m1.getName());
		System.out.println("EMAIL : "+m1.getEmail());
		System.out.println("PHONE : "+m1.getPhone());
		System.out.println("PASSWORD : "+m1.getPassword());
		System.out.println("ADRESS : "+m1.getAdress());
		
	}

}

class Customer1 {
	private int id;
	private String name;
	private String email;
	private int phone;
	private String password;
	private String address;
	
	
	public Customer1(int id, String name, String email, int phone, String password, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address=address;
	}
	public Customer1() {
		
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
	public String getAdress() {
		return address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	
	
	
}

