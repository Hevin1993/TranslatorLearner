package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","laal"));
        words.add(new Word("green","hara"));
        words.add(new Word("brown","bhoora"));
        words.add(new Word("gray","dhoosar"));
        words.add(new Word("black","kaalee"));
        words.add(new Word("white","saphed"));
        words.add(new Word("blue","neela"));
        words.add(new Word("yellow","peela"));
        words.add(new Word("pink","gulaabee"));

        //to print on screen

        WordAdapter adapter = new WordAdapter(this, words); // simple_list is predefined so that's what we use
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
