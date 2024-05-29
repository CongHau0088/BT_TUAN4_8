package com.example.BT_Tuan4_8.model;

import java.time.LocalDate;

public class Course {

    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;

    public Course(int id, String lectureName, String place, LocalDate startDate) {
	//contractor
        this.id = id;
        this.lectureName = lectureName;
        this.place = place;
        this.startDate = startDate;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", lectureName='" + lectureName + '\'' +
                ", place='" + place + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
