package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","pita"));
        words.add(new Word("mother","maan"));
        words.add(new Word("son","beta"));
        words.add(new Word("daughter","betee"));
        words.add(new Word("older brother","bada bhaee"));
        words.add(new Word("younger brother","chhota bhaee"));
        words.add(new Word("older sister","badee bahan"));
        words.add(new Word("younger sister","chhotee bahan"));
        words.add(new Word("grandmother","daadee ma"));
        words.add(new Word("grandfather","daada jee"));

        //to print on screen

        WordAdapter adapter = new WordAdapter(this, words); // simple_list is predefined so that's what we use
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
