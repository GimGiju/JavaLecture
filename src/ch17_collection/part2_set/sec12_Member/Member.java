package ch17_collection.part2_set.sec12_Member;

public class Member implements Comparable {
	private int age;
	private String name;

	public Member() {
	}

	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Member) {
			Member m = (Member) o;
			// 이름으로 비교
//			return this.name.compareTo(m.getName());
			// 이름으로 먼저 비교하고, 같으면 나이의 역순
			if (this.name.compareTo(m.getName()) == 0) {
				return m.getAge() - this.age;
			} else {
				return this.name.compareTo(m.getName());
			}
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + "]";
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
}
