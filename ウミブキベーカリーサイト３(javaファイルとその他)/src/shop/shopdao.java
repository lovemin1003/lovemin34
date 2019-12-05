package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import bbs.bbs;
import shop.shop;



public class shopdao {
	

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static DataSource ds;
	
	

		public shopdao() {
			
		
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
		
		public int getnext()
		{
			String sql = "select shopid from shoppingresult order by shopid desc";
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
		
		
		public int write(
				String userid, String username, String usergender,
				String useremail, String customname,String customaddress1, String customaddress2,
				int tel1,int tel2,int tel3, String hope,
				int normalplain,int nutplain,int chocoplain,int milkplain,int cornplain,
				int chococake,int creamcake,int berrycake,int cheesecake,int sweetpotatocake,
				int creamplus,int creamless,
				int chococorone,int pumpkincorone,int berrycorone,
				int beanbread,
				int chocomuffin,int planemuffin,int honeymuffin,
				int potatokoroke,int currykoroke,int vegekoroke,
				int croissant,int chococroissant,int almondcroissant,
				int vegesandwich,int chickensandwich,int beefsandwich,int hamsandwich,int eggsandwich,
				int choucream,
				int cheesetart,int eggtart,int walnuttart,
				int planemakaron,int chocomakaron,int berrymakaron,int cheesemakaron,int greenmakaron,
				int dacquoise,
				int chocochip,
				int sabre,	int chocosabre,
				int gingerbread,
				int totalprice)
		{
			String sql = "insert into shoppingresult values"
					+ "(?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?)";
			try
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, getnext());
				ps.setString(2, getdate());
				ps.setString(3, userid);
				ps.setString(4, username);
				ps.setString(5, usergender);
				ps.setString(6, useremail);
				ps.setString(7, customname);
				ps.setString(8, customaddress1);
				ps.setString(9, customaddress2);
				ps.setInt(10, tel1);
				ps.setInt(11, tel2);
				ps.setInt(12, tel3);
				ps.setString(13, hope);
				ps.setInt(14, normalplain);ps.setInt(15, nutplain);ps.setInt(16, chocoplain);ps.setInt(17, milkplain);ps.setInt(18, cornplain);
				ps.setInt(19, chococake);ps.setInt(20, creamcake);ps.setInt(21, berrycake);ps.setInt(22, cheesecake);ps.setInt(23, sweetpotatocake);
				ps.setInt(24, creamplus);ps.setInt(25, creamless);
				ps.setInt(26, chococorone);ps.setInt(27, pumpkincorone);ps.setInt(28, berrycorone);
				ps.setInt(29, beanbread);
				ps.setInt(30, chocomuffin);ps.setInt(31, planemuffin);ps.setInt(32, honeymuffin);
				ps.setInt(33, potatokoroke);ps.setInt(34, currykoroke);ps.setInt(35, vegekoroke);
				ps.setInt(36, croissant);ps.setInt(37, chococroissant);ps.setInt(38, almondcroissant);
				ps.setInt(39, vegesandwich);ps.setInt(40, chickensandwich);ps.setInt(41, beefsandwich);ps.setInt(42, hamsandwich);ps.setInt(43, eggsandwich);
				ps.setInt(44, choucream);
				ps.setInt(45, cheesetart);ps.setInt(46, eggtart);ps.setInt(47, walnuttart);
				ps.setInt(48, planemakaron);ps.setInt(49, chocomakaron);ps.setInt(50, berrymakaron);ps.setInt(51, cheesemakaron);ps.setInt(52, greenmakaron);
				ps.setInt(53, dacquoise);
				ps.setInt(54, chocochip);
				ps.setInt(55, sabre);ps.setInt(56, chocosabre);
				ps.setInt(57, gingerbread);
				ps.setInt(58, totalprice);
				

				
				
				return ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return -1;
		}
		
		public ArrayList<shop> getlist(int pagenumber)
		{
			String sql = "SELECT * FROM (SELECT * FROM shoppingresult WHERE shopid < ? ORDER BY shopid DESC)";
			ArrayList<shop> list = new ArrayList<shop>();
			try 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, getnext() );
				rs = ps.executeQuery();
				while(rs.next())
				{
					shop shop= new shop();
					shop.setShopid(rs.getInt(1));
					shop.setShoppingdate(rs.getString(2));
					shop.setUserid(rs.getString(3));
					shop.setUsername(rs.getString(4));
					shop.setUsergender(rs.getString(5));
					shop.setUseremail(rs.getString(6));
					shop.setCustomname(rs.getString(7));
					shop.setCustomaddress1(rs.getString(8));
					shop.setCustomaddress2(rs.getString(9));
					shop.setTel1(rs.getString(10));
					shop.setTel2(rs.getString(11));
					shop.setTel3(rs.getString(12));
					shop.setHope(rs.getString(13));
					shop.setNormalplain(rs.getInt(14));
					shop.setNutplain(rs.getInt(15));
					shop.setChocoplain(rs.getInt(16));
					shop.setMilkplain(rs.getInt(17));
					shop.setCornplain(rs.getInt(18));
					shop.setChococake(rs.getInt(19));
					shop.setCreamcake(rs.getInt(20));
					shop.setBerrycake(rs.getInt(21));
					shop.setCheesecake(rs.getInt(22));
					shop.setSweetpotatocake(rs.getInt(23));
					shop.setCreamplus(rs.getInt(24));
					shop.setCreamless(rs.getInt(25));
					shop.setChococorone(rs.getInt(26));
					shop.setPumpkincorone(rs.getInt(27));
					shop.setBerrycorone(rs.getInt(28));
					shop.setBeanbread(rs.getInt(29));
					shop.setChocomuffin(rs.getInt(30));
					shop.setPlanemuffin(rs.getInt(31));
					shop.setHoneymuffin(rs.getInt(32));
					shop.setPotatokoroke(rs.getInt(33));
					shop.setCurrykoroke(rs.getInt(34));
					shop.setVegekoroke(rs.getInt(35));
					shop.setCroissant(rs.getInt(36));
					shop.setChococroissant(rs.getInt(37));
					shop.setAlmondcroissant(rs.getInt(38));
					shop.setVegesandwich(rs.getInt(39));
					shop.setChickensandwich(rs.getInt(40));
					shop.setBeefsandwich(rs.getInt(41));
					shop.setHamsandwich(rs.getInt(42));
					shop.setEggsandwich(rs.getInt(43));
					shop.setChoucream(rs.getInt(44));
					shop.setCheesetart(rs.getInt(45));
					shop.setEggtart(rs.getInt(46));
					shop.setWalnuttart(rs.getInt(47));
					shop.setPlanemakaron(rs.getInt(48));
					shop.setChocomakaron(rs.getInt(49));
					shop.setBerrymakaron(rs.getInt(50));
					shop.setCheesemakaron(rs.getInt(51));
					shop.setGreenmakaron(rs.getInt(52));
					shop.setDacquoise(rs.getInt(53));
					shop.setChocochip(rs.getInt(54));
					shop.setSabre(rs.getInt(55));
					shop.setChocosabre(rs.getInt(56));
					shop.setGingerbread(rs.getInt(57));
					shop.setTotalprice(rs.getInt(58));
					
					list.add(shop);
				}
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
			
			
			return list;
			
		}
		public ArrayList<shop> onlylist(int pagenumber, String userid)
		{
			
			String sql = "SELECT * FROM (SELECT * FROM shoppingresult WHERE shopid < ?  AND userid=? ORDER BY shopid ASC)";

			ArrayList<shop> list = new ArrayList<shop>();
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
					shop shop= new shop();
					shop.setShopid(rs.getInt(1));
					shop.setShoppingdate(rs.getString(2));
					shop.setUserid(rs.getString(3));
					shop.setUsername(rs.getString(4));
					shop.setUsergender(rs.getString(5));
					shop.setUseremail(rs.getString(6));
					shop.setCustomname(rs.getString(7));
					shop.setCustomaddress1(rs.getString(8));
					shop.setCustomaddress2(rs.getString(9));
					shop.setTel1(rs.getString(10));
					shop.setTel2(rs.getString(11));
					shop.setTel3(rs.getString(12));
					shop.setHope(rs.getString(13));
					shop.setNormalplain(rs.getInt(14));
					shop.setNutplain(rs.getInt(15));
					shop.setChocoplain(rs.getInt(16));
					shop.setMilkplain(rs.getInt(17));
					shop.setCornplain(rs.getInt(18));
					shop.setChococake(rs.getInt(19));
					shop.setCreamcake(rs.getInt(20));
					shop.setBerrycake(rs.getInt(21));
					shop.setCheesecake(rs.getInt(22));
					shop.setSweetpotatocake(rs.getInt(23));
					shop.setCreamplus(rs.getInt(24));
					shop.setCreamless(rs.getInt(25));
					shop.setChococorone(rs.getInt(26));
					shop.setPumpkincorone(rs.getInt(27));
					shop.setBerrycorone(rs.getInt(28));
					shop.setBeanbread(rs.getInt(29));
					shop.setChocomuffin(rs.getInt(30));
					shop.setPlanemuffin(rs.getInt(31));
					shop.setHoneymuffin(rs.getInt(32));
					shop.setPotatokoroke(rs.getInt(33));
					shop.setCurrykoroke(rs.getInt(34));
					shop.setVegekoroke(rs.getInt(35));
					shop.setCroissant(rs.getInt(36));
					shop.setChococroissant(rs.getInt(37));
					shop.setAlmondcroissant(rs.getInt(38));
					shop.setVegesandwich(rs.getInt(39));
					shop.setChickensandwich(rs.getInt(40));
					shop.setBeefsandwich(rs.getInt(41));
					shop.setHamsandwich(rs.getInt(42));
					shop.setEggsandwich(rs.getInt(43));
					shop.setChoucream(rs.getInt(44));
					shop.setCheesetart(rs.getInt(45));
					shop.setEggtart(rs.getInt(46));
					shop.setWalnuttart(rs.getInt(47));
					shop.setPlanemakaron(rs.getInt(48));
					shop.setChocomakaron(rs.getInt(49));
					shop.setBerrymakaron(rs.getInt(50));
					shop.setCheesemakaron(rs.getInt(51));
					shop.setGreenmakaron(rs.getInt(52));
					shop.setDacquoise(rs.getInt(53));
					shop.setChocochip(rs.getInt(54));
					shop.setSabre(rs.getInt(55));
					shop.setChocosabre(rs.getInt(56));
					shop.setGingerbread(rs.getInt(57));
					shop.setTotalprice(rs.getInt(58));
					
					list.add(shop);
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
			String sql = "select * from shoppingresult where shopid < ?";
			
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
		
		public boolean nextbbs(int pagenumber, String userid)//다음 게시글
		{
			String sql = "select * from shoppingresult where shopid = ? and userid=?";
			
			try 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,pagenumber);
				ps.setString(2,userid);
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

}
