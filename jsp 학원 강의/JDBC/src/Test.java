import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε� ����!!!");
		}catch(ClassNotFoundException e) {
			System.err.println("�ε� ����!!!");
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "jsp";
		String password = "jsp";
		
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!!");
		}catch(SQLException e) {
			System.err.println("���� ����!!");
			e.printStackTrace();
		}
		
		String sql = "insert into dbtest values(?,?,?,sysdate)";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("Ű �Է� : ");
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













