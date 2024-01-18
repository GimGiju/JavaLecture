package sec06_interpark;

public class Interpark {
	public int rank;
	public String title;
	public String author;
	public String translator;
	public String company;
	public String price;
	
	public Interpark(int rank, String title, String author, String trnaslator, String price, String company) {
		this.rank = rank;
		this.title = title;
		this.author = author;   // 작가
		this.translator = trnaslator;   //역자
		this.company = company;
		this.price = price;
	}

	public static final int length = 0;
	

	public void Interpark1(int rank2, String title2, String author2, String trnaslator, String price2, String company2) {
		
	}

	@Override
	public String toString() {
		return "Interpark [rank= " + rank + ", title= " + title + ", author= " + author + ", translator= " + translator
				+ ", company= " + company + ", price= " + price + "]";
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
