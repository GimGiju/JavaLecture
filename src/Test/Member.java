package Test;

public class Member {      // class 타입
	private int mid;    // id
	private String name;   //이름
	private int birthYear;		//생일 나이
	private String tel;			// 핸드폰 번호
	
	public Member() { } 
	
	public Member(int mid, String name, int birthYear, String tel) {
		this.mid = mid;
		this.name = name;
		this.birthYear = birthYear;
		this.tel = tel;
	}
	
	// private int getAge(){
	// LocalDate today = LocalDate.now();   // static 메소드라서 .now가 기울어짐
	// return today.getYear() - birthYear;
	// }
	@Override
	public String toString() {
        int age = java.time.Year.now().getValue() - birthYear; // 바로위에 나이 구하는거랑 동일한 코드
        return "ID: " + mid + ", 이름: " + name + ", 나이: " + age + ", 전화번호: " + tel;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
