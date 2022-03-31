package week4.answer.vo;

public class UserAnswer {

	private String name;

	public UserAnswer(String name) {
		this.name = name;
	}

	private AddressAnswer getAddress() {
		return new AddressAnswer();
	}

	public String getAdressPref() {
		return getAddress().getPref();
	}

	public String getAdressCity() {
		return getAddress().getPref();
	}

	public String getName() {
		return name;
	}

}
