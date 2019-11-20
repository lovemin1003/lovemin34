package student.studentDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student.studentDTO.StudentDTO;

public class StudentDAO {
	public StudentDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public boolean insert(StudentDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "insert into student values(?,?,?)";
		
		boolean check = false;
		
		try {
			con = this.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getValue());
			ps.setInt(3, dto.getCode());
			int su = ps.executeUpdate();
			if(su != 0) {
				check = true;
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
		
		return check;
	}
	
	public int delete(String name) {
		String sql = "delete student where name = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int check = 0;
		
		try {
			con = this.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			check = ps.executeUpdate();
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
		
		return check;
		
	}
}




















