package com.ipl.controller;

import java.sql.SQLException;
import java.util.*;

import com.ipl.bo.PlayerBO;
import com.ipl.dao.PlayerDAO;

public class Main {

	public static void main(String[] args) throws SQLException, Exception {
	int choice;
	String playername;
	String country;
	String skill;
	String team;
	
	Scanner s = new Scanner(System.in);
	
	do {
		System.out.println("Menu");
		System.out.println("1.List all player \n2.Add new Player \n 3.Search new Player");
		choice = s.nextInt();
		s.nextLine();
		switch(choice)
		{
		case 1:
			break;
		case 2:	
			Player player  = new  Player();
		case 3:
			getALlPlyaerDetails();
			
	}while(choice !=3);
			
}
}

	private static void getALlPlyaerDetails() {
		// TODO Auto-generated method stub
		
	}
