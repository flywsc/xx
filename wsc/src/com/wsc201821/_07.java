package com.wsc201821;

public class _07 {
	public static void main(String[] args) {
		// 使用构造方法就直接字符数组实例化
		char chararray[] = { 't', 'i', 'm', 'e' };
		String a = new String(chararray);
		System.out.println(a);

		// 方法2
		// 获取指定位置字符
		char chararrya1[]= {'时','间','就','是','金','钱','，','我','的','朋','友'};
		String b=new String(chararrya1,2,7);//2是起始索引位置（包括），复制7个，包括符号
		System.out.println(b);

	}
}
