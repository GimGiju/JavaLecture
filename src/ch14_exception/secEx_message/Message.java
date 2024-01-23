package ch14_exception.secEx_message;

public class Message {
	private String mid;
	private String content;
	private String writer;
	private int genTime;
	private int isDeleted;
	
	public Message(String mid, String content, String writer, int genTime, int isDeleted) {
		this.mid = mid;
		this.content = content;
		this.writer = writer;
		this.genTime = genTime;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Message [mid=" + mid + ", content=" + content + ", writer=" + writer + ", genTime=" + genTime
				+ ", isDeleted=" + isDeleted + "]";
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

	public int getGenTime() {
		return genTime;
	}

	public void setGenTime(int genTime) {
		this.genTime = genTime;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
