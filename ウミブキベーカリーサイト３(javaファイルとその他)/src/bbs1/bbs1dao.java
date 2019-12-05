package bbs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbs1.bbs1;

public class bbs1dao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public bbs1dao() 
{
		
	
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
	
	public String getdate()
	{
		String sql = "SELECT TO_CHAR(SYSDATE, 'RRRR-MM-DD hh24:mi') FROM DUAL";
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
			{
				return rs.getString(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}

	public int getnext()
	{
		String sql = "select commentid from bbs1 order by commentid desc";
		//SELECT * FROM (SELECT * FROM BBS WHERE bbsID < ? AND bbsAvailable = 1 ORDER BY bbsID DESC) WHERE ROWNUM <= 10
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
	
	public ArrayList<bbs1> getlist0(int bbsid)
	{
		String sql = "SELECT * FROM (SELECT * FROM bbs1 WHERE bbsid = ? AND bbsavailable = 1 ORDER BY bbsid DESC)";
		ArrayList<bbs1> list = new ArrayList<bbs1>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, bbsid);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs1 bbs= new bbs1();
				
				bbs.setBbsid(rs.getInt(1));
	
				bbs.setUserid(rs.getString(2));
				bbs.setBbsdate(rs.getString(3));
				bbs.setBbscontent1(rs.getString(4));
				bbs.setBbsavailable(rs.getInt(5));
				bbs.setUsername(rs.getString(6));
				bbs.setCommentid(rs.getInt(7));
				bbs.setFilename(rs.getString(9));


				list.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list;
		
	}
	
	public ArrayList<bbs1> getlist(int pagenumber)
	{
		String sql = "SELECT * FROM (SELECT * FROM bbs1 WHERE bbsid = ? AND bbsavailable = 1 ORDER BY commentid DESC)";
		ArrayList<bbs1> list = new ArrayList<bbs1>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, pagenumber);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs1 bbs= new bbs1();
				
				bbs.setBbsid(rs.getInt(1));
	
				bbs.setUserid(rs.getString(2));
				bbs.setBbsdate(rs.getString(3));
				bbs.setBbscontent1(rs.getString(4));
				bbs.setBbsavailable(rs.getInt(5));
				bbs.setUsername(rs.getString(6));
				bbs.setCommentid(rs.getInt(7));
				bbs.setFilename(rs.getString(9));


				list.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list;
		
	}
	
	public ArrayList<bbs1> getlist1(int commentid)
	{
		String sql = "SELECT * FROM (SELECT * FROM bbs1 WHERE commentid = ? AND bbsavailable = 1 ORDER BY bbsid DESC)";
		ArrayList<bbs1> list = new ArrayList<bbs1>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, commentid);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs1 bbs= new bbs1();
				
				bbs.setBbsid(rs.getInt(1));
	
				bbs.setUserid(rs.getString(2));
				bbs.setBbsdate(rs.getString(3));
				bbs.setBbscontent1(rs.getString(4));
				bbs.setBbsavailable(rs.getInt(5));
				bbs.setUsername(rs.getString(6));
				bbs.setCommentid(rs.getInt(7));
				bbs.setFilename(rs.getString(9));


				list.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list;
		
	}
	
	
	public boolean nextpage(int pagenumber)
	{
		String sql = "select * from bbs1 where bbsid < ? and bbsavailable = 1";
		
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
		
		
		
		public int update(int bbsid, String bbstitle, String bbscontent)
		{
			String sql = "update bbs1 set bbstitle= ?, bbscontent= ? where bbsid = ?";
			try
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, bbstitle);
				ps.setString(2, bbscontent);
				ps.setInt(3, bbsid);
				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
		}
		
	
		public String checkLogin(String userid)
		{
			String username = null;
			String sql = "select username from user1 where userid = ? ";
			
			try {
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, userid);
				
				rs = ps.executeQuery();
				if(rs.next()) {
					username = rs.getString("username");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return username;
		}
		
		
		public  int setbbsid(int bbsid)
		{
			//int bbsid = 0;
			String sql = "select bbsid from bbs where bbsid = ? ";
			
			try {
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, bbsid);
				
				rs = ps.executeQuery();
				if(rs.next()) {
					bbsid = rs.getInt("bbsid");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return bbsid;
		}
		
		public bbs1 getbbs(int bbsid)
		{
			String sql = "SELECT * FROM  bbs1 WHERE bbsid = ?";
			try 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, bbsid);
				rs = ps.executeQuery();
				while(rs.next())
				{
					bbs1 bbs= new bbs1();
					bbs.setBbsid(rs.getInt(1));
					
					bbs.setUserid(rs.getString(2));
					bbs.setBbsdate(rs.getString(3));
					bbs.setBbscontent1(rs.getString(4));
					bbs.setBbsavailable(rs.getInt(5));
					
					bbs.setUsername(rs.getString(6));
					bbs.setCommentid(rs.getInt(7));
					bbs.setFilename(rs.getString(9));


				return bbs;
				}
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
						
			return null;
		
		}
				
		public int write(int bbsid, String userid, String bbscontent1, String username, String filename)
		{
			String sql = "insert into bbs1 values(?,?,?,?,?,?,?,?,?)";
			if(filename!=null)//아래 문자가 들어간 파일은 들어가지 못 하게 막음.
			{
			if(
					filename.contains("<")||
					filename.contains(">")||
					filename.contains("[")||
					filename.contains("]")||
					filename.contains("^")||
					filename.contains("`")||
					filename.contains("{")||
					filename.contains("|")||
					filename.contains("}")
					)
			{
				return -2;

			}

			}
			try
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, bbsid);
				ps.setString(2, userid);
				ps.setString(3, getdate());
				ps.setString(4, bbscontent1);
				ps.setInt(5, 1);
				ps.setString(6, username);
				ps.setInt(7, getnext());
				ps.setInt(8, commentcount(bbsid));
				ps.setString(9, filename);

				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
		}
		
		public int updatebbsid(int bbsid)
		{
			String sql = "update bbs1 set bbsid= ? where bbsid = 0";
			try
			{
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setInt(1, bbsid);
				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
		}
		
		public int commentcount(int bbsid)
		{
			int commenthit=0;
			String sql = "select count(*) as commenthit from bbs1 where bbsid=?";
           try 
           {				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, bbsid);
				
				rs = ps.executeQuery();
				if(rs.next()) {
					commenthit = rs.getInt("commenthit");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return commenthit;
		}

		public int updatecomment(int commentid, String bbscontent1, String filename)
		{
			String sql = "update bbs1 set bbscontent1= ? ,filename = ? where commentid = ?";
			if(filename!=null)//아래 문자가 들어간 파일은 들어가지 못 하게 막음.
			{
			if(
					filename.contains("<")||
					filename.contains(">")||
					filename.contains("[")||
					filename.contains("]")||
					filename.contains("^")||
					filename.contains("`")||
					filename.contains("{")||
					filename.contains("|")||
					filename.contains("}")
					)
			{
				return -2;

			}

			}
			try
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, bbscontent1);
				ps.setString(2, filename);
				ps.setInt(3, commentid);
				
				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
		}
		public int deletecomment(int commentid)
		{
			String sql = "delete bbs1 where commentid = ? ";
			try
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, commentid);
				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
				
		}
		
}	
	
	
