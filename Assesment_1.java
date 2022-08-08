package com.Testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Assesment_1 
{
	public static void main(String[] args) throws Exception 
	{
		HashMap<String,String> M = new HashMap<String,String>(); 
		ArrayList<String> A= new ArrayList<String>();
		
		
		 CountryCapital c = new CountryCapital();
		 
		 
    //Testing of saveCountryCapital functionality.
		 
		M= c.saveCountryCapital("India","Delhi");
		M= c.saveCountryCapital("Pakistan","Islamabad");
		M= c.saveCountryCapital("Nepal","Kathmandu");
		M= c.saveCountryCapital("Afghanistan","Kabul");
		 
		for(Entry<String,String> entry : M.entrySet())
		    System.out.println(entry.getKey()+" "+entry.getValue());
		
     //Testing of getCountrCapital functionality.
		System.out.println();
		System.out.println("Outpur for function getCountryCapital()");
		System.out.println(c.getCapital("India"));
		
		
	 //Testing of getCountry functionality.
		System.out.println();
		System.out.println("Outpur for function getCountry()");
		System.out.println(c.getCountry("Delhi"));
		
	  //Testing of ReverseHashMap functionality.
		System.out.println();
		System.out.println("Output for functionb reversehashMap()");
		 M=c.ReverseHashMap();
			for(Entry<String,String> entry : M.entrySet())
			    System.out.println(entry.getKey()+" "+entry.getValue()); 
	  //Testing of CountryList() functionality.
			System.out.println();
			System.out.println("Output for function CountryList()");
			A=c.CountryList();
			Iterator<String> it = A.iterator();
			while(it.hasNext())
				 System.out.println(it.next());
		 
	}

}
