package com.tcs.hashcode.demo;

public class Hashcode1 {
	public static void main(String[] args) {
		User2 user2 = new User2("Ram");
		System.out.println(user2.hashCode());
		User2 user3 = new User2("Ram");
		System.out.println(user3.hashCode());
		System.out.println(user2.equals(user3));
	}

}


class User2 {
	String name;

	public User2(String string) {
		this.name = string;
	}

//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
	
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
