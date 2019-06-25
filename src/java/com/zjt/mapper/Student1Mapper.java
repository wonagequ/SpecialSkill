package com.zjt.mapper;

import com.zjt.pojo.Student1;
import com.zjt.pojo.Student1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Student1Mapper {
    int countByExample(Student1Example example);

    int deleteByExample(Student1Example example);

    int deleteByPrimaryKey(String sname);

    int insert(Student1 record);

    int insertSelective(Student1 record);

    List<Student1> selectByExample(Student1Example example);

    Student1 selectByPrimaryKey(String sname);

    int updateByExampleSelective(@Param("record") Student1 record, @Param("example") Student1Example example);

    int updateByExample(@Param("record") Student1 record, @Param("example") Student1Example example);

    int updateByPrimaryKeySelective(Student1 record);

    int updateByPrimaryKey(Student1 record);
}