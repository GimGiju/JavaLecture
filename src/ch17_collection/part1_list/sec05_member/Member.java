package ch17_collection.part1_list.sec05_member;

public class Member {
	private int age;
	private String name;
	private String gender;		//"남", "여"
	
	
	public Member() { }
	public Member(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;   // 바로 아래 return this.name.equals(((Member) obj).getName());를 간단하게 만든 코드
			return this.name.equals(((Member) obj).getName());  //위에 this.name과 비교하는 코드
		}
		return false;
	}
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
