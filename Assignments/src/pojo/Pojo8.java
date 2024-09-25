package pojo;
import java.util.Scanner;
public class Pojo8 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Details : ");
		String input=sc.nextLine();
		String[] t=input.split(",");
		
		Restaurant5 r3=new Restaurant5(Integer.parseInt(t[0]), t[1], t[2], t[3], t[4]);
		
		System.out.println();
		System.out.println("ID : "+r3.getId());
		System.out.println("NAME : "+r3.getName());
		System.out.println("EMAIL : "+r3.getEmail());
		System.out.println("PHONE : "+r3.getPhone());
		System.out.println("ADRESS : "+r3.getAddress());
		
	}

}

class Restaurant3 {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Restaurant3(int id, String name, String email, String phone, String address) {
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

