package com.wsc201821;

public class _15 {
	private static char[] temp;

	// 字符串变成字符串数组
	public static void main(String[] args) {
		String demo = "我是一个字符串";
		char[] ch = demo.toCharArray();
//        for(int i=0;i<demo.length();i++) {这里的返回值是int
//        	System.out.println(ch[i]);
//        }
		for (char temp : ch) {// 记住返回值是char
			System.out.println(temp);
		}
	}
}
