package mysql.sec03_Song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongBySid(101);
		System.out.println(song);
		
		song = songDao.getSongByTitle("별빛");
		System.out.println(song);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
		
//		song = new Song("Hypeboy", "Baby, got me looking so crazy 빠져버리는 daydream");
//		songDao.insertSong(song);     
		song = songDao.getSongBySid(119);
		song.setTitle("Hype Boy");
		song.setLyrics("너 없이는 매일 매일이 yeah 재미없어 어쩌지");
		songDao.updateSong(song);
		
		List<Song>list = songDao.getSongListAll();
		list.forEach(x -> System.out.println(x));
		
		songDao.deleteSong(120);
		
		songDao.close();
	}

}
