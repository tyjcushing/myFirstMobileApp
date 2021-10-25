package com.example.course;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AssessmentsDao {
    @Query("SELECT * FROM Assessments ORDER BY assessmentID")
    List<Assessments> getTermList();

    @Query("SELECT * FROM Assessments WHERE assessmentID = :assessmentID ORDER BY assessmentID")
    Assessments getAssessment(int assessmentID);

    @Query("SELECT type FROM Assessments WHERE assessmentID = :assessmentID")
    String getType(int assessmentID);

    @Insert
    void insertAssessment(Assessments assessment);

    @Insert
    void insertAll(Assessments... assessment);

    @Update
    void updateTerm(Assessments assessment);

    @Delete
    void deleteAssessment(Assessments assessment);

    @Query("DELETE FROM Assessments")
    public void deleteAllAssessments();
}
