package mysql.secEx99_Song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongBySid(116);
		System.out.println(song);
		
		song = songDao.getSongByTitle("Dumb Dumb(덤덤)");
		System.out.println(song);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		List<Song>list = songDao.getSongListAll();
		
		song = new Song("I AM", "다른 문을 열어 따라갈 필요는 없어 넌 너의 길로, 난 나의 길로" );
		songDao.insertSong(song);
		
		song = songDao.getSongBySid(106);
		song.setTitle("OOH-AHH하게");
		song.setLyrics("어떻게 이제 더 할말이 없게 날 Ooh Ahh Ooh Ahh 하게 만들어줘");
		songDao.updateSong(song);
		
		songDao.deleteSong(108);
		
//		list = songDao.getSongListByLyrics("인기차트");
		list.forEach(x -> System.out.println(x));
		
		
	}

}
