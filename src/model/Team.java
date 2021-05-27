/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Team implements Serializable{
    private int id;
    
    private String name;
    
    private String tradeMark;
    
    private String description;

    public Team() {
    }

    public Team(String name, String tradeMark, String description) {
        this.name = name;
        this.tradeMark = tradeMark;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
       
    }  

    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", name=" + name + ", tradeMark=" + tradeMark + ", description=" + description + '}';
    }
    
}
