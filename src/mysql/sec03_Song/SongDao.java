package mysql.sec03_Song;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SongDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public SongDao() {
		String path = "C:/Workspace/Java/lesson/src/mysql/mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));

			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection myConnection() {					// db에 접속해서 접속정보를 나에게 돌려주는 역활
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public Song getSongBySid(int sid) {
		String sql = "select * from song where sid=?";   // sid=? 에서 ?에 sid값을 맵핑
		Song song = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);		// 파라메터 세팅
			pstmt.setInt(1, sid);						// 파라메터 세팅
			
			ResultSet rs = pstmt.executeQuery();		//SQL 실행 후 결과를 ResultSet에 받기
			while (rs.next()) {				// ResultSet은  While를 사용해서 받아옴.
				song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
			// sid = rs.getInt(1); String title = rs.getString(2); String lyrics = rs.getString(3); 
			// song = new Song(sid, title, lyrics);       //도 사용가능. 
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}

	public Song getSongByTitle(String title) {
		String sql = "select * from song where title like ?";   // = 은 완전한 정확한 일치를 찾을 떄 사용되고 like는 패턴을 사용하여 유연한 문자열 일치를 찾을 때 사용 됨.
		Song song = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + title + "%");					//%별빛% - 제목에 별빛 검색

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
				// int sid = rs.getInt(1);  title = rs.getString(2); String lyrics = rs.getString(3); 
				// song = new Song(sid, title, lyrics);       //도 사용가능.
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}

	public List<Song> getSongListAll() {   // 리스트를 전부 가져오는 기능!
		String sql = "select * from song";
		List<Song> list = new ArrayList<Song>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);    // SQL 실행 후 결과를 ResultSet에 받기
			while (rs.next()) {
				Song song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
				// int sid = rs.getInt(1);  String title = rs.getString(2); String lyrics = rs.getString(3); 
				// song = new Song(sid, title, lyrics);       //도 사용가능.
				list.add(song);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Song> getSongListByLyrics(String lyrics){
		String sql = "select * from song where lyrics like ?";
		List<Song>list = new ArrayList<Song>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lyrics);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Song song = new Song (rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(song);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertSong(Song song) {
		String sql = "insert into song values(default, ?, ?)";
		try {
			PreparedStatement  pstmt = conn.prepareStatement(sql);  // 파라메터 세팅
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getLyrics());
			
			pstmt.executeUpdate();   //SQL 실행
			
			pstmt.close();  // pstmt 실행 종료해주기.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateSong(Song song) {
		String sql = "update  song set title=?, lyrics=? where Sid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getLyrics());
			pstmt.setInt(3, song.getSid());
			
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteSong(int Sid) {
		String sql = "delete from  song where Sid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Sid);
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {     //자바에서 데이터베이스 연결을 닫는 기능을 수행하는 메서드, 주요 기능은 데이터베이스 연결을 안전하게 종료하는 것
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
