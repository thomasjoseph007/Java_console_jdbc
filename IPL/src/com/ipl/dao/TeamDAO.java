package com.ipl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ipl.bo.SkillBO;
import com.ipl.controller.Team;
import com.ipl.util.ConnectionManager;

public class TeamDAO {

	public static String FindByTeamName(String teamname) throws Exception {
		String tm = null ;
		ConnectionManager con  = new ConnectionManager();
		Statement s = con.getConnection().createStatement();
		ResultSet rr = null;
		
		rr = s.executeQuery("select * from team where name ='"+teamname+"'");
		if(rr.next()) {
			tm = rr.getString("id");
			}
		
		return tm;
		
	}
	public Team FindByTeamId(int teamid) {
		return null;
		
	}
}
