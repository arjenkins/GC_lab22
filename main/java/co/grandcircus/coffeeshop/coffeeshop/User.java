package co.grandcircus.coffeeshop.coffeeshop;

public class User {

	private String firstname;
	private String lastname;
	private String password;

	public User() {
	}

	public User(String firstname, String lastname, String password) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setPassword(password);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}