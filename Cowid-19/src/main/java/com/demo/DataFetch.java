package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 class DataFetch {

	public Map<String,String>  total_cases_CountryWise()
	{
		Map<String,String> map=new HashMap<String,String>()	;

		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
 
       // String csvFilePath = "owed-covid-data.csv";
 
        
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
           ResultSet rs1=stmt.executeQuery("SELECT location, Count(total_cases) FROM coviddatanew2 GROUP BY location "); 
 
            
           while(rs1.next()) {
        	   map.put(rs1.getString(1),rs1.getString(2));
        	   //System.out.println(rs1.getString(1)+" "+rs1.getString(2));
           	}
           rs1.close();
           con.close();
/*
ResultSet rs2=stmt.executeQuery("SELECT  sum(total_cases)  from coviddatanew2" );
while(rs2.next()) {
result=rs2.getString(1);
*/
           return map;
}

        
       
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return map;
	}
	
	public String total_cases()
	{
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
        String result="";
       // String csvFilePath = "owed-covid-data.csv";
 
        
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
           

           ResultSet rs2=stmt.executeQuery("SELECT  sum(total_cases)  from coviddatanew2" );
	
		while(rs2.next()) {
					 result = rs2.getString(1);
					
		}
		return result;
        } 
       
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return result;
	}
	

	public Map<String,String> newCases_countryWise() {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
 
       // String csvFilePath = "owed-covid-data.csv";
 
        Map<String,String> map=new HashMap<String,String>()	;
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
            ResultSet rs1=stmt.executeQuery("SELECT location, Count(new_cases) FROM coviddatanew2 GROUP BY location "); 
            //ResultSet rs2=stmt.executeQuery("SELECT  sum(new_cases) from coviddatanew2" );
            
while(rs1.next()) {
	map.put(rs1.getString(1), rs1.getString(2));
         //   System.out.println(rs1.getString(1)+" "+);
            
}
return map;

        }
        
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	String total_newCases()
	{
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
 
       // String csvFilePath = "owed-covid-data.csv";
 
       String result="";
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
           // rs1=stmt.executeQuery("SELECT location, Count(new_cases) FROM coviddatanew2 GROUP BY location "); 
            ResultSet rs2=stmt.executeQuery("SELECT  sum(new_cases) from coviddatanew2" );
            
while(rs2.next()) {
	result=rs2.getString(1);
         //   System.out.println(rs1.getString(1)+" "+);
            
}
return result;

        }
        
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return result;
	}
	public Map<String,String> total_deaths_CountryWise() {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
 
       // String csvFilePath = "owed-covid-data.csv";
 
        Map<String,String> map=new HashMap<String,String>();
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
            ResultSet rs1=stmt.executeQuery("SELECT location, Count(total_deaths) FROM coviddatanew2 GROUP BY location "); 
            //ResultSet rs2=stmt.executeQuery("SELECT  sum(total_deaths) from coviddatanew2" );
while(rs1.next()) {
	map.put(rs1.getString(1), rs1.getString(2));
}
return map;

        }
        
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return map;
	}

	public Map<String,String> new_deaths_CountryWise() {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
 
       // String csvFilePath = "owed-covid-data.csv";
 
        Map<String,String> map=new HashMap<String,String>();
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
            ResultSet rs1=stmt.executeQuery("SELECT location, Count(new_deaths) FROM coviddatanew2 GROUP BY location "); 
           // ResultSet rs2=stmt.executeQuery("SELECT  sum(new_deaths) from coviddatanew2" );
while(rs1.next()) {
	map.put(rs1.getString(1), rs1.getString(2));
}
return map;

        }
        
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return map;
	}

	public Map<String,String> new_tests_CountryWise() {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
        
        Map<String,String> map=new HashMap<String,String>();
       // String csvFilePath = "owed-covid-data.csv";
 
        
 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
            ResultSet rs1=stmt.executeQuery("SELECT location, Count(new_tests) FROM coviddatanew2 GROUP BY location "); 
           // ResultSet rs2=stmt.executeQuery("SELECT  sum(new_tests) from coviddatanew2" );
           
            while(rs1.next()) {
            	map.put(rs1.getString(1), rs1.getString(2));
            }

            return map;
        }
        
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return map;
	}

	public Map<String,String > total_tests_CountryWise() 
	{
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost/covid";
        String username = "postgres";
        String password = "1212";
 
       // String csvFilePath = "owed-covid-data.csv";
 
        Map<String,String> map=new HashMap<String,String>(); 
        Connection connection = null;
 
        try {
        	Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(jdbcURL, username, password);
            java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
            ResultSet rs1=stmt.executeQuery("SELECT location, Count(total_tests) FROM coviddatanew2 GROUP BY location "); 
           // ResultSet rs2=stmt.executeQuery("SELECT  sum(total_tests) from coviddatanew2" );
            
            while(rs1.next()) {
            	map.put(rs1.getString(1), rs1.getString(2));
            	}
            return map;
        	}
        
        catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        } 
        catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return map;
	
	}

 }
 
 