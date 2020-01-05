package com.zking.springboot01.controller;

import com.zking.springboot01.model.Student;
import com.zking.springboot01.service.IStudentService;
import com.zking.springboot01.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @create 2020-01-0214:52
 */
@RestController
public class ControllerStudent {


    @Resource
    private IStudentService studentService;

    @RequestMapping("/getSBySID")
    public Object getStudentBySID(int sid) {
        Student student = studentService.getStudentBySID(sid);
        Map<Object,Object> map=new HashMap<>();
        map.put("Date",student);
        map.put("code",1);
        map.put("success","查询成功");
        return map;
    }

    @RequestMapping("/getSPaging")
    public  Object getStudentsPaging(Student student,PageBean pageBean){
        List<Student> myl= studentService.getStudentsPaging(student,pageBean);
        Map<Object,Object> map=new HashMap<>();
        map.put("Date",myl);
        map.put("code",1);
        map.put("success","查询成功");
        return map;
    }

}
