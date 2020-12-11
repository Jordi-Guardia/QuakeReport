package com.example.android.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a fake list of earthquake locations.
        ArrayList<Word> earthquakes = new ArrayList<>();
        earthquakes.add(new Word("7,2","San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Word("6,1","London", "july 20, 2015"));
        earthquakes.add(new Word("3,9","Tokyo", "Nov 10, 2014"));
        earthquakes.add(new Word("5,4","Mexico city", "May 3, 2014"));
        earthquakes.add(new Word("2,8","Moscow", "Jan 31, 2013"));
        earthquakes.add(new Word("4,9","Rio de Janeiro", "Aug 19, 2012"));
        earthquakes.add(new Word("1,6","Paris", "Oct 30, 2011"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(
          //      this, android.R.layout.list_items, earthquakes);
        WordAdapter adapter = new WordAdapter(this, earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}