package com.haomins.www.workwithdatabinding.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.haomins.www.workwithdatabinding.R;
import com.haomins.www.workwithdatabinding.databinding.ActivityMainBinding;
import com.haomins.www.workwithdatabinding.model.User;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);

		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

		User user = new User();
		user.setName("Jadas Nakamoto");
		user.setEmail("JNmoto@moto.rola");

		binding.setUser(user);
	}
}
