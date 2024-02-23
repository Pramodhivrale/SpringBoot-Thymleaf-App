package com.controllers;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product 
{
	@NotNull(message = "Id is mendetory")
	private Integer pid;
	
	@NotNull(message = "pname is mendetory")
	@Size(message = "max is 3 and min is 8")
	private String pname;
	
	@NotNull(message = "Price is mendotory")
	private Double price;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	

}
