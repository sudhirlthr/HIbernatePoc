/**
 * 
 */
package com.sudhir.dto;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author sudhirk
 *
 */
@Entity
public class UserDetails {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@Embedded
	private Address address;
	@Temporal(TemporalType.DATE)// for to store only Date without hh:MM:ss
	private Date doj;
	@Transient //for not to write into DB
	private String username;
	@Lob// for larger content more than 255 which is default in ny sql
	private String description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
