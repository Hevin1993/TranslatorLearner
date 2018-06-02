package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going","tum kahaan ja rahe ho?"));
        words.add(new Word("what is your name","tumhaara naam kya he?"));
        words.add(new Word("My name is","mera naam hai.."));
        words.add(new Word("How are you feeling","aap kaisa mahasoos kar rahe hain"));
        words.add(new Word("I'm feeling good","main achchha mahasoos kar raha hoon"));
        words.add(new Word("Are you coming","kya tum aa rahe ho"));
        words.add(new Word("Yes I'm coming","haan, aa raha hoon"));
        words.add(new Word("I'm coming","main aa raha hoon"));
        words.add(new Word("Let's go","chalie chalate hain"));
        words.add(new Word("come here","yahaan aao"));

        //to print on screen

        WordAdapter adapter = new WordAdapter(this, words); // simple_list is predefined so that's what we use
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
