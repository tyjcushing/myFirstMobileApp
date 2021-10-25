package com.example.course;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;

@Entity(tableName="Terms")
public class Term {
    //private ArrayList<Term> termList = new ArrayList<Term>();
    @PrimaryKey(autoGenerate = true)
    private int termID;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "startDate")
    private String startDate;
    @ColumnInfo(name = "endDate")
    private String endDate;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Term(int termID, String title, String startDate, String endDate) {
        this.termID = termID;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    Term() {
        this.termID = 0;
        this.title = "";
        this.startDate = LocalDateTime.now().toString();
        this.endDate = LocalDateTime.now().toString();
    }

    // Setters and Getters
    public void setTermID(int termID){this.termID=termID;}

    public int getTermID(){return this.termID;}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setStartDate(String startDate) {
        this.startDate.equals(startDate);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate.equals(endDate);
    }

    public String getEndDate() {
        return endDate;
    }

}


