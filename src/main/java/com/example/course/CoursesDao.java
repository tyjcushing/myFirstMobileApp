package com.example.course;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CoursesDao {
    @Query("SELECT * FROM Course ORDER BY courseID")
    List<Courses> getCourseList();

    @Query("SELECT * FROM Course WHERE courseID = :courseID ORDER BY courseID")
    Courses getCourse(int courseID);

    @Query("SELECT * FROM Assessments WHERE courseID = :selectedCourse")
    List<Assessments> getAssessmentsList(int selectedCourse);

    @Insert
    void insertCourse(Courses course);

    @Insert
    void insertAll(Courses... course);

    @Update
    void updateCourse(Courses course);

    @Delete
    void deleteCourse(Courses course);

    @Query("DELETE FROM Course")
    public void deleteAllCourses();
}
