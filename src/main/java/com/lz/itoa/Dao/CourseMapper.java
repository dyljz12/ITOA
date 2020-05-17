package com.lz.itoa.dao;

import com.lz.itoa.entity.Course;
import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(String nameCourse);

    int insert(Course record);

    Course selectByPrimaryKey(String nameCourse);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);
}