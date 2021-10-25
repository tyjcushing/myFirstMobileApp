package com.example.course;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "Student",
        foreignKeys = @ForeignKey(entity=Term.class,
            parentColumns="termID",
            childColumns="currentTerm",
            onDelete=CASCADE))
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int studentID;
    @ColumnInfo(name = "currentTerm")
    private int currentTerm;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "phone")
    private String phone;
    @ColumnInfo(name = "username")
    private String username;

    public Student(int studentID, int currentTerm, String email, String password, String phone, String username) {
        this.studentID = studentID;
        this.currentTerm = currentTerm;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.username = username;
    }

    public Student() {
        this.studentID = 0;
        this.currentTerm = 0;
        this.email = "";
        this.password = "";
        this.phone = "";
        this.username = "";
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(int currentTerm) {
        this.currentTerm = currentTerm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
