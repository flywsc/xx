package com.wsc201821;

public class _17 {
	public static void main(String[] args) {

      String a=new String ("abc1");
      String b=new String ("ABC1");
      boolean c=a.equals(b);//第一个是分大小写
      boolean d=a.equalsIgnoreCase(b);//第二个是不分大小写
      System.out.println(c);
      System.out.println(d);
      
      //特殊情况
      String a1="ABC1";
      String b1="ABC1";
      System.out.println(a1==b1);//这样用字符串常量来比的话就是相等的
	}
}
