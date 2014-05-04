package edu.berkeley.cs160.ideo.cookbuddy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddStepsPage extends Activity {

	LinearLayout steps;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//The following line removes the title bar and hence, better UI
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		// And after removing the title bar, set content view
		setContentView(R.layout.addstep);
		
		steps = (LinearLayout) findViewById(R.id.ingredients);
		EditText toAdd = new EditText(this);
		toAdd.setText("Add Step...");
		toAdd.setBackground(getResources().getDrawable(R.drawable.shape));
		toAdd.setTypeface(Typeface.DEFAULT_BOLD);
		toAdd.setTextColor(Color.parseColor("#663300"));
		toAdd.setTextSize(20);
		EditText toAdd2 = new EditText(this);
		toAdd2.setText("Add Step...");
		toAdd2.setBackground(getResources().getDrawable(R.drawable.shape));
		toAdd2.setTypeface(Typeface.DEFAULT_BOLD);
		toAdd2.setTextColor(Color.parseColor("#663300"));
		toAdd2.setTextSize(20);
		steps.addView(toAdd);
		steps.addView(toAdd2);
		
	}

	public void home(View view){
		startActivity(new Intent(this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
	}
	
	@SuppressLint("NewApi")
	public void addIngredient(View view){
		EditText toAdd = new EditText(this);
		toAdd.setText("Add Step...");
		toAdd.setBackground(getResources().getDrawable(R.drawable.shape));
		toAdd.setTypeface(Typeface.DEFAULT_BOLD);
		toAdd.setTextColor(Color.parseColor("#663300"));
		toAdd.setTextSize(20);
		steps.addView(toAdd);
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
