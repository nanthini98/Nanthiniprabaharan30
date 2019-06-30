package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;

public class HP {
	
	public static void main(String args[]) throws ParseException
	{
		List<pojo> list =read_file("Input.docx");
	
		try
		{
		 error(list);	
		}
		catch(Myexception M)
		{
			System.out.println(M);
		}
		}
	
	
	public static List<pojo> read_file(String l)
	{
		List<pojo> list1=new ArrayList<>();
		List<pojo> dl =new ArrayList<>();
		List<String> list2=new ArrayList<>();
		 int sum=0;
		 try
		 {
			 BufferedReader br=new BufferedReader(new FileReader(l));
			 
			 String line;
			 line=br.readLine();
			 while(line!=null)
			 {
				 String[] x =line.split("  ");
				 pojo obj=new pojo(x[0], x[1] ,x[2], x[3], x[4], x[5]);
				 list1.add(obj);
				 line=br.readLine();
				 
			 }
		 }
		 catch(IOException ioe)
		 {
			 ioe.printStackTrace();
		 }
		 
     for(pojo a:list1)
		  {
			 
			 if(list2.contains(a.getKeyvalue().replaceAll("[^A-Z]"," "))==false)
			 {
				 list2.add(a.getKeyvalue().replaceAll("[^A-Z]"," "));
				 
			 }
			 
		  }
		  for(String a:list2)
		  {
			  for(pojo p:list1)
			  {
				  if(p.getKeyvalue().contains(a))
				  {
					  sum=sum+(Integer.parseInt(p.getCost()));
				  }
			  }
			  System.out.println(a+" : "+sum);
		  }
		  dl=list1;
			 return dl;
		  }
		  
		  public static void error(List<pojo> dl) throws Myexception, ParseException
		  {
		  for(pojo pl:dl)
		  {
			SimpleDateFormat obj=new SimpleDateFormat("dd/mm/yyyy");
			
			Date dt_1=obj.parse(pl.getExpirydate());
			Date dt_2=obj.parse(pl.getCurrentdate());
				
				if(dt_1.compareTo(dt_2)<0)
					{
						throw new Myexception("the policy "+pl.getKeyvalue()+" is Expired");
			
		  }
		  }
		
	
	}
	}


