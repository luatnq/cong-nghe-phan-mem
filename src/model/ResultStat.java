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
public class ResultStat extends RegistrationInfo implements Serializable{
    private int totalPoint;
    
    private int totalTime;

    public ResultStat() {
        super();
    }

    public ResultStat(int totalPoint, int totalTime) {
        super();
        this.totalPoint = totalPoint;
        this.totalTime = totalTime;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
