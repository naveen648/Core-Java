package pojo;
import java.util.Scanner;
public class Pojo10 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the Customer Details : ");
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		String phone=sc.nextLine();
		String address=sc.nextLine();
		System.out.println();
		
		char ph=phone.charAt(0);
		
		if(ph>='6' && ph<='9') {
			
			Restaurant5 r5=new Restaurant5(id, name, email, phone, address);
			
			System.out.println();
			System.out.println("ID : "+r5.getId());
			System.out.println("NAME : "+r5.getName());
			System.out.println("EMAIL : "+r5.getEmail());
			System.out.println("PHONE : "+r5.getPhone());
			System.out.println("ADRESS : "+r5.getAddress());
			
		}
		else {
			System.out.println("Enter a valid Phone Number : ");
		}
		
	}

}

class Restaurant5 {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Restaurant5(int id, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address=address;
	}
	public Restaurant5() {

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

