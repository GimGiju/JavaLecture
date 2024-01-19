package ch10_oop;

public class Main {

	public static void main(String[] args) {
		//Person 객체
		Person person = new Person();
		person.name = "제임스"; person.age = 27;
		person.eat(); person.sleep();
		
		//Student 객체
		Student student = new Student();
		student.name = "마리아"; student.age = 23; student.studentId = 1234;
		student.eat(); student.sleep(); student.study();
		
		//Worker 객체
		Worker worker = new Worker();
		worker.name = "브라이언"; worker.age = 32;
		worker.workerId = 9876;
		worker.eat(); worker.sleep();
		worker.work();
	}

}
