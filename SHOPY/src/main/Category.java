package main;

public class Category {
private String name;
private String desc;
public Category(String l_name, String l_desc) {
	name = l_name;
	desc = l_desc;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
}
