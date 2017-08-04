package com.SorceManagement.SM.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //告诉JPA这事一个与数据库中表映射的实体类
public class Student {
    @Id//使被注解的属性成为主键
    private String id;   //学生ID
    private String studentname; //学生姓名

    //默认构造函数必须的，不然会报错
    public Student() {
    }

/*每一个属性的get和set方法都必须要有，以提供JPA将数据库中相应的值注入到实体中或者将实体对象的值存入数据库的表中*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
}
