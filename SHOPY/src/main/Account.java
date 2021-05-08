package main;
import main.Order;
public class Account {
	private String name;
	private String Phone;
	private String password ;
	private String email;
	private String address;
	private Order cust_orders[];
	public Account(String l_name, String l_email,
			String l_phone, String l_password, String l_address)
	{
		name = l_name;
		email  = l_email;
		address = l_address;
		password = l_password;
		Phone = l_phone;
	}
	public String make(Order order) {
		
		return "ok";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
