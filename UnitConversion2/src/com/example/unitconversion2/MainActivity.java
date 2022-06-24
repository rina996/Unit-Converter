package com.example.unitconversion2;

import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity implements OnItemClickListener
{
	public final static String CV_TYPE = "com.example.unitconversion2.MESSAGE";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView lv = (ListView)findViewById(R.id.conversionsList);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    	Intent intent = new Intent(this, UnitConversion.class);
    	intent.putExtra(CV_TYPE, position);
    	startActivity(intent);
    }

}
