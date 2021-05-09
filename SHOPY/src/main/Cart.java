package main;

import java.util.ArrayList;
import java.util.UUID;

public class Cart {
 private  ArrayList<Product> products;
 public Cart() {
	products = new ArrayList<>();
}
 public Boolean  add_product(Product l_product) {
	products.add(l_product);
	return true;
}
public Boolean remove_product (String Prod_code) {
	Product toremove = null ;
	for(Product prod :products) {
		if(prod.getProduct_code() == Prod_code)
			toremove = prod;
	}
	if(toremove != null) {
		products.remove(toremove);
		return  true;
	}
	
	
	return false;
}
 public Boolean Submit(Account account) {
	 UUID uuid = UUID.randomUUID();
	 Order order = new Order(uuid.toString(), products);
	  if(account.make(order) == "ok")
		  return true;
	  return false;
 }
 
}
