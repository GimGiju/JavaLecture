package sec05_melonchart;

public class MelonChart {
	public static final int length = 0;
	public int rank;
	public String title;
	public String artist;
	public String album;
	public int like;
		
	public MelonChart(int rank, String title, String artist, String album, int like) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.like = like;
	}

	public void MelonChart1(int rank2, String title2, String artist2, String album2, int like2) {
		
	}

	@Override
	public String toString() {
		return "MelonChart [rank= " + rank + ", title= " + title + ", artist= " + artist + ", album= " + album + ", like= "
				+ like + "]";
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}
	
}
