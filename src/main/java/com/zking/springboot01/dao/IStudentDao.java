package com.zking.springboot01.dao;

import com.zking.springboot01.model.Student;

import java.util.List;

/**
 * @author dong
 * @create 2020-01-0214:11
 */
public interface IStudentDao {
    /**
     * 根据sid获取学生信息
     * @param sid
     * @return Student
     */
    Student getStudentBySID(int sid);

    /**
     * 根据学生对象获取学生集合
     * @param student
     * @return List
     */
    List<Student> getStudents(Student student);

}
