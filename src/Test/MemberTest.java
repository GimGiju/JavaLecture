package Test;

import java.util.ArrayList;
import java.util.List;


public class MemberTest {
    public static void main(String[] args) {
    	
        Member one = new Member(1, "James", 1990, "010-1234-5678");
        Member two = new Member(2, "Maria", 1985, "010-8765-4321");

        
        List<Member> memberList = getMemberList(one, two);

        one.setTel("010-1212-3434");
        two.setTel("010-4545-5656");

        for (Member member : memberList) {
            System.out.println(member);
        }
    }

	private static List<Member> getMemberList(Member one, Member two) {
		ArrayList<Member> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        return list;
	}
}