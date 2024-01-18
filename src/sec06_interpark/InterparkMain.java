package sec06_interpark;


public class InterparkMain {

	public static void main(String[] args) {
		Interpark[] interparks = new Interpark[5];
		interparks[0] = new Interpark(1, "처음부터 시작하는 주식투자 단타전략", "홍인기", " ", "길벗", "18900원");
		interparks[1] = new Interpark(2, "마흔에 읽는 쇼펜하우어", "강용수"," ", "유노북스", "15300원");
		interparks[2] = new Interpark(3, "세이노의 가르침 : 피보다 진하게 살아라", "세이노"," ", "데이원", "6480원");
		interparks[3] = new Interpark(4, "이처럼 사소한 것들", "Claire Keegan", "홍한별","다산책방", "12420원");
		interparks[4] = new Interpark(5, "내가 생각한 인생이 아니야 : 인생의 가장 큰 선물은 다른 인생", "류시화"," ", "수오서재", "16200원");

		for (int i = 0; i < Interpark.length; i++)
			System.out.println(interparks[i]);
		for (Interpark interpark: interparks)
			System.out.println(interpark);

	}

}
