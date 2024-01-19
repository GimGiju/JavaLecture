package sec03_static;

public class SampleMain {

	public static void main(String[] args) {
		Sample sample = new Sample();
		
		System.out.println(sample.instanceField);
		sample.instanceMethod();
		
		// 스택틱 필드, 메소드를 사용하는 방법
		System.out.println(sample.STATIC_FIELD);
		sample.staticMethod();
	}

}
