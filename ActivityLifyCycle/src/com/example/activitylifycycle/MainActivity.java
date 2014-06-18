package com.example.activitylifycycle;

import com.example.activitylifycycle.service.LogService;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{
	
	private final static String  DEBUG_TAG = "demo cycle";
	
	private Button jumpBtn;
	
	private Button popDialogBtn;
	
	private Button toListBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		jumpBtn = (Button)findViewById(R.id.jump);
		popDialogBtn = (Button)findViewById(R.id.dialog);
		toListBtn= (Button)findViewById(R.id.list);
		
		jumpBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		
		popDialogBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, LogService.class);
				startService(in);
				//显示DiaLog
				ProgressDialog.show(MainActivity.this, "a", "a", true, true);
			}
		});
		
		toListBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, ListActivity.class);
				startActivity(in);
			}
		});
		
		Log.i(DEBUG_TAG, "oncreate");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i(DEBUG_TAG, "on start");
	}
	
	@Override
	protected void onPause() {
		super.onResume();
		Log.i(DEBUG_TAG, "onPause");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i(DEBUG_TAG, "onResume");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.i(DEBUG_TAG, "onStop");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(DEBUG_TAG, "onRestart");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(DEBUG_TAG, "onDestroy");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
