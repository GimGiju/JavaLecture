package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ListVsArray {

	public static void main(String[] args) {
		String[] array = "가나다라마바사".split("");
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();  //뒤쪽 String은 구현객체(ArrayList)이기 때문에 <String>이  없어도 괜찮음 
		list.add("가");list.add("나");list.add("다");list.add("라");
		list.add("마");list.add("바");list.add("사");
		System.out.println(list);
//		for (String element: list)
//			System.out.println(element + " ");
//		System.out.println();
//		list.forEach(x -> System.out.print(x + " "));     //위 코드와 동일한 결과가 나옴
//		System.out.println();
//		
		// 삭제
		array[2] =null; array[5] = null;
		System.out.println(Arrays.toString(array));
		
		list.remove("다");
		list.remove("바");
		list.forEach(x -> System.out.println(x + " "));
		System.out.println(list);
		
		// 삭제후 크기 비교
		System.out.println(array.length + ", " + list.size());
		
		// 추가(삽입)
		list.add("아");
		list.add("자");
		list.add("차");
		list.forEach(x -> System.out.print(x + " "));
		System.out.println(list);
		
		// 추가후 크기
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

}
