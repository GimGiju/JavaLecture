package ch05_reference;

public class Ex99_StringQ1 {

	public static void main(String[] args) {
		//1. 1에서 1000사이에 0은 몇번, 1은 몇번, ...., 9는 몇번 사용되었는가?
		// 0123456789101112131415....9991000
		String numStr = "";
		for (int i = 1; i <= 1000; i++){
		    numStr += i;
		}
		System.out.println(numStr.replace("[^1]", " "));
		for(int i = 0; i <= 9; i++){
		    int pattern = new RegExp("[^' + i + ']", 'g');
		    count = numStr.replace(pattern, '').length

    		System.out.println('i'+ i + ": count" + count)
		}
	}

}
