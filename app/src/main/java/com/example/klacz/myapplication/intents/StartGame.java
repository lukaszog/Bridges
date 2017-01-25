package com.example.klacz.myapplication.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.klacz.myapplication.R;

public class StartGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);

        Intent intent = getIntent();
        String message = intent.getStringExtra("com.talkingandroid.MESSAGE");
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);

    }
}
