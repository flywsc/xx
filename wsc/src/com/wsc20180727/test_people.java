package com.wsc20180727;

import java.util.Scanner;

public class test_people {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		people pe=new people();
        Scanner input=new Scanner(System.in);
        System.out.print("请输入您的姓名");
       
        pe.name=input.next();
        System.out.print("请输入您的密码");
        pe.key=input.next();
        pe.show();
        while(true) {
        	System.out.println("您即将要修改密码");
        	System.out.print("请输入您的新密码");
        	pe.newkey=input.next();
        	System.out.print("请再次输入您的新密码");
        	pe.newkey1=input.next();
        	if((pe.newkey).equals(pe.newkey1)) {
        		pe.key=pe.newkey1;
        		pe.show1();
        		System.out.println("修改成功");
        		break;
        	}else {
        		System.out.println("您的输入有误，请重新输入");
        	}
        	 
        }
	}

}
