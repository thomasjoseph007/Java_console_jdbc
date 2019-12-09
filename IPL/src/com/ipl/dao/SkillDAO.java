package com.ipl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ipl.controller.Skill;
import com.ipl.util.ConnectionManager;

public class SkillDAO {
	  
	public static String FindBySkillName(String skillname) throws SQLException, Exception {
		String sk = null ;
		ConnectionManager con  = new ConnectionManager();
		Statement s = con.getConnection().createStatement();
		ResultSet rs = null;
		rs = s.executeQuery("select * from skill where name ='"+skillname+"'");
		if(rs.next()) {
			sk = rs.getString("id");
			}
		return sk;
		
	}
	public Skill FindyBySkillID(int skillid) {
		return null;
		
	}
}
