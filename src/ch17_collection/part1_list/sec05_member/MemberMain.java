package ch17_collection.part1_list.sec05_member;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
	private static List<Member>list = new ArrayList<> ();
		
	
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int age = 20 + (int) (Math.random() * 20);
			list.add(new Member(age, "이름" + i, Math.random() > 0.5 ? "남" : "여"));
		}
		for(Member m: list)
			System.out.println(m);
		System.out.println("====================================================");
		
		// 나이가 30세 초과인 멤버 리스트
		List<Member> mList = getMemberListAbove30();
		mList.forEach(x -> System.out.println(x));
		
		// 남성 멤버 리스트
		List<Member> gList = getMemberListByGender("남");
		gList.forEach(x -> System.out.println(x));
		System.out.println("====================================================");
		
		// 새로운 맴버 추가
		Member member = new Member(39, "물통" ,"남");
		insertMember(member);
		list.forEach(x -> System.out.println(x));
		System.out.println("====================================================");
		
		// 멤버 삭제
		deleteMember("이름7");
		list.forEach(x -> System.out.println(x));
		System.out.println("====================================================");
		
		// 여성 멤버의 나이를 -1
		for(Member m: list) {
			if (m.getGender().equals("여")) {
				updateMember(m);
			}
			list.forEach(x -> System.out.println(x));
			System.out.println("====================================================");
		}
		
	}

	static List<Member>getMemberListAbove30(){            //나이가 30세 초과인 멤버리스트
		List<Member> mList = new ArrayList<>();
		for (Member m: list) {
			if(m.getAge() > 30) {
				mList.add(m);
			}
		}
		return mList;
	}
	
	static List<Member> getMemberListByGender(String gender){   // 남성 멤버 리스트
		List<Member> gList = new ArrayList<>();
		for (Member g: list) {
			if(g.getGender().equals(gender)) {
				gList.add(g)
;			}
		}
		return gList;
	}
	
	static void insertMember(Member member) {    // 새로운 맴버 추가
		list.add(member);
	}
	
	static void deleteMember(String name) {     // 멤버 삭제
		Member member = null;
		for (Member m: list) {
			if (m.getName().equals(name)) {
				member = m;
				break;
			}
		}
		list.remove(member);
	}
	
	static void updateMember(Member member) {    // 여성 멤버의 나이를 -1
		int index = list.indexOf(member);
		if(index >= 0) {
			member.setAge(member.getAge() -1 );    // 나이를 하나 줄일때 사용
			list.set(index, member);
		}
	}
}
				
