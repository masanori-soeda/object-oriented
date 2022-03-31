package week4.task.vo;

public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return new Address();
	}

	public String getName() {
		return name;
	}

}
