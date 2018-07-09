package com.haomins.www.databinding2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.haomins.www.databinding2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
	User user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		user = new User("Hays", "Coh", "Today is a good day ;D", true);
		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		binding.setUser(user);
	}
}
