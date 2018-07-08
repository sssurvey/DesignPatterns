package com.haomins.www.workwithdatabinding.model;

public class User {
	String name;
	String email;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User's Name is: ");
		sb.append(getName());
		sb.append("\n User's Email is: ");
		sb.append(getEmail());
		return sb.toString();
	}
}
