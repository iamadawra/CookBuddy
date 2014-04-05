package edu.berkeley.cs160.ideo.cookbuddy;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	ExpandableListView menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//The following line removes the title bar and hence, better UI
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		// And after removing the title bar, set content view
		setContentView(R.layout.activity_main);
		
		menu = (ExpandableListView) findViewById(R.id.menu);
		menu.setAdapter(new menuAdapter(this));
		menu.expandGroup(0);
		
		// Set images for circle buttons at bottom
		ImageButton helpButton = (ImageButton) findViewById(R.id.helpPageButton);
		helpButton.setBackgroundResource(R.drawable.help);
		ImageButton addRecipeButton = (ImageButton) findViewById(R.id.addRecipeButton);
		addRecipeButton.setBackgroundResource(R.drawable.plus);
		ImageButton profileButton = (ImageButton) findViewById(R.id.profilePageButton);
		profileButton.setBackgroundResource(R.drawable.user);
		//profileButton.setImageDrawable(Drawable.createFromPath("@drawable/profile"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
