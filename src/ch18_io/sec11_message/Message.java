package ch18_io.sec11_message;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
	private int mid;
	private String content;
	private String writer;
	private LocalDateTime modTime;
	private int isDeleted;
	
	public Message() { }
	
	
	
	public Message(String content, String writer) {
		super();
		this.content = content;
		this.writer = writer;
	}

	

	public Message(int mid, String content, String writer) {
		super();
		this.mid = mid;
		this.content = content;
		this.writer = writer;
	}

	

	public Message(int mid, String content, String writer, LocalDateTime modTime) {
		super();
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.modTime = modTime;
	}



	public Message(int mid, String content, String writer, LocalDateTime modTime, int isDeleted) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.modTime = modTime;
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Message [mid=" + mid + ", content=" + content + ", writer=" + writer 
				+ ", modTime=" + modTime.toString().substring(0, 19).replace("T", " ")
				+ ", isDeleted=" + isDeleted + "]";
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
	public LocalDateTime getModTime() {
		return modTime;
	}
	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}