package com.example.course;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDao {
    @Query("SELECT * FROM Student ORDER BY studentID")
    List<Student> getStudentList();

    @Query("SELECT * FROM Student WHERE studentID = :studentID ORDER BY studentID")
    Student getStudent(int studentID);

    @Query("SELECT username FROM Student WHERE studentID = :studentID")
    String getUsername(int studentID);

    @Query("SELECT password FROM Student WHERE studentID = :studentID")
    String getPassword(int studentID);

    @Insert
    void insertStudent(Student student);

    @Insert
    void insertAll(Student... student);

    @Update
    void updateStudent(Student student);

    @Delete
    void deleteStudent(Student student);

    @Query("DELETE FROM Student")
    public void deleteAllStudents();
}
