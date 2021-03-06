package com.glarimy;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Member> members = new ArrayList<>();

	public void register(Member member) {
		members.add(member);
	}

	public void notify(String message) {
		for (Member member : members)
			member.receive(message);
	}

	public void unregister(Member member) {
		members.remove(member);
	}
}
