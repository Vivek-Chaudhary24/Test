package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Mumbai")
	private String city;
	@Value("Boriwali")
	private String street;
	
	@Value("#{12+36}")
	public int x;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double e;
	
	@Value("#{T(java.lang.Math).E }")
	private double m;
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	@Value("#{temp}")
	private List<String> number;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public List<String> getNumber() {
		return number;
	}
	public void setNumber(List<String> number) {
		this.number = number;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", x=" + x + ", e=" + e + ", m=" + m + ", number="
				+ number + "]";
	}
	
	

	
	
	

}
