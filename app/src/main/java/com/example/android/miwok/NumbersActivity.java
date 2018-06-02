package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // for making a string for words

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","Ek"));
        words.add(new Word("Two","Do"));
        words.add(new Word("Three","Teen"));
        words.add(new Word("Four","Chaar"));
        words.add(new Word("Five","Panj"));
        words.add(new Word("Six","Chhah"));
        words.add(new Word("Seven","Saat"));
        words.add(new Word("Eight","Aath"));
        words.add(new Word("Nine","Nau"));
        words.add(new Word("Ten","Das"));

        //to print on screen

        WordAdapter adapter = new WordAdapter(this, words); // simple_list is predefined so that's what we use
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
