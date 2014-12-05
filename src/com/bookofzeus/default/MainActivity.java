package com.bookofzeus.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView text = new TextView(this);
		text.setText("Building Android application without Eclipse is fun!");
		setContentView(text);
	}
}
