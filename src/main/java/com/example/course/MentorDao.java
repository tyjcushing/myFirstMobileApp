package com.example.course;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MentorDao {
    @Query("SELECT * FROM Mentor ORDER BY mentorID")
    List<Mentor> getMentorList();

    @Query("SELECT * FROM Mentor WHERE mentorID = :mentorID ORDER BY mentorID")
    Mentor getMentor(int mentorID);

    @Query("SELECT username FROM Mentor WHERE mentorID = :mentorID")
    String getUsername(int mentorID);

    @Query("SELECT password FROM Mentor WHERE mentorID = :mentorID")
    String getPassword(int mentorID);

    @Query("SELECT * FROM Course WHERE mentorID = :selectedMentor")
    List<Courses> getCourseList(int selectedMentor);

    @Insert
    void insertMentor(Mentor mentor);

    @Insert
    void insertAll(Mentor... mentors);

    @Update
    void updateMentor(Mentor mentor);

    @Delete
    void deleteTMentor(Mentor mentor);

    @Query("DELETE FROM Mentor")
    public void deleteAllMentors();
}
