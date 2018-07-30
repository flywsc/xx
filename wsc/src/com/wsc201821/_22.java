package com.wsc201821;

public class _22 {
	public static void main(String[] args) {
        //字符串去除空白
		
        String st1="  a       b  c de      f ";
        String st2=st1.trim();
        //这个是只去除首尾空白
        String st3=st1.replaceAll("\\s", "");
        //这个是去除所有空白
        // \\s是正则表达式代表空白内容，后面是空字符串
        System.out.println(st2);
        System.out.println(st3);
	}
}
