package com.example.game;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends Activity {

	static int grid_rows=0;
	static int grid_columns=0;
	static GridLayout puzzleGrid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	DisplayMetrics metrics=new DisplayMetrics();
	getWindowManager().getDefaultDisplay().getMetrics(metrics);
	grid_rows=metrics.heightPixels/6;
	grid_columns=metrics.widthPixels/6;
	
	puzzleGrid=(GridLayout) findViewById(R.id.grid);
	puzzleGrid.setRowCount(grid_rows);
	puzzleGrid.setColumnCount(grid_columns);
	
	
	
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
