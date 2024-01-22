package ch06_class.sec11_melon;

import java.util.ArrayList;
import java.util.List;

public class MelonMain1 {

	public static void main(String[] args) {
		MelonChart1 melonChart = new MelonChart1 ();
		melonChart.setRank(1);melonChart.setTitle("비의 랩소디");melonChart.setArtist("임재현");;
		melonChart.setAlbum("비의 랩소디");melonChart.setLike(33785);
		System.out.println(melonChart);
		
		// 필드값을 객체를 생성할 때 부여
		MelonChart1 melonChart2 = new MelonChart1(2, "To. X", "태연", "To. X", 83812);
		
		MelonChart1[] melonChartArray = {melonChart, melonChart2,
				new MelonChart1(3, "Perfect Night", "르세라핌", "Perfect Night", 95252),
				new MelonChart1(4, "에피소드", "이무진", "에피소드", 33816),
				new MelonChart1(5, "Drama", "Drama", "Drama", 68790)
		};
		for(MelonChart1 mc: melonChartArray)
			System.out.println(mc);
		
		// 실전에서 사용하는 코드
		List<MelonChart1> list = new ArrayList<>();
		list.add(melonChart); list.add(melonChart2);
		list.add(new MelonChart1(3, "Perfect Night", "르세라핌", "Perfect Night", 95252));
		list.add(new MelonChart1(4, "에피소드", "이무진", "에피소드", 33816));
		list.add(new MelonChart1(5, "Drama", "Drama", "Drama", 68790));
//		for(MelonChart1 mc: melonChartArray)
//			System.out.println(mc);
		list.forEach(x -> System.out.println(x));   //x가 어디에서 나온건지 모름...
	}

}
