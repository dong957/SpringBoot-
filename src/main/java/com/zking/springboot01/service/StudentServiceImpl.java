package com.zking.springboot01.service;


import com.zking.springboot01.dao.IStudentDao;
import com.zking.springboot01.model.Student;
import com.zking.springboot01.util.PageBean;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-12-1618:39
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentDao studentDao;

    @Cacheable(value = "redisCache",condition = "#result!='null'",key ="'redis_stu'+#sid" )
    @Override
    public Student getStudentBySID(int sid) {
        return studentDao.getStudentBySID(sid);
    }

    @Override
    public List<Student> getStudentsPaging(Student student, PageBean pageBean) {
        return studentDao.getStudents(student);
    }

}
