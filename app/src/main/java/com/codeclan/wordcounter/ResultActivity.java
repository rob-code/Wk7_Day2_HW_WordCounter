package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    WordCounter wordCounter;
    TextView enteredText;
    TextView wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String text = extras.getString("text");

        enteredText = (TextView)findViewById(R.id.text);
        enteredText.setText(text);

        wordCounter = new WordCounter(text);
        wordCount = (TextView)findViewById(R.id.count);
        wordCount.setText(wordCounter.getWordCount());
    }
}
