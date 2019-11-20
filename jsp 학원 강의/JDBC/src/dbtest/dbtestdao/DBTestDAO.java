package dbtest.dbtestdao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import dbtest.dbtestdto.DBTestDTO;

public class DBTestDAO {

	public DBTestDAO(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("로딩 성공!!!");
		}catch(ClassNotFoundException e) {
			System.err.println("로딩 실패!!!");
			e.printStackTrace();
		}
	}
	
	private Connection  getConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "jsp";
		String password = "jsp";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!!");
		}catch(SQLException e) {
			System.err.println("연결 실패!!");
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void insert(DBTestDTO dto) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into dbtest values(?,?,?,sysdate)";
		
		try {
			con = this.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setDouble(3, dto.getHeight());
			int su = ps.executeUpdate();
			if(su != 0) {
				System.out.println(su + "rows inserted!!!");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void select() {
		String sql = "select * from dbtest";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = this.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {//다음 데이터가 있느냐
				String name = rs.getString(1);
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				//String logtime = rs.getString("logtime");
				
				Date logtime = rs.getDate("logtime");
				
				SimpleDateFormat df = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
				String date = df.format(logtime);
				
				
				System.out.println(name + "\t" + age + "\t" + height + "\t" + date);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}















