
public class Encapsulation {
	
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();
		e.setName("Amol Jagdale");
		e.setName("Amit Jagdale");

		System.out.println(e.name);
	}

}
