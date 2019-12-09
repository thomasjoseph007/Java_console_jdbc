package com.ipl.controller;

import java.sql.SQLException;
import java.util.*;


import com.ipl.bo.PlayerBO;
import com.ipl.dao.PlayerDAO;


public class Player {
	public String playername;
	public String country;
	public String skill;
	public String team;
	Scanner s = new Scanner(System.in);
	
	public Player() throws SQLException, Exception
	{
		
		System.out.println("Enter Player name");
		playername = s.nextLine();
		System.out.println("Enter Player country");
		country = s.nextLine();
		System.out.println("Enter Player skill");
		skill = s.nextLine();
		System.out.println("Enter Player team");
		team = s.nextLine();
		
		PlayerBO bo = new PlayerBO();
		bo.setPlayername(playername);
		bo.setCountry(country);
		bo.setSkill(skill);
		bo.setTeam(team);
		
		this.playername = bo.getPlayername();
		this.country=bo.getCountry();
		this.skill=bo.getSkill();
		this.team=bo.getTeam();
		
		PlayerDAO p  = new PlayerDAO();
		p.createPlayer(this);
		
	}
	public Player(String playername,String country,String skill,String team)
	{
		
		
	}
}
