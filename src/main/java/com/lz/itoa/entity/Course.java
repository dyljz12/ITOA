package com.lz.itoa.entity;

public class Course {
    private String nameCourse;

    private String nameSchool;

    private String nameTeacher;

    private String priceCourse;

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse == null ? null : nameCourse.trim();
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool == null ? null : nameSchool.trim();
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher == null ? null : nameTeacher.trim();
    }

    public String getPriceCourse() {
        return priceCourse;
    }

    public void setPriceCourse(String priceCourse) {
        this.priceCourse = priceCourse == null ? null : priceCourse.trim();
    }
}