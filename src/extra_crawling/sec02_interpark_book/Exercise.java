package extra_crawling.sec02_interpark_book;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Exercise {

	public static void main(String[] args) throws IOException {
		String url = "https://book.interpark.com/display/collectlist.do?_method=BestsellerHourNew201605&bestTp=1&dispNo=028";
		Document doc = Jsoup.connect(url).get();
		
		Elements lis = doc.select(".rankBestContentList > ol > li ");   //여러개를 찾을때는 ElementsFirst 한개는 Elements .은 클래스 의미
		System.out.println(lis.size());
		
		Element li = lis.get(14);    // 한가지만 찾을때
		String title = li.selectFirst(".itemName").text().strip();
		String author = li.selectFirst(".author").text().strip();
		String company = li.selectFirst(".company").text().strip();
		String price_ = li.selectFirst(".price > em").text().strip();  //price_의 의미 모름 
		int price = Integer.parseInt(price_.replace(",", ""));
		System.out.println(title + ", " + author + ", " + company + ", " + price);
		
		Elements spans = li.select(".rankNumber.digit2 > span");
		String rank_ = "";
		for (Element span: spans) {
			String s = span.attr("class").strip();
//			System.out.print(s.charAt(s.length() - 1));
			rank_ += s.charAt(s.length() -1);
					}
		int rank = Integer.parseInt(rank_);
		System.out.println(rank_);
	}
}
