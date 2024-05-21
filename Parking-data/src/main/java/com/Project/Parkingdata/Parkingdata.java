package com.Project.Parkingdata;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Parking_Data")
public class Parkingdata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    @Column(name = "vehicle_name")
    String vname;

    @Column(name = "Driver_name")
    String dname;

    @Column(name = "Vehicle_number")
    String vno;

    @Column(name = "Entry_Time")
    LocalTime etime;

    @Column(name = "Exit_Time")
    LocalTime ltime;

    @Column(name = "Date")
    LocalDate date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public LocalTime getEtime() {
        return etime;
    }

    public void setEtime(LocalTime etime) {
        this.etime = etime;
    }

    public LocalTime getLtime() {
        return ltime;
    }

    public void setLtime(LocalTime ltime) {
        this.ltime = ltime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Parkingdata{" +
                "id=" + id +
                ", vname='" + vname + '\'' +
                ", dname='" + dname + '\'' +
                ", vno='" + vno + '\'' +
                ", etime=" + etime +
                ", ltime=" + ltime +
                ", date=" + date +
                '}';
    }
}
