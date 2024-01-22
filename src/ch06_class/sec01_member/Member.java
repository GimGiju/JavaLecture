package ch06_class.sec01_member;

import java.time.LocalDate;

public class Member {					// private 는 외부공개 x public 외부공개 o
	// 필드, 맴버, 속성
	public String name;
	private LocalDate birthday;
	private String email;
	
	//생성자(Constructor)
	public Member() { }
		
	public Member(String name, LocalDate birthday, String email) {
		this.name = name;              // this.name은 public String name울 가르킴
		this.birthday = birthday;
		this.email = email;
	}

	// 메소드(Method)
	public int getAge() {
		LocalDate today =  LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		int age = (month < birthday.getMonthValue() || 
					(month == birthday.getMonthValue() && day < birthday.getDayOfMonth())) ?
				year - birthday.getYear() - 1 : year - birthday.getYear();
		return age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", birthday=" + birthday + ", email=" + email + 
				 ", age=" + getAge() + "]";
	}
	

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 내부 클래스
	class innerClass{
		
	}
}

// 외부 클래스
class ExternaClass{
	
}