package com.example.c3444206.todolistactivity;

import java.util.Date;
import java.util.UUID;

//The todo class is a Plane Old Java Object(POJO)
// with getter and setter methods; here is a typical set of attributes to start with.

public class Todo {
    private UUID mID;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;


    public Todo() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }
}
