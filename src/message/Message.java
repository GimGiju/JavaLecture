package message;

import java.time.LocalDate;


public class Message {

	private int mid;
	private String content;
	private String writer;
	private LocalDate genTime;
	private int Deleted;
	
	
	
	

	public Message() { }

	public Message(String content, String writer) {
		this.content = content;
		this.writer = writer;
	}
	
	

	public Message(int mid, String content, String writer) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
	}

	

	public Message(int mid, String content, String writer, LocalDate genTime) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.genTime = genTime;
	}

	

	public Message(int mid, String content, String writer, LocalDate genTime, int deleted) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.genTime = genTime;
		Deleted = deleted;
	}



	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public LocalDate getGenTime() {
		return genTime;
	}


	public void setGenTime(LocalDate genTime) {
		this.genTime = genTime;
	}


	public int getDeleted() {
		return Deleted;
	}


	public void setDeleted(int deleted) {
		Deleted = deleted;
	}
	
	
	
}
