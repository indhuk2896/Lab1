package com.example.le1;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class ScndActivity extends Activity {
	TextView result;
	TextView result1;
	TextView result2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sact);
	result = (TextView) findViewById(R.id.f1);
	result1 = (TextView) findViewById(R.id.f2);
	result2 = (TextView) findViewById(R.id.f3);
	
	Typeface tfont = Typeface.createFromAsset(getAssets(),
			"Oswald-BoldItalic.ttf");
	Typeface t1font = Typeface.createFromAsset(getAssets(),
			"Oswald-Medium.ttf");
	Typeface t2font = Typeface.createFromAsset(getAssets(),
			"PTS55F.otf");
	Intent i = getIntent();
	String datafrmMain = i.getStringExtra("username");
	result.setTypeface(tfont);
	result.setText("Hai " + datafrmMain);
	result1.setTypeface(t1font);
	result1.setText("Hello " + datafrmMain);
	result2.setTypeface(t2font);
	result2.setText("Welcome " + datafrmMain);
	}
}
