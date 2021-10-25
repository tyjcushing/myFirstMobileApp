package com.example.course;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class TermViewActivity extends AppCompatActivity {
    C196_Database db;
    ListView listView;
    Button termsViewButton;

    @Override
    protected void onResume() {
        super.onResume();
        updateList();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_view);
        setTitle("Overview");
        listView = findViewById(R.id.TermsList);
        View root = listView.getRootView();

        db = C196_Database.getInstance(getApplicationContext());
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getApplicationContext(), TermDetailViewActivity.class);
            int termID;
            List<Term> termViewActivity = db.termDao().getTermList();
            termID = termViewActivity.get(position).getTermID();
            startActivity(intent);
        }
    });

    }

    private void updateList() {
        List<Term> allTerms = db.termDao().getTermList();

        String[] items = new String[allTerms.size()];
        if(!allTerms.isEmpty()) {
            for(int i=0; i<allTerms.size();i++) {
                items[i] = allTerms.get(i).getTitle();
            }
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}
