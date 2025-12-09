package com.hamid;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_data")
public class Employees {
    @Id
    private int eId;
    @Column(name = "eName")
    private String name;
    private String tech;
    @OneToOne
    private Laptop laptop;

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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop + '\'' +
                '}';
    }
}
