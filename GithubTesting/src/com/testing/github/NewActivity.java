package com.testing.github;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import android.widget.LinearLayout;

public class NewActivity  extends Activity{
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	        LinearLayout ll=new LinearLayout(NewActivity.this);
	        
	    	TextView tv=new TextView(NewActivity.this);
			Log.e("hi", "hi");
			tv.setText("hello world");
			tv.setTextColor(Color.CYAN);
			ll.addView(tv);
			setContentView(ll);
	}
}
