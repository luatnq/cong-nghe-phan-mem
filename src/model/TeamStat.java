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
public class TeamStat extends Team implements Serializable{
    private int rank;
    
    private int totalPoint;
    
    private int totalTime;

    public TeamStat() {
    }

    public TeamStat(int rank, int totalPoint, int totalTime) {
        this.rank = rank;
        this.totalPoint = totalPoint;
        this.totalTime = totalTime;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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
