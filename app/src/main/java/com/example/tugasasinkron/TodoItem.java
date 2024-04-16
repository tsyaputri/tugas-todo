package com.example.tugasasinkron;

public class TodoItem {
    private int id;
    private String what;
    private String time;

    public TodoItem(int id, String what, String time) {
        this.id= id;
        this.time=time;
        this.what=what;

    }

    public String getWhat() {
        return what;
    }

    public String getTime() {
        return time;
    }
}
