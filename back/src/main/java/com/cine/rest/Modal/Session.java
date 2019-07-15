package com.cine.rest.Modal;

public class Session {
    private String day;
    private String time;
    public Session(){}

    public Session(String day, String time) {
        this.day = day;
        this.time = time;
    }

    // Get/Set day pour la session
    public String getDay() {return day;}
    public void setDay(String day) {this.day = day;}

    // Get/Set time pour la session
    public String getTime() {return time;}
    public void setTime(String time) {this.time = time;}
}
