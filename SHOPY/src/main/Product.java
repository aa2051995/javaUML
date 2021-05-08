package main;

public class Product {
private String name;
private String desc;
private float price;
public Product(String l_name, String l_desc, float l_price) {
	name = l_name;
	price = l_price;
	desc = l_desc;
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
}
