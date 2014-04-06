package edu.berkeley.cs160.ideo.cookbuddy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Help extends Activity {
	ImageButton home;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//The following line removes the title bar and hence, better UI
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		// And after removing the title bar, set content view
		setContentView(R.layout.help);
		home = (ImageButton) findViewById(R.id.home);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void goHome(View view){
		finish();
	}
	
}
