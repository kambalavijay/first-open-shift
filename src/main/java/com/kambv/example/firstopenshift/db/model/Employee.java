package com.kambv.example.firstopenshift.db.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = -8900492704842756948L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="employee_id_seq")
    @SequenceGenerator(name="employee_id_seq", sequenceName="employee_id_seq", allocationSize=1)
    @Column(name = "id", unique = true, nullable = false)
    private Long  id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="address")
    private String address;
    @Column(name="salary")
    private int salary;

    Employee(){

    }

    public Long  getId() {
        return id;
    }

    public void setId(Long  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

