package ch17_collection.part3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		map.put("사과",1500);
		map.put("배", 2500);
		map.put("감", 1000);
		map.put("배", 3000);		// map 안에 key 값이 없으면 생성, 있으면 값 수정
		System.out.println(map);
		
		// 추출하는 방법
		System.out.println(map.get("사과"));  //key로 값을 얻는 법( 옆처럼 하면 가격이 추출됨)
		
		// 정보를 추출하는 방법
		System.out.println(map.containsKey("배")+ ", " + map.containsValue(4000));   // true, false
		
		// key의 Set collection - 권장하는 방법
		Set<String> keySet = map.keySet();
		for (String key: keySet) {
			System.out.println(key + ": " + map.get(key));   // 결과값 배: 3000    감: 1000   사과: 1500
			
		// Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}	
		System.out.println("====================== Stream으로 처리");
		map.forEach((k, v) -> System.out.println(k + ": " +v));
		}																				
			
		// 삭제 
		map.remove("감");
		System.out.println(map.size());
		map.forEach((k, v) -> System.out.println(k + ": " +v));
	}

}
