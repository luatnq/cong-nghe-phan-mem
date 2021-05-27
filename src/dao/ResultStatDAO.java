/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Race;
import model.Result;
import model.ResultStat;
import model.Team;
import model.TeamStat;

/**
 *
 * @author Admin
 */
public class ResultStatDAO extends DAO{

    public static List<ResultStat> getAllResultStatByTeam(TeamStat team){
        String sql = "select distinct racer_for_team.id, racer_for_team.team_id,"+
                        " sum(point) as total_point,sum(time) as total_time, race.race_name " +
                        "from registration_info " +
                        "INNER JOIN racer_for_team ON registration_info.racer_for_team_id = racer_for_team.id " +
                        "INNER JOIN race ON registration_info.race_id = race.id " +
                        "GROUP BY team_id , race_id";
        List<ResultStat> listResult = new ArrayList();
         try{
            DAO dao = new DAO();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();   
            int team_id = team.getId();
            while(rs.next()){
              if(team_id == rs.getInt("team_id")){
                  ResultStat resultStat = new ResultStat();
                  resultStat.setTotalPoint(rs.getInt("total_point"));
                  Race race = new Race();
                  race.setName(rs.getString("race_name"));
                  resultStat.setRace(race);
                  resultStat.setTotalTime(rs.getInt("total_time"));
                  listResult.add(resultStat);
//                System.out.println(rs.getString("race_name")+"   "+rs.getInt("team_id") +" " + rs.getInt("total_point")+" " + rs.getInt("total_time"));
              }
            }  
        }catch(Exception e){
            e.printStackTrace();
        }
        return listResult;
    }

    public List<ResultStat> getResultStatByTeamANdRaceName(TeamStat teamStat, String raceName){
        String sql = "select distinct racer_for_team.id, racer_for_team.team_id, sum(point) as total_point,sum(time) as total_time, race.race_name " +
                    "from registration_info " +
                    "INNER JOIN racer_for_team ON registration_info.racer_for_team_id = racer_for_team.id " +
                    "INNER JOIN race ON registration_info.race_id = race.id " +
                    "where race.race_name like ? " +
                    "GROUP BY team_id , race_id";
        List<ResultStat> listResult = new ArrayList();
        
         try{
            DAO dao = new DAO();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%"+raceName+"%");
            ResultSet rs = ps.executeQuery();
            int team_id = teamStat.getId();
            while(rs.next()){
                if(team_id == rs.getInt("team_id")){
                    ResultStat resultStat = new ResultStat();
                    resultStat.setTotalPoint(rs.getInt("total_point"));
                    Race race = new Race();
                    race.setName(rs.getString("race_name"));
                    resultStat.setRace(race);
                    resultStat.setTotalTime(rs.getInt("total_time"));
                    listResult.add(resultStat);
//                  System.out.println(rs.getInt("total_point")+" "+rs.getString("race_name")+" "+rs.getInt("total_time") );
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listResult;
    }
}
