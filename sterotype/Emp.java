package com.springcore.sterotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	
		private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}


   
}
