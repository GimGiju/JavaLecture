package message;

import java.time.LocalDateTime;

public class Message {
	private String save;
	private String mid;
	private String content;
	private String writer;
	private LocalDateTime genTime;
	private int Deleted;
	
	public Message() { }

	public Message(String content, String writer) {
		this.content = content;
		this.writer = writer;
	}

	public Message(String mid, String save, String content, String writer) {
		this.mid = mid;
		this.save = save;
		this.content = content;
		this.writer = writer;
	}



	public Message(String mid, String save, String content, String writer, LocalDateTime genTime) {
		this.mid = mid;
		this.save = save;
		this.content = content;
		this.writer = writer;
		this.genTime = genTime;
	}

	
	public Message(String mid, String save, String content, String writer, LocalDateTime genTime, int deleted) {
		this.mid = mid;
		this.save = save;
		this.content = content;
		this.writer = writer;
		this.genTime = genTime;
		Deleted = deleted;
	}

	

	@Override
	public String toString() {
		return "Message [save=" + save + ", mid=" + mid +   ", content=" + content + ", writer=" + writer + ", genTime="
				+ genTime + ", Deleted=" + Deleted + "]";
	}

	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
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


	public LocalDateTime getGenTime() {
		return genTime;
	}


	public void setGenTime(LocalDateTime genTime) {
		this.genTime = genTime;
	}


	public int getDeleted() {
		return Deleted;
	}


	public void setDeleted(int deleted) {
		Deleted = deleted;
	}
	
	
	
}
