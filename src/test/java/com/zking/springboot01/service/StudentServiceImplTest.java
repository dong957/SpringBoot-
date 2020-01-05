package com.zking.springboot01.service;


import com.zking.springboot01.Springboot01Application;
import com.zking.springboot01.model.Student;
import com.zking.springboot01.util.PageBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-12-1618:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Springboot01Application.class})
//@SpringBootTests(classes = {SpringbootApplication.class})
class StudentServiceImplTest {

    @Resource
    private IStudentService studentService;

    @Test
    void getStudentBySID() {
        Student student = studentService.getStudentBySID(8);
        System.out.println(student);
    }

    @Test
    void getStudentsPaging() {
        Student stu = new Student();
        PageBean pageBean = new PageBean();
        pageBean.setRows(3);
        List<Student> datas = studentService.getStudentsPaging(stu, pageBean);
        for(Student student:  datas) {
            System.out.println(student);
        }
    }

}