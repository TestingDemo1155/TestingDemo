package com.testing.github;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class NewActivity  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		TextView tv=new TextView(NewActivity.this);
		tv.setText("hello world");
	}
}
