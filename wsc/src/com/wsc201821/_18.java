package com.wsc201821;

public class _18 {
	public static void main(String[] args) {

       String str="520202199609084215";
       String cut=str.substring(6,10);
       //6代表截取开始位置（包括）
       //10代表结束位置（不包括）
       System.out.println("您出生为"+cut+"年");
	}
}
