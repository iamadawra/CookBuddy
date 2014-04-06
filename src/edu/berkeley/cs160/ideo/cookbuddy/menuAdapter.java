package edu.berkeley.cs160.ideo.cookbuddy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class menuAdapter extends BaseExpandableListAdapter {
	private Context context;
	String[] parentList = {"Under 5 Minutes", "Under 10 Minutes", "Under 30 Minutes", "Under 60 Minutes"};
	String[][] childList = {
			{
				"Chocolate Chip Cookies"
			},
			{
				"Better Chocolate Chip Cookies",
				"Good Chocolate Chip Cookies"
			},
			{
				"Great Chocolate Chip Cookies",
				"Fab Chocolate Chip Cookies"
			},
			{
				"Best Chocolate Chip Cookies",
				"WOW Chocolate Chip Cookies"
			}
	};
	
	public menuAdapter(Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childList[groupPosition][childPosition];
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		TextView tv = new TextView(context);
		tv.setText(childList[groupPosition][childPosition]);
		tv.setPadding(70, 10, 10, 10);
		tv.setTextSize(22);
		return tv;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return childList[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parentList.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		TextView tv = new TextView(context);
		tv.setText(parentList[groupPosition]);
		tv.setPadding(50, 10, 10, 10);
		tv.setTextSize(28);
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}

}
