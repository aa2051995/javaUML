package main;

public class Merchant extends Account {
	private Product product_list[];
public Merchant(String l_name, String l_email,
			String l_phone, String l_password, String l_address)
	{
	super(l_name, l_email, l_phone, l_password, l_address);
	
	}
public Boolean resell(String products_codes[]) {
	return true;
	
}
@Override
public String make(Order order) {
	super.make(order);
	return "ok";
}
}
