
package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Result;
import model.TeamStat;

/**
 *
 * @author Admin
 */
public class TeamStatDAO extends DAO{
    
    /**
     *
     * @return
     */
    public List<TeamStat> getAllTeamStat(){
        List<TeamStat> teamStats = new ArrayList(); 
        String sql = "SELECT SUM(point) AS point, SUM(time) AS time, team_id, team_name FROM (registration_info "
                + "INNER JOIN racer_for_team "
                + "ON registration_info.racer_for_team_id = racer_for_team.id)"
                + "INNER JOIN team ON racer_for_team.team_id = team.id "
                + " GROUP BY team_id ORDER BY point DESC";
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            int k = 1;
            while(rs.next()){
                TeamStat teamStat = new TeamStat();
                teamStat.setRank(k++);
                teamStat.setName(rs.getString("team_name"));
                teamStat.setTotalPoint(rs.getInt("point"));
                teamStat.setTotalTime(rs.getInt("time"));
                teamStat.setId(rs.getInt("team_id"));
                teamStats.add(teamStat);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return teamStats;
    }
}
