package extra_api;

import java.util.Map;

public class MapMain {

	public static void main(String[] args) throws Exception {
		RoadAddrApi roadApi = new RoadAddrApi();
		KakaoLocalApi kakaoApi = new KakaoLocalApi();
		
		String[] places = {"경기도청", "팔달구청", "장안구청", "영통구청", "권선구청"};
		for(String place: places) {
			String roadAddr = roadApi.getRoadAddr(place);
			Map<String, Double> geoCode = kakaoApi.getGeocode(roadAddr);
			System.out.printf("%s: %s, %.6f, %.6f%n", place, roadAddr, geoCode.get("lat"), geoCode.get("lon"));
			// 지명 위도 경도까지 나옴 경기도청: 경기도 수원시 영통구 도청로 30 (이의동), 37.289285, 127.053543
		}
	}

}
