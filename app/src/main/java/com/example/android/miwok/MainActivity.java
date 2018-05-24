
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // for opening numbersList

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view)
        {
            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class); // explicit intent as we know activity.class is to be used
            startActivity(numbersIntent);
        }
    });

        // for opening familyList
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class); // explicit intent as we know activity.class is to be used
                startActivity(familyIntent);
            }
        });

        // for opening colorsList
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class); // explicit intent as we know activity.class is to be used
                startActivity(colorsIntent);
            }
        });

        // for opening phrasesList
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class); // explicit intent as we know activity.class is to be used
                startActivity(phrasesIntent);
            }
        });

    }







    public void openPhrasesList(View view)
    {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}
