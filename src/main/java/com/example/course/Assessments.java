package com.example.course;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "Assessments",
        foreignKeys = @ForeignKey(entity=Courses.class,
        parentColumns="courseID",
        childColumns="courseID",
        onDelete=CASCADE))
class Assessments {
    @PrimaryKey(autoGenerate = true)
    private int assessmentID;
    @ColumnInfo(name = "courseID")
    private int courseID;
    @ColumnInfo(name = "type")
    private String type;

    public Assessments(int assessmentID, int courseID, String type) {
        this.assessmentID = assessmentID;
        this.courseID = courseID;
        this.type = type;
    }

    Assessments() {
        this.assessmentID = 0;
        this.courseID = 0;
        this.type = "";
    }

    public int getAssessmentID() {
        return assessmentID;
    }

    public void setAssessmentID(int assessmentID) {
        this.assessmentID = assessmentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
