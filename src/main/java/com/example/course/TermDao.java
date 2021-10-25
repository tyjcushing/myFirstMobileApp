package com.example.course;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TermDao {
    @Query("SELECT * FROM Terms ORDER BY termID")
    List<Term> getTermList();

    @Query("SELECT * FROM Terms WHERE termID = :term_ID ORDER BY termID")
    Term getTerm(int term_ID);

    @Query("SELECT * FROM Course WHERE termID = :selectedTerm")
    List<Courses> getCourseList(int selectedTerm);

    @Insert
    void insertTerm(Term term);

    @Insert
    void insertAll(Term... term);

    @Update
    void updateTerm(Term term);

    @Delete
    void deleteTerm(Term term);

    @Query("DELETE FROM Terms")
    public void deleteAllTerms();
}
