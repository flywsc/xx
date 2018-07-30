package com.wsc201820;

public class _04 {
	public static void main(String[] args) {

		String s1 = "kdjvsdnhvlkfndslnzlkfdlkbdzljJFDZSOIJBFGIBH/L. NBHDPFFFFFKLBNFDKNBFDLKN";
		int[] small = new int[26];// 定义小写字母数组
		int[] big = new int[26];// 定义大写字母数组
		int len = s1.length();// 获取字符串长度

		for (int i = 0; i < len; i++) {
			char ch = s1.charAt(i);
			if (ch > 'A' && ch < 'Z') {// 判断是不是大写
				big[ch - 65]++;
			} else if (ch > 'a' && ch < 'z') {// 判断是不是小写
				small[ch - 97]++;
			}
		}
		System.out.println("字符串中的大写字母有");
		for (int i = 0; i < 26; i++) {
			if (big[i] != 0) {
				System.out.print((char) +(i + 65) + ":" + big[i]+"\t");

			}
		}
		System.out.println();
		System.out.println("字符串中的小写字母有");
		for (int i = 0; i < 26; i++) {
			if (small[i] != 0) {

				System.out.print((char) +(i + 97) + ":" + small[i]+"\t");
			}
		}

	}
}
