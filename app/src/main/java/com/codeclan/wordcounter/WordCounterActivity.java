package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCounterActivity extends AppCompatActivity {

    EditText textToCount;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        textToCount = (EditText)findViewById(R.id.input_text);
        countButton = (Button)findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){

        Intent intent = new Intent(this, ResultActivity.class);

        String text = textToCount.getText().toString();
        intent.putExtra("text", text);
        startActivity(intent);


    }



}
