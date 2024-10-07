package Mock;

public class Demo {
	public static void main(String[] args) {
		Pojo p1=new Pojo(1,"John","john@gmail.com");
		System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getEmail());
	}
}

class Pojo{
	private int id;
	private String name;
	private String email;
	
	Pojo(){
		
	}
	
	Pojo(int id, String name, String email){
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
}