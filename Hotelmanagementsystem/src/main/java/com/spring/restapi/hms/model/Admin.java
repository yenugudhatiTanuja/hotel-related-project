package com.spring.restapi.hms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@Column(name = "adminId")
	private @NotNull int adminId;
	@Column(name = "admin_name")
	private @NotNull String adminName;
	@Column(name = "email")
	private @NotNull String email;
	@Column(name = "password")
	private @NotNull String password;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Hotel> hts;

	public Set<Hotel> getHts() {
		return hts;
	}

	public void setHts(Set<Hotel> hts) {
		this.hts = hts;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin(int adminId, String adminName, String email, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.email = email;
		this.password = password;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

}
