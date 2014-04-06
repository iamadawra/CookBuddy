package edu.berkeley.cs160.ideo.cookbuddy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;

public class Recipe_page_1  extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		
		TextView recipe_1;
		TextView recipe_page_step_1;
		
		
		super.onCreate(savedInstanceState);
		//The following line removes the title bar and hence, better UI
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		// And after removing the title bar, set content view
		setContentView(R.layout.recipe_page_1);
		
		recipe_1 = (TextView) findViewById(R.id.recipe_1);
		recipe_page_step_1 = (TextView) findViewById(R.id.recipe_page_step_1);
		
		ImageButton previous_step = (ImageButton) findViewById(R.id.previous_step);
		previous_step.setBackgroundResource(R.drawable.plus);//help
		ImageButton next_step = (ImageButton) findViewById(R.id.next_step);
		next_step.setBackgroundResource(R.drawable.plus);
		
		ImageButton Button_1 = (ImageButton) findViewById(R.id.Button_1);
		Button_1.setBackgroundResource(R.drawable.plus);//user
		ImageButton Button_2 = (ImageButton) findViewById(R.id.Button_2);
		Button_2.setBackgroundResource(R.drawable.plus);
		ImageButton Button_3 = (ImageButton) findViewById(R.id.Button_3);
		Button_3.setBackgroundResource(R.drawable.plus);
		ImageButton Button_4 = (ImageButton) findViewById(R.id.Button_4);
		Button_4.setBackgroundResource(R.drawable.plus);
		ImageButton Button_5 = (ImageButton) findViewById(R.id.Button_5);
		Button_5.setBackgroundResource(R.drawable.plus);
		
	}
	
	
	
	
	
}
