package br.com.coding.drawing;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

@SuppressLint("ParserError")
public class MainActivity extends Activity {

	private static final String TAG = null;
	DrawView drawView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);

		drawView = new DrawView(this);
		drawView.setBackgroundColor(Color.WHITE);
		setContentView(drawView);
		drawView.requestFocus();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);     
		return true;

	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.menu_settings: {
			Log.e(TAG,"colors settings");
			Intent i = new Intent(this, ColorActivity.class);
			startActivity(i);			
			return true; 
		}

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
