package ch17_collection.part2_set.sec12_Member;

import java.util.Set;
import java.util.TreeSet;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		Set<Member> set = new TreeSet<Member>();
		set.add(new Member(20, "james"));
		set.add(new Member(21, "maria"));
		set.add(new Member(22, "luna"));
		System.out.println(set);
	}

}
