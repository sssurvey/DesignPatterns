package com.haomins.www.databinding2;

public class User {
	private String name;
	private String surname;
	private String status;
	private boolean isOnline;

	public static final String online = "ONLINE";
	public static final String offline = "OFFLINE";

	public User (String n, String surn, String status, boolean isOnline){
		this.name = n;
		this.surname = surn;
		this.status = status;
		this.isOnline = isOnline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean online) {
		isOnline = online;
	}
}
