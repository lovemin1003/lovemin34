package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;



public class userdao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static DataSource ds;

	public userdao() {
		
	
	try 
	{
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:myoracle";
		String user = "ora_user";
		String password = "hong";
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection(url,user,password);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		
}
	
	public int login(String userid,String userpassword)
	{
		
		String sql = "SELECT userpassword username FROM USER1  WHERE userid = ?";
		
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(userpassword))
				{ 
					return 1;
				}
				else
				{
					return 0;
				}
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -2; 
	
	        
	        
	}
	
	
	
	
	
	public int login1(String username, String userpassword)
	{
		
		//String sql = "SELECT useremail FROM USER1 WHERE username = ?";
		String sql = "SELECT userpassword FROM USER1 WHERE username = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(userpassword))
				{ 
					return 1;
				}
				else
				{
					return 0;
				}
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -2; 
	
	}
	
	public int findpw(  String username,String userid)
	{
		
		
		String sql = "SELECT username FROM USER1 WHERE userid = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(username))
				{ 
					return 1;
				}
				else
				{
					return 0;
				}
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -2; 
	
	}
	
	public int checkid(  String userid)
	{
		
		
		String sql = "SELECT * FROM USER1 WHERE userid = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			if(rs.next())
			{ 
					return 1;
				
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -2; 
	
	}
	
	public int checkname(  String username)
	{
		
		
		String sql = "SELECT * FROM USER1 WHERE username = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
					return 1;
				
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -2; 
	
	}
	
	public int getnext()
	{
		String sql = "select count from user1 order by count desc";
		
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				
				return rs.getInt(1)+1;
			}
			return 1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	public int join1(user1 user) 
	{
		String sql = " insert into user11 values(?,?,?,?,?,?)";
		try
		{			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, getnext());
			ps.setString(2, user.getUserid());
			ps.setString(3, user.getUserpassword());
			ps.setString(4, user.getUsername());
			ps.setString(5, user.getUsergender());
			ps.setString(6, user.getUseremail());
			
			return 1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return -1;
	}
	
	public int join(user1 user) 
	{
		
		String sql = " insert into user1 values(?,?,?,?,?,?)";
		try
		{
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, getnext());
			ps.setString(2, user.getUserid());
			ps.setString(3, user.getUserpassword());
			ps.setString(4, user.getUsername());
			ps.setString(5, user.getUsergender());
			ps.setString(6, user.getUseremail());
						
			return ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return -1;
	}
	
	
	

	public user1 getuser1(int count)
	{
		String sql = "SELECT * FROM  user1 WHERE count = ?";
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, count);
			rs = ps.executeQuery();
			while(rs.next())
			{
				user1 user1= new user1();
			    user1.setCount(rs.getInt(1));
				user1.setUserid(rs.getString(2));
				user1.setUserpassword(rs.getString(3));
				user1.setUsername(rs.getString(4));
				user1.setUsergender(rs.getString(5));
				user1.setUseremail(rs.getString(6));
				
				return user1;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return null;
	}
	
	
	
	public user1 getuser(String username)
	{
		String sql = "SELECT * FROM  user1 WHERE username = ?";
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while(rs.next())
			{
				user1 user1= new user1();
			user1.setCount(rs.getInt(1));
				user1.setUserid(rs.getString(2));
				user1.setUserpassword(rs.getString(3));
				user1.setUsername(rs.getString(4));
				user1.setUsergender(rs.getString(5));
				user1.setUseremail(rs.getString(6));
				
				return user1;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return null;
	}
	
	
	public ArrayList<user1> getlist(String userid)
	{
		
		String sql = "SELECT * FROM user1 WHERE userid=? order by count desc";
		ArrayList<user1> list = new ArrayList<user1>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			while(rs.next())
			{
				user1 user1= new user1();
			    user1.setCount(rs.getInt(1));
				user1.setUserid(rs.getString(2));
				user1.setUserpassword(rs.getString(3));
				user1.setUsername(rs.getString(4));
				user1.setUsergender(rs.getString(5));
				user1.setUseremail(rs.getString(6));
				
				list.add(user1);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list;
		
	}
	
	public ArrayList<user1> getlist1(String userid)
	{
		
		String sql = "SELECT * FROM user1 WHERE userid=?";
		ArrayList<user1> list = new ArrayList<user1>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			while(rs.next())
			{
				user1 user1= new user1();
			    user1.setCount(rs.getInt(1));
				user1.setUserid(rs.getString(2));
				user1.setUserpassword(rs.getString(3));
				user1.setUsername(rs.getString(4));
				user1.setUsergender(rs.getString(5));
				user1.setUseremail(rs.getString(6));
				
				list.add(user1);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list;
		
	}
	
	
	public String checkLogin(String userid,String userpassword) 
	{
		String username = null;
		String sql = "select username from user1 where userid = ? and userpassword = ?";
		
		try {
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, userpassword);
			rs = ps.executeQuery();
			if(rs.next()) {
				username = rs.getString("username");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return username;
	}
	
	
	public String findId(String username, String userpassword) 
	{
		String userid = null;
		
		String sql = "select userid from user1 where username = ? and userpassword = ?";
		
		try {
			
			PreparedStatement ps=con.prepareStatement(sql);			
			ps.setString(1, username);
			ps.setString(2, userpassword);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				userid = rs.getString("userid");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return userid;
		
	}
	
	public String findpassword(String userid, String username) 
	{
		String userpassword = null;
		
		String sql = "select userpassword from user1 where userid = ? and username = ?";
		
		try {
			
			PreparedStatement ps=con.prepareStatement(sql);			
			ps.setString(1, userid);
			ps.setString(2, username);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				userpassword = rs.getString("userpassword");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return userpassword;
		
	}
	
	public int update(String userid, String userpassword, String username,String usergender, String useremail)
	{
		String sql = "update user1 set userpassword= ?,username= ?,usergender= ?,useremail= ? where userid= ?";
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1, userpassword);
			ps.setString(2, username);
			ps.setString(3, usergender);
			ps.setString(4, useremail);
			ps.setString(5, userid);
			
			return ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	public int update1(String userid, String userpassword, String username,String usergender, String useremail)
	{
		String sql = "update user11 set userpassword= ?,username= ?,usergender= ?,useremail= ? where userid= ?";
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1, userpassword);
			ps.setString(2, username);
			ps.setString(3, usergender);
			ps.setString(4, useremail);
			ps.setString(5, userid);
			
			return ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
		
	
	
	
	
	
	public int delete(String userid, String userpassword) 
	{
		String sql = "SELECT userpassword FROM USER1 WHERE userid = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			rs = ps.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(userpassword))
				{
					return delete1(userid,userpassword);
				}
				else
				{
					return 0;
				}
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -2; 	
	
	}
	
	public int delete1(String userid, String userpassword)
	{
		String sql = "delete user1 where userid = ? and userpassword=?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, userpassword);
			rs = ps.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(userpassword))
					return 1;
				else
					return 0;
			}
			return -1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        return -3; 	
	
	}
}

