package com.Testing;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABC_Student 
{
	  String StudentName;
	   String rollstr;
	   String standard;
	   Date dob;
	   Double fees;
	ABC_Student(String StudentName,String rollstr,String standard,Date dob,Double fees)
	{
		this.StudentName=StudentName;
		this.rollstr=rollstr;
		this.dob=dob;
		this.fees=fees;
		this.standard=standard;
	}
	public  void register() throws Exception
	{
	   
		
	Connection conn = null;
	PreparedStatement ps = null;

		 Class.forName("com.mysql.cj.jdbc.Driver");
		 //create connection
		 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root","root");
		
	
	 int rollno = 0;
	do {
	
			rollno = Integer.parseInt(rollstr);
			if (String.valueOf(rollno).length() != 4) rollno = 0;
		}  while (rollno == 0);
	
	
	boolean lc;
	do {
		
		
		lc = false;
		for (int i = 0; i < StudentName.length(); i++) {
			if (Character.isLowerCase(StudentName.charAt(i))) {
				lc = true;
				break;
			}
		}
		
	} while (StudentName.length() > 20 || lc);
	
	
	
	
	String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
	List<String> list = new ArrayList<String>(Arrays.asList(standards));
	if(!list.contains(standard))
		System.out.println("Wrong standard"); 

	
	
	
	// inserting data into db
	String sql = "insert into Student values(?, ?, ?, ?, ?)";

		ps = conn.prepareStatement(sql);
		ps.setInt(1, rollno);
		ps.setString(2, StudentName);
		ps.setString(3, standard);
		ps.setDate(4, dob);
		ps.setDouble(5, fees);
		ps.executeUpdate();
		System.out.println("Student added successfully");
}
	
	void Display(String rno) throws Exception
	{
		Connection conn = null;
		PreparedStatement ps = null;

			 Class.forName("com.mysql.cj.jdbc.Driver");
			 //create connection
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root","root");
			 
			 Statement smt = conn.createStatement();
			 ResultSet result = smt.executeQuery("select rollno,StudentName,standard,Date_Of_Birth,fees from emp where rollno=rno");
			
			  while(result.next())
			  {
				  System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getDate(4));
			  }
	}
	   

}
