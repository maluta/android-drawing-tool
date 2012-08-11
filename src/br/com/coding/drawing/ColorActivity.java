package br.com.coding.drawing;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ColorActivity extends Activity {

	private static final String TAG = null;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.colors);
		Spinner s = (Spinner) findViewById(R.id.spinner1);
		String[] array_spinner = new String[5];
		array_spinner[0]="Blue";
		array_spinner[1]="Red";
		array_spinner[2]="Green";
		array_spinner[3]="Yellow";
		array_spinner[4]="Black";
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_spinner_item, array_spinner);
		s.setAdapter(adapter);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);     
		return true;
	}
}

