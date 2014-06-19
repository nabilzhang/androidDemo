package com.example.activitylifycycle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class SecondListActivity extends Activity {
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_list);
		listView = (ListView) findViewById(R.id.list);

		ListAdapter adapter = new ListAdapter(this,getData());
		listView.setAdapter(adapter);

	}

	private List<Map<String, String>> getData() {
		Map<String, String> m1 = new HashMap<String, String>(), m2 = new HashMap<String, String>();
		m1.put("id", "1");
		m1.put("name", "nam");

		m2.put("id", "2");
		m2.put("name", "name2");
		return Arrays.asList(m1, m2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_list, menu);
		return true;
	}

}
