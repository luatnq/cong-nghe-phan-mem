/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Result extends RegistrationInfo{
    
    private long time;
    
    private int lapNumber;
    
    private int point;

    public Result() {
    }

    public Result(long time, int lapNumber, int point) {
        this.time = time;
        this.lapNumber = lapNumber;
        this.point = point;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint( int point) {
        this.point = point;
    }
    
    
    
}
