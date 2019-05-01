package com.test.springbootdemo.business.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "EMP")
public class Employee implements Serializable {
    @Id
    @Column(name = "EMPNO")
    private Long empNo;

    @Column(name = "ENAME")
    private String eName;

    public Long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}
