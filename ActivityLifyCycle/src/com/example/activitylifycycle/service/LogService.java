package com.example.activitylifycycle.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class LogService extends Service {
	private static final String TAG = "LogService"; 
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	public void onCreate() {
		Log.i(TAG, "onCreate");
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.i(TAG, "onStartCommand");
		return START_STICKY;
	}

	@Override
	public void onDestroy() {
		Log.i(TAG, "onDestroy");
		super.onDestroy();
	}

}
