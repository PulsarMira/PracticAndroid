package com.example.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    protected String[] massNamePractic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        massNamePractic = getResources().getStringArray(R.array.tests);
        setListAdapter(new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, massNamePractic));

    }

    @Override
    protected void onListItemClick(ListView list, View v, int position, long id) {
        super.onListItemClick(list, v, position, id);

        try {
            Class cl = Class.forName("com.example.myapplication." + massNamePractic[position]);
            startActivity(new Intent(this, cl));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
