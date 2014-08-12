package com.example.maps123;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Food extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
	    setContentView(R.layout.food);
	
	
	}
}
