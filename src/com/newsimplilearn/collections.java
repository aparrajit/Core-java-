package com.newsimplilearn;

import java.util.ArrayList;
import java.util.Collections;

public class collections {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("appiu");
		list1.add("jhhdf");
		System.out.println(list1);
		list1.add("hhgdy");
		System.out.println(list1);
		System.out.println(list1.get(2));
		System.out.println(list1.get(list1.size() - 1));
		list1.set(list1.size() - 1, "appu");
		System.out.println(list1);

		// iterating the array list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		// iterating the array list using for each

		for (String name : list1) {
			System.out.println(name);
		}

		System.out.println(list1.get(2).equals("appu"));

		Collections.sort(list1);
		System.out.println(list1);

		Collections.reverse(list1);

	}

}
// TODO Auto-generated method stub
