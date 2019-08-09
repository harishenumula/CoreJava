package com.String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicateelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "java", "javascript", "rubby", "python", "c", "java", "c" };

		HashMap<String, Integer> storemap = new HashMap<String, Integer>();
		for (String name : names) {
			if (storemap.get(name) == null) {
				storemap.put(name, 1);
			} else {
				storemap.put(name, storemap.get(name) + 1);
			}
			Set<Entry<String, Integer>> entrysety = storemap.entrySet();
			for (Entry<String, Integer> entry : entrysety) {
				if (entry.getValue() > 1) {
					System.out.println("duplicate element is: " + entry.getKey());
				}
			}

		}
	}
}
