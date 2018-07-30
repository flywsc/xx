package com.wsc201818;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       
       int i=1;
       do {
    	   System.out.println("请输入一个整数，输入0结束");
    	   if(input.hasNextInt()) {
    		   i=input.nextInt();
    		   System.out.print("您输入的数字是"+i+"\n");
    	   }else {
    		   System.out.println("输入数据不正确");
    		   input=new Scanner(System.in);
    	   }
       }while(i!=0);
       System.out.println("输入结束");
	}

}
