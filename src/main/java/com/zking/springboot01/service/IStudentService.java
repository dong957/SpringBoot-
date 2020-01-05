package com.zking.springboot01.service;

import com.zking.springboot01.model.Student;
import com.zking.springboot01.util.PageBean;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-12-1618:38
 */
public interface IStudentService {

    Student getStudentBySID(int sid);


    List<Student> getStudentsPaging(Student student, PageBean pageBean);

}
