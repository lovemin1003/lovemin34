import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩 성공!!!");
		}catch(ClassNotFoundException e) {
			System.err.println("로딩 실패!!!");
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "jsp";
		String password = "jsp";
		
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!!");
		}catch(SQLException e) {
			System.err.println("연결 실패!!");
			e.printStackTrace();
		}
		
		String sql = "insert into dbtest values(?,?,?,sysdate)";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		
		sc.close();
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setDouble(3, height);
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

}













