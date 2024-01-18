package sec05_melonchart;



public class MelonChartMain {

	public static void main(String[] args) {
		MelonChart[] melons = new MelonChart[5];
		melons[0] = new MelonChart(1, "비의랩소디", "임재현", "비의랩소디", 33193);
		melons[1] = new MelonChart(2, "To.X", "태현", "To. X - The 5th Mini Album", 82783);
		melons[2] = new MelonChart(3, "Perfect Night", "르세라핌", "Perfect Night", 94989);
		melons[3] = new MelonChart(4, "Drama", "aespa", "Drama - The 4th Mini Album", 68534);
		melons[4] = new MelonChart(5, "에피소드", "이무진", "에피소드", 33230);

		for (int i = 0; i < MelonChart.length; i++)
			System.out.println(melons[i]);
		for (MelonChart melon: melons)
			System.out.println(melon);
	}	
 }

