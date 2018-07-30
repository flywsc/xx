package com.wsc201821;

public class _20 {
	public static void main(String[] args) {
         //字符串分割
		String cut = "192.168.43.1";
		String cut1[] = cut.split("\\.");
		//只作为.来分割
		String cut2[] = cut.split("\\.",2);
		//加一个2，就是代表分割次数
		// 支持正则表达式
		for (int i = 0; i < cut2.length; i++) {
			System.out.println("["+cut2[i]+"]");
		}
	}
}
