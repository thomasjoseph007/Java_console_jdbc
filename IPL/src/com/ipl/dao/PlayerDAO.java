package com.ipl.dao;

import java.sql.*;

import java.util.*;


import com.ipl.bo.PlayerBO;
import com.ipl.controller.Player;
import com.ipl.controller.Skill;
import com.ipl.util.ConnectionManager;


public class PlayerDAO {
	
	public void createPlayer(Player player) throws SQLException, Exception {
		
		System.out.println(player.playername);
		System.out.println(player.country);
		
		
		System.out.println(player.team);
		ConnectionManager con  = new ConnectionManager();
		Statement s = con.getConnection().createStatement();
		
		String sk = SkillDAO.FindBySkillName(player.skill);
		String tm= TeamDAO.FindByTeamName(player.team);
		ResultSet rr = null;
		rr = s.executeQuery("select * from team where name ='"+player.team+"'");
		if(rr.next()) {
			tm = rr.getString("id");
			}
		
		String q = "INSERT INTO player( name, country, skill_id, team_id) VALUES ('"+player.playername+"','"+player.country+"','"+sk+"','"+tm+"')";
		int r = s.executeUpdate(q);
		if(r==1)
			System.out.println("Added Sucessfully");
		else
			System.out.println("Oppz babe!!!");
		
	}
	List<Player> getPlayerDetails(String Skillname){
		return null;
		
	} 
	List<Player> getALlPlyaerDetails(){
		return null;
		
	}
	
	
}
