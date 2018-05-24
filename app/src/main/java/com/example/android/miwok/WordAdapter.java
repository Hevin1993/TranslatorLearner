package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false); // for the first item we run our app there is no recycler view so we create one
        }
        Word currentWord = getItem(position); // to get position of the word located at i.e. list index


        TextView hindiTextView = (TextView) listItemView.findViewById(R.id.hindi_text_view); // to get the id of textview of hindi
        hindiTextView.setText(currentWord.getHindiTranslation()); // to set the text view with hindi word using hte index(current position )

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(currentWord.getDefaultTranslation());
        return listItemView;

    }
}
