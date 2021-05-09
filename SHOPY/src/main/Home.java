package main;

public class Home {

	public static void main(String[] args) {
	  Customer myaCustomer =  new Customer("ahmed", "a.a@gmail.com", "01235468", "asdferf56", "8 of may");
	  Cart mycart = new Cart();
	  Product myProduct = new Product("lap", "laptop", 10000);
	  mycart.add_product(myProduct);
	  mycart.Submit(myaCustomer);

	}

}
