package com.example.activitylifycycle;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
	private List<Map<String, String>> data;
	private Context context;
	
	public ListAdapter(Context context, List<Map<String, String>> data){
		this.data = data;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
	return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.list_item,null);
		}
		TextView t1 = (TextView)convertView.findViewById(R.id.item);
		TextView t2 = (TextView)convertView.findViewById(R.id.item_name);
		t1.setText(data.get(position).get("id"));
		t2.setText(data.get(position).get("name"));
		return convertView;
	}


}
