package com.example.pennapps;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toSpending = (Button)findViewById(R.id.tosp);
        toSpending.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SpendingPage.class);
                startActivity(startIntent);
            }
        });

        Button toMap = (Button)findViewById(R.id.map_button);
        toMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Map.class);
                startActivity(startIntent);
            }
        });
    }

}