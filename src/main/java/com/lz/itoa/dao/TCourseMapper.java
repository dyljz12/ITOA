package com.lz.itoa.dao;

import com.lz.itoa.entity.TCourse;
import java.util.List;

public interface TCourseMapper {
    int deleteByPrimaryKey(String nameCourse);

    int insert(TCourse record);

    TCourse selectByPrimaryKey(String nameCourse);

    List<TCourse> selectAll();

    int updateByPrimaryKey(TCourse record);
}