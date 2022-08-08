package com.Testing;

import java.sql.Date;

public class Assesment_2 {

	public static void main(String[] args) throws Exception 
	{
		
		ABC_Student s = new ABC_Student("AbhigyanRanjan","1234","X",new Date(2000,15,07),50000.00);

		ABC_Student s1 = new ABC_Student("Ram","2345","X",new Date(2000,15,07),50000.00);

		ABC_Student s2 = new ABC_Student("Shyam","4567","X",new Date(2000,15,07),50000.00);

		ABC_Student s3 = new ABC_Student("Ramesh","6789","X",new Date(2000,15,07),50000.00);

		ABC_Student s4 = new ABC_Student("AbhishekRanjan","5678","X",new Date(2000,15,07),50000.00);

		s.Display("1234");
		

	}

}
