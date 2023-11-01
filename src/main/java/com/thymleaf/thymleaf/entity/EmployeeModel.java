package com.thymleaf.thymleaf.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee_model")
public class EmployeeModel {

    @Id
    @SequenceGenerator(name = "emp_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_seq")
    public Long id;
    public String name;
    Integer idDesignation;
    Double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdDesignation() {
        return idDesignation;
    }

    public void setIdDesignation(Integer idDesignation) {
        this.idDesignation = idDesignation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EmployeeModel() {
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idDesignation=" + idDesignation +
                ", salary=" + salary +
                '}';
    }
}
