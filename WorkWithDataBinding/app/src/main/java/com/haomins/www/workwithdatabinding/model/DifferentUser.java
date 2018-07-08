package com.haomins.www.workwithdatabinding.model;

import android.databinding.ObservableField;

public class DifferentUser {
	public static ObservableField<String> nameAndEmail = new ObservableField<>();

	public static ObservableField<String> getNameAndEmail() {
		return nameAndEmail;
	}
}
