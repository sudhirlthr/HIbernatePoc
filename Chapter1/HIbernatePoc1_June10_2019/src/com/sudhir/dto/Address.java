/**
 * 
 */
package com.sudhir.dto;

import javax.persistence.Embeddable;

/**
 * @author sudhirk
 *
 */
@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	private Integer pincode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	} 
}
