package com.zking.springboot01.model;

import com.zking.springboot01.util.PinYinUtil;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author dong
 * @create 2020-01-0214:06
 */
@ToString
public class Student implements Serializable {


    private static final long serialVersionUID = -4221633176165173294L;
    private Integer sid;
    private String name;
    private Integer age;
    private String snamePinyin;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.snamePinyin= PinYinUtil.toPinyin(name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) &&
                Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(snamePinyin, student.snamePinyin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name, age, snamePinyin);
    }
}
