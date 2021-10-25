package com.example.course;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.ZonedDateTime;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "Course",
        foreignKeys = {@ForeignKey(entity=Term.class,
                parentColumns="termID",
                childColumns="termID",
                onDelete=CASCADE),
                @ForeignKey(entity=Mentor.class,
                parentColumns="mentorID",
                childColumns="mentorID",
                onDelete=CASCADE),})
public class Courses {
    @PrimaryKey(autoGenerate = true)
    private int courseID;
    @ColumnInfo(name = "mentorID")
    private int mentorID;
    @ColumnInfo(name = "anticipatedEndDate")
    private String anticipatedEndDate;
    @ColumnInfo(name = "startDate")
    private String startDate;
    @ColumnInfo(name = "termID")
    private int termID;
    @ColumnInfo(name = "title")
    private String title;


    public Courses(int courseID, int mentorID, String anticipatedEndDate, String startDate, int termID, String title) {
        this.courseID = courseID;
        this.mentorID = mentorID;
        this.anticipatedEndDate = anticipatedEndDate;
        this.startDate = startDate;
        this.termID = termID;
        this.title = title;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    Courses() {
        this.courseID = 0;
        this.mentorID = 0;
        this.anticipatedEndDate = ZonedDateTime.now().toString();
        this.startDate = ZonedDateTime.now().toString();
        termID = 0;
        this.title = "";
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getMentorID() {
        return this.mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public String getAnticipatedEndDate() {
        return anticipatedEndDate;
    }

    public void setAnticipatedEndDate(String anticipatedEndDate) {
        this.anticipatedEndDate = anticipatedEndDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getTermID() {
        return termID;
    }

    public void setTermID(int termID) {
        termID = termID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

