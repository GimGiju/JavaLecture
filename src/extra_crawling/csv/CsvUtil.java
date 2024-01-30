package extra_crawling.csv;

import java.util.List;

public interface CsvUtil {
	
	List<List<String>> readCsv(String filename);

	List<List<String>> readCsv(String filename, String separator);
	
	List<List<String>> readCsv(String filename,  int skipLine);
	
	List<List<String>> readCsv(String filename, String separator, int skipLine);   //List<List<String>> 문자열에 리스트에 리스트
	
	void writeCsv(String filename, List<List<String>> dataList);   // overloading 
	
	void writeCsv(String filename, List<List<String>> dataList, String separator);
}
