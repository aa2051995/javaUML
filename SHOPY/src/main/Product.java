package main;
import java.util.UUID;
public class Product {
private String name;
private String desc;
private float price;
private String Product_code;
public Product(String l_name, String l_desc, float l_price) {
	name = l_name;
	price = l_price;
	desc = l_desc;
	UUID uuid = UUID.randomUUID();
	setProduct_code(uuid.toString());  
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getProduct_code() {
	return Product_code;
}
public void setProduct_code(String product_code) {
	Product_code = product_code;
}
}
