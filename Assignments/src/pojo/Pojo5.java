package pojo;
import java.util.Scanner;
public class Pojo5 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Details : ");
		
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String email=sc.nextLine();
		String phone=sc.nextLine();
		String password=sc.nextLine();
		String address=sc.nextLine();
		
		
		
		
		char firstNum=phone.charAt(0);
		if(firstNum>='6' && firstNum<='9') {
			
			Customer5 m5=new Customer5(id, name, email, phone, password, address);
			
			System.out.println();
			System.out.println("ID : "+m5.getId());
			System.out.println("NAME : "+m5.getName());
			System.out.println("EMAIL : "+m5.getEmail());
			System.out.println("PHONE : "+m5.getPhone());
			System.out.println("PASSWORD : "+m5.getPassword());
			System.out.println("ADDRESS : "+m5.getAddress());
		}
		else {
			System.out.println();
			System.out.println("Please Enter a Valid Phone Number ");
		}
		
	}

}

class Customer5 {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private String address;
	
	
	public Customer5(int id, String name, String email, String phone, String password, String address) {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
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

