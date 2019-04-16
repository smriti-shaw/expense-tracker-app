package com.learnthetek.expensetracker.dao;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_personalisation")
public class UserDetails {

    @Id
    @GeneratedValue
    @Column(name="user_id")
    Integer userId;

    @Column(name = "mobile_no")
    String mobileNo;

    @Column(name = "user_name")
    String userName;

    @Column(name = "email")
    String email;

    @Column(name = "date_of_creation")
    LocalDateTime dateTime;

    public Integer getUserId() {
        return userId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
