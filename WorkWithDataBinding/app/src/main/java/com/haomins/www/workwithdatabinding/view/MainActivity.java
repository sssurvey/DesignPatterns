package com.haomins.www.workwithdatabinding.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.haomins.www.workwithdatabinding.R;
import com.haomins.www.workwithdatabinding.databinding.ActivityMainBinding;
import com.haomins.www.workwithdatabinding.model.DifferentUser;
import com.haomins.www.workwithdatabinding.model.User;

public class MainActivity extends AppCompatActivity {
	private User user;
	private DifferentUser duser;
	private MyClickHandlers handlers;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);

		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


		user = new User();
		user.setName("Jadas Nakamoto");
		user.setEmail("JNmoto@moto.rola");
		binding.setUser(user);

		duser = new DifferentUser();
		duser.nameAndEmail.set("shi, shi@ish.ssh");

		handlers = new MyClickHandlers(this);
		binding.setHandlers(handlers);

	}

	public class MyClickHandlers{
		Context context;
		MyClickHandlers(Context c){
			this.context = c;
		}

		public void onButtonClicked(View view){
			Toast.makeText(getApplicationContext(), "Clicked and name changed", Toast.LENGTH_LONG).show();
			user.setName("Satoshi Nakamoto");
		}

		public boolean onButtonLongClick(View view){
			Toast.makeText(getApplicationContext(), "Button LONG pressed", Toast.LENGTH_LONG).show();
			duser.nameAndEmail.set("hahahaha clicked");
			return false;
		}

		public void onButtonClickWithArgs(View view, User user){
			Toast.makeText(getApplicationContext(), "Button With " + user.toString(), Toast.LENGTH_LONG).show();
		}

		public boolean onButtonLongClickAbove(View view){
			Toast.makeText(getApplicationContext(), "sasfd", Toast.LENGTH_LONG).show();
			return false;
		}


	}


}
