package pojo;
import java.util.Scanner;
public class Pojo9 {


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
		
		if(email.contains(name.toLowerCase().replace(" " , "")) && email.contains(".com")) {
			
			Restaurant4 r4=new Restaurant4();
			r4.setId(id);
			r4.setName(name);
			r4.setEmail(email);
			r4.setPhone(phone);
			r4.setAddress(address);
			
			System.out.println();
			System.out.println("ID : "+r4.getId());
			System.out.println("NAME : "+r4.getName());
			System.out.println("EMAIL : "+r4.getEmail());
			System.out.println("PHONE : "+r4.getPhone());
			System.out.println("ADDRESS : "+r4.getAddress());
			
		}
		else {
			System.out.println("Enter a valid Email : ");
		}
		
	}

}

class Restaurant4 {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Restaurant4(int id, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address=address;
	}
	public Restaurant4() {
		// TODO Auto-generated constructor stub
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

