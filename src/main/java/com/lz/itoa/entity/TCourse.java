package com.lz.itoa.entity;

public class TCourse {
    private String nameCourse;

    private String nameSchoolA;

    private String nameTeacher;

    private String priceCourse;

    private String testColum;

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse == null ? null : nameCourse.trim();
    }

    public String getNameSchoolA() {
        return nameSchoolA;
    }

    public void setNameSchoolA(String nameSchoolA) {
        this.nameSchoolA = nameSchoolA == null ? null : nameSchoolA.trim();
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

    public String getTestColum() {
        return testColum;
    }

    public void setTestColum(String testColum) {
        this.testColum = testColum == null ? null : testColum.trim();
    }
}