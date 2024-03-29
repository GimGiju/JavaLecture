package mysql.sec01_basic;				// 파라메터가 없는 경우에 사용하는 방법 (stmt)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_Select {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", // 호스트, 포트 , DB명
					"hmuser", "hmpass" // 사용자 이름, 패스워드
			);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM city WHERE countrycode='KOR' LIMIT 10";

			// Select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1); // rs.getInt("ID") 와 int id = rs.getInt(1); 둘다 가능
				String name = rs.getString(2);
				String countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.println(id + ", " + name + ", " + countryCode + ", " + district + ", " + population);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
