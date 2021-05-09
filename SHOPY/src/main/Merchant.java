package main;

import java.util.ArrayList;

public class Merchant extends Account {
	private ArrayList<Product> products;
public Merchant(String l_name, String l_email,
			String l_phone, String l_password, String l_address)
	{
	super(l_name, l_email, l_phone, l_password, l_address);
	
	}
public Boolean resell(ArrayList<String> products_codes) {
	
	for(Product pro: products) {
		if(products_codes.contains(pro.getProduct_code()))
			products_codes.remove(pro);
	}
	return true;
	
}
@Override
public String make(Order order) {
	for(Product pro : order.getAllProduct()) {
		products.add(pro);
	}
	super.make(order);
	return "ok";
}
}
