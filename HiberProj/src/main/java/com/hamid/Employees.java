package com.hamid;


import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name = "emp_data")
public class Employees {
    @Id
    private int eId;
    @Column(name = "eName")
    private String name;
    private String tech;
//    @OneToOne
    @OneToMany //(mappedBy = "employee")
//    @ManyToMany
    private List<Laptop> laptops;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops + '\'' +
                '}';
    }
}
