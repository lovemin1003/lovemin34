package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbs.bbs;


public class shopbbsdao {
	
	private static Connection con;
	private PreparedStatement ps;
	private static ResultSet rs;

	public shopbbsdao() 
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
		String sql = "SELECT TO_CHAR(SYSDATE, 'RRRR-MM-DD hh24:mi:ss') FROM DUAL";
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
	
	public static int getnext()
	{
		String sql = "select bbsid from shoppingbbs order by bbsid desc";
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
	
	
	public int write(String bbstitle, String userid, String bbscontent, String username, String filename)
	{
		String sql = "insert into shoppingbbs values(?,?,?,?,?,?,?,?,?)";
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
			ps.setInt(1, getnext());
			ps.setString(2, bbstitle);
			ps.setString(3, userid);
			ps.setString(4, getdate());
			ps.setString(5, bbscontent);
			ps.setInt(6, 1);
			ps.setInt(7, 0);
			ps.setString(8, username);
			ps.setString(9, filename);

			
			
			return ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	public ArrayList<bbs> getlist(int pagenumber)
	{
		String sql = "SELECT * FROM (SELECT * FROM shoppingbbs WHERE bbsid < ? AND bbsavailable = 1 ORDER BY bbsid DESC) WHERE ROWNUM <= 10";
		ArrayList<bbs> list = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
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
	
	public ArrayList<bbs> getlist2(int pagenumber, String search)//작성자로 글 찾기
	{
		String sql = "SELECT * FROM shoppingbbs WHERE bbsid < ? AND bbsavailable = 1 AND userid = ? ORDER BY bbsid desc";
		ArrayList<bbs> list2 = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			//ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			ps.setInt(1, getnext());
			ps.setString(2, search);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
				bbs.setFilename(rs.getString(9));
				list2.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list2;
		
	}
	
	public ArrayList<bbs> getlist3(int bbsid, String userid)
	{
		String sql = "SELECT * FROM shoppingbbs WHERE bbsid = ? AND bbsavailable = 1 AND userid = ? ORDER BY bbsid desc";
		ArrayList<bbs> list3 = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			//ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			ps.setInt(1, bbsid);
			ps.setString(2, userid);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
				bbs.setFilename(rs.getString(9));
				list3.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list3;
		
	}
	
	public ArrayList<bbs> getlist4(int pagenumber)
	{
		String sql = "SELECT * FROM (SELECT * FROM shoppingbbs WHERE bbsid = ? AND bbsavailable = 1 ORDER BY bbsid DESC) WHERE ROWNUM <= 10";
		ArrayList<bbs> list = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, pagenumber );
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
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
	
	public ArrayList<bbs> getlist5(int pagenumber, String search)//제목으로 글 찾기
	{
		String sql = "SELECT * FROM shoppingbbs WHERE bbsid < ? AND bbsavailable = 1 AND bbstitle like ? ORDER BY bbsid desc";
		ArrayList<bbs> list5 = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			//ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			ps.setInt(1, getnext());
			ps.setString(2, "%"+search+"%");
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
				bbs.setFilename(rs.getString(9));
				list5.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list5;
		
	}
	
	public ArrayList<bbs> getlist6(int pagenumber, String search)//글 내용으로 글 찾기
	{
		String sql = "SELECT * FROM shoppingbbs WHERE bbsid < ? AND bbsavailable = 1 AND bbscontent like ? ORDER BY bbsid desc";
		ArrayList<bbs> list6 = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			//ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			ps.setInt(1, getnext());
			ps.setString(2, "%"+search+"%");
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
				bbs.setFilename(rs.getString(9));
				list6.add(bbs);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
		return list6;
		
	}

	
	public int user1search(  String search)//가입한 사람인지 확인
	{
		
		
		String sql = "SELECT * FROM user1 WHERE userid = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, search);
			
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
	
	public int bbssearch(  String search)//게시글에 글 쓴 사람인지 확인
	{
		
		
		String sql = "SELECT * FROM shoppingbbs WHERE userid = ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, search);
			
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
	
	public int titlesearch(String search)//제목으로 글 찾기.
	{
		
		
		String sql = "SELECT * FROM shoppingbbs WHERE bbstitle like ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(2, "%"+search+"%");
			
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
	
	public int contentsearch(String search)//제목으로 글 찾기.
	{
		
		
		String sql = "SELECT * FROM shoppingbbs WHERE bbscontent like ?";
		try
		{
			ps = con.prepareStatement(sql);
			ps.setString(2, "%"+search+"%");
			
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
	
	public boolean nextpage(int pagenumber)
	{
		String sql = "select * from shoppingbbs where bbsid < ? and bbsavailable = 1";
		
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

	
	public ArrayList<bbs> onlylist(int pagenumber, String userid)
	{
		//String sql = "SELECT * FROM (SELECT * FROM shoppingbbs WHERE bbsid < ? AND bbsavailable = 1 AND userid=? ORDER BY bbsid DESC) WHERE ROWNUM <= 10";
		String sql = "SELECT * FROM (SELECT * FROM shoppingbbs WHERE bbsid < ? AND bbsavailable = 1 AND userid=? ORDER BY bbsid DESC)";

		ArrayList<bbs> list = new ArrayList<bbs>();
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			//ps.setInt(1, getnext() - (pagenumber - 1) * 10);
			//ps.setInt(1, (onlynext(userid) % 10)+2);
			ps.setInt(1, getnext() );
			ps.setString(2, userid);
			rs = ps.executeQuery();
			while(rs.next())
			{
				bbs bbs= new bbs();
				bbs.setBbsid(rs.getInt(1));
				bbs.setBbstitle(rs.getString(2));
				bbs.setUserid(rs.getString(3));
				bbs.setBbsdate(rs.getString(4));
				bbs.setBbscontent(rs.getString(5));
				bbs.setBbsavailable(rs.getInt(6));
				bbs.setHit(rs.getInt(7));
				bbs.setUsername(rs.getString(8));
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
		
		public bbs getbbs(int bbsid)
		{
			String sql = "SELECT * FROM  shoppingbbs WHERE bbsid = ?";
			try 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, bbsid);
				rs = ps.executeQuery();
				while(rs.next())
				{
					bbs bbs= new bbs();
					bbs.setBbsid(rs.getInt(1));
					bbs.setBbstitle(rs.getString(2));
					bbs.setUserid(rs.getString(3));
					bbs.setBbsdate(rs.getString(4));
					bbs.setBbscontent(rs.getString(5));
					bbs.setBbsavailable(rs.getInt(6));
					bbs.setHit(rs.getInt(7));
					bbs.setUsername(rs.getString(8));
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
		
		public int update(int bbsid, String bbstitle, String bbscontent,String filename)
		{
			String sql = "update shoppingbbs set bbstitle= ?, bbscontent= ?, filename= ? where bbsid = ?";
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
				ps.setString(1, bbstitle);
				ps.setString(2, bbscontent);
				ps.setString(3, filename);
				ps.setInt(4, bbsid);
				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
		}
		
		public int delete(int bbsid)
		{
			String sql = "delete from shoppingbbs where bbsid = ?";
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
		
		public int readcount(int bbsid) {
			String sql = "update shoppingbbs set hit = hit + 1 where bbsid = ?";
			
			try {
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, bbsid);
				return ps.executeUpdate();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			return -1;
			
			
		}
		public boolean nextbbs(int pagenumber)//다음 게시글
		{
			String sql = "select * from shoppingbbs where bbsid = ? and bbsavailable = 1";
			
			try 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,pagenumber);
				rs=ps.executeQuery();
				if(rs.next()||pagenumber>getnext()||pagenumber<=0)
					//글 번호가 0 이하면 글이 없으니 이전글이 나오면 안 되며
					//글 번호가 현재 최대 글번호를 넘어가도 글이 없으니 다음글이 나오면 안 됨.
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
		
	
	
}