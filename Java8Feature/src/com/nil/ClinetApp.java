package com.nil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.nil.streamapi.StreamAPI;

public class ClinetApp {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Dravid");
		memberNames.add("Sachin");
		memberNames.add("Dhoni");
		memberNames.add("Chahal");
		memberNames.add("Kohli");
		memberNames.add("Anil");
		StreamAPI api = new StreamAPI();

		// filter
		List<String> list = api.filter(memberNames, "A"); // filter names start with A from list
		System.out.println("Filtered List:: " + list);

		// change filtered result to Upper case
		api.map(memberNames, "D");

		// sort list
		api.sort(memberNames);

		boolean result = memberNames.stream().noneMatch(name -> name.startsWith("@&"));

		System.out.println("result::" + result);

		//count
		long count = memberNames.stream().filter(name -> name.startsWith("A")).count();
		System.out.println("count ::"+count);

		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "##" + s2);
		System.out.println(reduced);


		String firstMatchedName = memberNames.stream().filter((name) -> name.startsWith("D")).findFirst().get();
		System.out.println(firstMatchedName);
	}
}
