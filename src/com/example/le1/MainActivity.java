package com.example.le1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

	Button helbut;
	EditText texts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helbut = (Button) findViewById(R.id.b1);
        texts = (EditText) findViewById(R.id.txt);
		helbut.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String data1 = texts.getText().toString();
				Intent i = new Intent(MainActivity.this, ScndActivity.class);
			i.putExtra("username", data1);
				startActivity(i);

			}
		});
	}

        
    }

    
    

