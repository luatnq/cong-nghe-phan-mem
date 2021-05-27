/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Race implements Serializable{
    private int id;
    
    private String name;
    
    private String address;
    
    private int lapNumber;
    
    private Date teamStart;

    public Race() {
    }

    public Race(String name, String address, int lapNumber, Date teamStart) {
        this.name = name;
        this.address = address;
        this.lapNumber = lapNumber;
        this.teamStart = teamStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }

    public Date getTeamStart() {
        return teamStart;
    }

    public void setTeamStart(Date teamStart) {
        this.teamStart = teamStart;
    }
    
    
}
