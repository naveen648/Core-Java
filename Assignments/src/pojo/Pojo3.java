package pojo;
import java.util.Scanner;
public class Pojo3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Details : separated by commas ',' ");
		
		String input=sc.nextLine();
		String[] t=input.split(",");
		
		Customer3 m3=new Customer3(Integer.parseInt(t[0]), t[1], t[2], Integer.parseInt(t[3]), t[4],t[5]);
		
		System.out.println();
		
		System.out.println("ID : "+m3.getId());
		System.out.println("NAME : "+m3.getName());
		System.out.println("EMAIL : "+m3.getEmail());
		System.out.println("PHONE : "+m3.getPhone());
		System.out.println("PASSWORD : "+m3.getPassword());
		System.out.println("ADDRESS : "+m3.getAddress());
		
	}

}

class Customer3 {
	private int id;
	private String name;
	private String email;
	private int phone;
	private String password;
	private String address;
	
	
	public Customer3(int id, String name, String email, int phone, String password, String address) {
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

