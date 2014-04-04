package edu.berkeley.cs160.ideo.cookbuddy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.ExpandableListView;

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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
