package com.example.pennapps;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class SpendingChart extends AppCompatActivity {

    int spending[] = {450, 50, 100, 200, 1000};
    String category[] = {"Food", "Transportation", "Studying", "Entertainment", "Housing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spending_chart);

        setupPieChart();
    }

    private void setupPieChart() {
        List<PieEntry> pieEntries = new ArrayList<>();
        for (int i = 0; i < spending.length; i++) {
            pieEntries.add(new PieEntry(spending[i], category[i]));
        }
        PieDataSet dataSet = new PieDataSet(pieEntries, "Monthly Spending Breakdown");
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        PieData data = new PieData(dataSet);

        PieChart chart = (PieChart) findViewById(R.id.chart);
        chart.setData(data);
        chart.animateY(1000);
        chart.invalidate();
    }

}
