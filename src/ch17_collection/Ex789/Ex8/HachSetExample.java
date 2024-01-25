package ch17_collection.Ex789.Ex8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch10_oop.Student;

public class HachSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "홍길동"));
		set.add(new Student(3, "홍길동"));
		
		Iterator<Studnet> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student studemt = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}

}
