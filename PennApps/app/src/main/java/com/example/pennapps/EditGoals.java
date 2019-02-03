package com.example.pennapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditGoals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_goals);

        Button submit = (Button)findViewById(R.id.SubmitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), SpendingPage.class);
                startActivity(startintent);

            }
        });

        Button editGoal = (Button)findViewById(R.id.EditButton);
        editGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mEdit   = (EditText)findViewById(R.id.SpendGoalInput);
                TextView mText = (TextView)findViewById(R.id.SpendGoal);
                mText.setText(mEdit.getText().toString());

                EditText mEdit1   = (EditText)findViewById(R.id.SaveGoalInput);
                TextView mText1 = (TextView)findViewById(R.id.SaveGoal);
                mText1.setText(mEdit1.getText().toString());
            }
        });
    }

}
