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
public class RegistrationInfo implements Serializable{
    
    private int id;
    
    private Race race;
    
    private Racer racer;
    
    private User user;
    
    private Date date;

    public RegistrationInfo() {
        super();
    }

    public RegistrationInfo(Race race, Racer racer, User user) {
        super();
        this.race = race;
        this.racer = racer;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Racer getRacer() {
        return racer;
    }

    public void setRacer(Racer racer) {
        this.racer = racer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
