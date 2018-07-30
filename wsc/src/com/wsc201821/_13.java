package com.wsc201821;

public class _13 {
	public static void main(String[] args) {

		String a = "we are the world";
		int b = a.indexOf("e");// 从第一个依次往后找
		int c = a.indexOf("e", 2);// a是要获取的字符串,记得字符要有双引号
		System.out.println(c);
		System.out.println("出现的字符在索引为" + b + "的位置");

		// 以下的是从后面依次往前找
		String d = "letitgo!letitgo!letitgo!";
		int e = d.indexOf("t");
		System.out.println("第一次出现的索引位置是" + e);// 从第一个往后找
		int f = d.indexOf("g", 2);// 从第二个开始往后找,
		System.out.println("从第二个开始往后找，第一次出现的索引位置是" + f);

	}
}
