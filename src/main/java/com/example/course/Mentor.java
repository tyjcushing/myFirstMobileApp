package com.example.course;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Mentor")
class Mentor {
    @PrimaryKey(autoGenerate = true)
    private int mentorID;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "phone")
    private String phone;
    @ColumnInfo(name = "username")
    private String username;

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
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

    public Mentor(int mentorID, String email, String password, String phone, String username) {
        this.mentorID = mentorID;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.username = username;
    }

    public Mentor() {
        this.mentorID = 0;
        this.email = "";
        this.password = "";
        this.phone = "";
        this.username = "";
    }

    
}
