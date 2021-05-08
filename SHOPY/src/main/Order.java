package main;

import java.time.LocalDate;

public class Order {
private LocalDate ord_date;
private LocalDate ord_dilver_date;
private String status;
private String ord_code;
public String addProduct_to_order() {
	return "ok";
}
public LocalDate getOrd_date() {
	return ord_date;
}
public void setOrd_date(LocalDate ord_date) {
	this.ord_date = ord_date;
}
public LocalDate getOrd_dilver_date() {
	return ord_dilver_date;
}
public void setOrd_dilver_date(LocalDate ord_dilver_date) {
	this.ord_dilver_date = ord_dilver_date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getOrd_code() {
	return ord_code;
}
public void setOrd_code(String ord_code) {
	this.ord_code = ord_code;
}

}
