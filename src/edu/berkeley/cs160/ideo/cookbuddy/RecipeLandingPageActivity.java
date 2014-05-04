package edu.berkeley.cs160.ideo.cookbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class RecipeLandingPageActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//The following line removes the title bar and hence, better UI
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//Setting custom animation
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
		
		// And after removing the title bar, set content view
		setContentView(R.layout.activity_recipelandingpage);
		
		ImageButton cookButton = (ImageButton) findViewById(R.id.cook);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void startRecipe(View view){
		Intent i = new Intent(getBaseContext(), Recipe_page_1.class);
        startActivity(i); 
	}

}
