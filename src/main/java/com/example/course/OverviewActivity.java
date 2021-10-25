package com.example.course;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class OverviewActivity extends AppCompatActivity {
    C196_Database db;
    ListView listView;
    Button termsViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_view);
        setTitle("Overview");
        listView = findViewById(R.id.OverviewList);
        View root = listView.getRootView();

        db = C196_Database.getInstance(getApplicationContext());

        //termsViewButton =

        termsViewButton=findViewById(R.id.termsButton);
        termsViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TermViewActivity.class);
                startActivity(intent);
            }

        });

    }
}
