package com.example.course;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

class TermDetailViewActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_detail_view);
        setTitle("Overview");
        listView = findViewById(R.id.TermsDetailsList);
        View root = listView.getRootView();
    }
}