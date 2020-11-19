package com.heraizen.cj.day6.myiterator;


public class UserClient {
	public static void main(String[] args) {

		UserList ul = new UserList();
		MyIterator a = ul.getIterator();
		while (a.hasNext()) {
			System.out.println(ul.next());

		}
	}

}
