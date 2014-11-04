package com.testing.github;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class NewActivity  extends Activity{
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new LinearLayout(NewActivity.this));
	}
	
}
