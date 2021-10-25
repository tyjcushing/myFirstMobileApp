package com.example.course;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Term.class, Courses.class, Mentor.class, Student.class, Assessments.class}, exportSchema = false, version = 1)
//@TypeConverters({Converters.class})
public abstract class C196_Database extends RoomDatabase {

    private static final String DB_NAME = "full_dbC196";
    private static C196_Database instance;

    public static synchronized C196_Database getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), C196_Database.class, DB_NAME).allowMainThreadQueries().build();
        }
        return instance;
    }

    public abstract TermDao termDao();
    public abstract CoursesDao coursesDao();
    public abstract AssessmentsDao assessmentsDao();
    public abstract MentorDao mentorDao();
    public abstract StudentDao studentDao();
}
