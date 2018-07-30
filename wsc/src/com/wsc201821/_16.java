package com.wsc201821;

public class _16 {
	public static void main(String[] args) {
      //判断之字符串是否存在
		String in="8888888888888888888B8888888888888888888888";
	    boolean in1=in.contains("B");//判断是否存在
	    boolean in2=in.contains("D");
	    
	    System.out.println(in1);
	    System.out.println(in2);
	    //接下来找一下在第几位
	    int out=in.indexOf("B");
	    System.out.println("该数字在第"+(out+1)+"位");
	}
}
