package com.nil.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public List<String> filter(List<String> memberNames,String ch) {
		List<String> list = memberNames.stream().filter(name -> name.startsWith(ch)).collect(Collectors.toList());
		return list;
	}

	public void map(List<String> memberNames, String ch) {
	
		memberNames.stream().filter(s -> s.startsWith(ch)).map(String::toUpperCase)
        .forEach(System.out::println);   
}

	public void sort(List<String> memberNames) {
		System.out.println("Sorted List::");
		 memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}
}