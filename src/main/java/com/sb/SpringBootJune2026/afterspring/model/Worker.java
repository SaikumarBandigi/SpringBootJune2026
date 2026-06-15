package com.sb.SpringBootJune2026.afterspring.model;


import javax.persistence.*;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wid;

    private String wname;
    private int wage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cid")
    private Chirunama chirunama;


    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public Chirunama getChirunama() {
        return chirunama;
    }

    public void setChirunama(Chirunama chirunama) {
        this.chirunama = chirunama;
    }

    public Worker() {
    }

    public Worker(int wid, String wname, int wage, Chirunama chirunama) {
        this.wid = wid;
        this.wname = wname;
        this.wage = wage;
        this.chirunama = chirunama;
    }

}
