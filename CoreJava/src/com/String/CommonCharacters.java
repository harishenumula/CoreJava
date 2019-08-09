package com.String;

public class CommonCharacters {

	public static void main(String[] args) {

		String s1 = "rose";
		String s2 = "sunflower";
		int l1, l2, i, j;
		char cs;
		char ch;
		l1 = s1.length();
		l2 = s2.length();
		for (cs = 'a'; cs <= 'z'; cs++) {
			for (int k = 0; k < l1; k++) {
				ch = s1.charAt(k);
				if (ch == cs) {
					break;
				}
				for (int k2 = 0; k2 < l2; k2++) {
					ch = s2.charAt(k2);
					if (ch == cs) {
						break;
					}
					if (k < l1 && k2 < l2) {
						System.out.println(cs);
					}
				}
			}
		}
	}

}
