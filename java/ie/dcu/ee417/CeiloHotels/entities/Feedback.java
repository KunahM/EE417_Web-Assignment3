package ie.dcu.ee417.CeiloHotels.entities;

public class Feedback {

	private String name;
	private Long age;
	private String message;
	private String email;
	
	public Feedback() {}

	public Feedback(String name, Long age, String message, String email) {
		this.setname(name);
		this.setage(age);
		this.setmessage(message);
		this.setemail(email);
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Long getage() {
		return age;
	}

	public void setage(Long age) {
		this.age = age;
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}	
}
