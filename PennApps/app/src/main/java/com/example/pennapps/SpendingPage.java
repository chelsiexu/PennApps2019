package com.example.pennapps;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class SpendingPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ellen_spending_page);

        Button editGoal = (Button)findViewById(R.id.EditButton);
        editGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), EditGoals.class);
                startActivity(startintent);

            }
        });

        Button spendingChart = (Button)findViewById(R.id.ActivitiesButton);
        spendingChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), SpendingChart.class);
                startActivity(startintent);

            }
        });
    }

}