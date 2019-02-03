package com.example.pennapps;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SpendingPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ellen_spending_page);

        Button spendingChart = (Button)findViewById(R.id.ActivitiesButton);
        spendingChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), SpendingChart.class);
                startActivity(startintent);

            }
        });

        Button goal = (Button)findViewById(R.id.GoalButton);
        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), EditGoals.class);
                startActivity(startintent);

            }
        });

        String[] transactions = {"2019/1/1 $50", "2019/1/1 $70", "2019/1/1 $70", "2019/1/1 $39","2019/1/1 $50","2019/1/1 $50","2019/1/1 $50","2019/1/1 $50"};
        ListAdapter moneyMapListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, transactions);
        ListView moneyMapListView = (ListView)findViewById(R.id.transactions);
        moneyMapListView.setAdapter(moneyMapListAdapter);
    }

}