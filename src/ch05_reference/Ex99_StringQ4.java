package ch05_reference;

public class Ex99_StringQ4 {

	public static void main(String[] args) {
		//4. C:Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
		//에서 파일명(04.string연습.js)만 출력하세요.

		String path = "C:\\Workspace\\WebProject\\03.JavaScript\\ch07.표준내장객체\\04.String연습.js";
		String pathArr[] = path.split("\\\\");			// "\\" 정규표현식으로 오해
		String fliename = pathArr[pathArr.length - 1];
		System.out.println(fliename);
	}

}
