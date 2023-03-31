package ie.dcu.ee417.CeiloHotels.entities;

public class Users {

	private String FirstName;
	private String Surname;
	private Long output;
	private String Email;
	private String Destination;
	private String Roomtype;
	private Long Guest;
	private String Country;
	private String Address;
	private String Address2;
	private Long Zip;
	private String Password;

	
	public Users() {}
	
	public Users(String FirstName, String Surname, Long output, String Email, String Destination, String Roomtype, Long Guest, String Country, String Address, String Address2, Long Zip, String Password) {
		this.FirstName = FirstName;
		this.Surname = Surname;
		this.output = output;
		this.Email = Email;
		this.Destination = Destination;
		this.Roomtype = Roomtype;
		this.Guest = Guest;
		this.Country = Country;
		this.Address = Address;
		this.Address2 = Address2;
		this.Zip = Zip;
		this.Password = Password;

	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String Surname) {
		this.Surname = Surname;
	}
	
	public Long getoutput() {
		return output;
	}
	public void setoutput(Long output) {
		this.output = output;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String Destination) {
		this.Destination = Destination;
	}
	
	public String getRoomtype() {
		return Roomtype;
	}
	public void setRoomtype(String Roomtype) {
		this.Roomtype = Roomtype;
	}
	
	public Long getGuest() {
		return Guest;
	}
	public void setGuest(Long Guest) {
		this.Guest = Guest;
	}
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String Country) {
		this.Country = Country;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}
	
	public Long getZip() {
		return Zip;
	}
	public void setZip(Long Zip) {
		this.Zip = Zip;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
}
