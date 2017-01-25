package com.example.klacz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.klacz.myapplication.intents.Rules;
import com.example.klacz.myapplication.intents.StartGame;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityButton = (Button) findViewById(R.id.button);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent startIntent = new Intent(getApplicationContext(),StartGame.class);
                startIntent.putExtra("com.talkingandroid.MESSAGE","Pozdro dla graczy z lvla1");
                startActivity(startIntent);


            }
        });

        Button zasadyButton = (Button) findViewById(R.id.button4);
        zasadyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent zasadyIntent = new Intent(getApplicationContext(),Rules.class);
                startActivity(zasadyIntent);
            }
        });

        Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
}
