package com.example.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.view.View;

/**
 * Created by michaelfletes on 11/19/16.
 */


public class StartActivity extends AppCompatActivity {

        public final static String dropDownData = "com.example.hangman.dropdownData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Spinner dropdown = (Spinner)findViewById(R.id.size_spinner);
        Integer[] items = new Integer[]{4, 5, 6, 7, 8, 9, 10};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }

    public void START(View view){
        Intent i = new Intent(this, MainActivity.class);
        Spinner mySpinner = (Spinner) findViewById(R.id.size_spinner);
        Integer text =(Integer) mySpinner.getSelectedItem();
        i.putExtra(dropDownData, text);
        startActivity(i);
    }
}
