package com.haomins.www.workwithdatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class User extends BaseObservable{
	String name;
	String email;

	@Bindable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyPropertyChanged(BR.name);
	}

	@Bindable
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		notifyPropertyChanged(BR.email);
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
