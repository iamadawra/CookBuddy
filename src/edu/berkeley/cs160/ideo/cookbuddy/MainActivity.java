package edu.berkeley.cs160.ideo.cookbuddy;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
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
		addRecipeButton.setBackgroundResource(R.drawable.add);
		ImageButton profileButton = (ImageButton) findViewById(R.id.profilePageButton);
		profileButton.setBackgroundResource(R.drawable.profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// source: http://stackoverflow.com/questions/14207392/android-button-click-go-to-another-xml-page
	public void helpClick(View view) {
		Intent intent = new Intent(MainActivity.this, Help.class);
		startActivity(intent);
	}
	
	// source: http://www.androiddevelopersolution.com/2012/09/crop-image-in-circular-shape-in-android.html
	public Bitmap getRoundedShape(Bitmap scaleBitmapImage) {
		  int targetWidth = 50;
		  int targetHeight = 50;
		  Bitmap targetBitmap = Bitmap.createBitmap(targetWidth, 
		                            targetHeight,Bitmap.Config.ARGB_8888);
		  
		                Canvas canvas = new Canvas(targetBitmap);
		  Path path = new Path();
		  path.addCircle(((float) targetWidth - 1) / 2,
		  ((float) targetHeight - 1) / 2,
		  (Math.min(((float) targetWidth), 
		                ((float) targetHeight)) / 2),
		          Path.Direction.CCW);
		  
		                canvas.clipPath(path);
		  Bitmap sourceBitmap = scaleBitmapImage;
		  canvas.drawBitmap(sourceBitmap, 
		                                new Rect(0, 0, sourceBitmap.getWidth(),
		    sourceBitmap.getHeight()), 
		                                new Rect(0, 0, targetWidth,
		    targetHeight), null);
		  return targetBitmap;
	}

}
