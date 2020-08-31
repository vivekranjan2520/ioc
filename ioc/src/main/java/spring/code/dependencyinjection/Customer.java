package spring.code.dependencyinjection;

public class Customer {

	private String name;
	private int id;

	
	public Customer(int id) {

		this.name = name;
	}
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void dispaly() {
		System.out.println(name +" "+ id);
	}
}
