package com.wsc201821;

public class _19 {
	public static void main(String[] args) {

         String st="馒头一文一个";
         String st1=st.replace("一", "壹");
         //替换字符串，返回为字符串型
         //一是要替换的内容
         //壹是新的字符串
         System.out.println(st1);
         
         
         String st2="123456abc";
         String st3=st2.replaceAll("\\d", "???");
         //可以替换元字符
         System.out.println(st3);
         
         
         String st4="jAva";
         String st5=st4.replaceFirst("A", "O");
         System.out.println(st5);
         //只替换一次
	}
}
