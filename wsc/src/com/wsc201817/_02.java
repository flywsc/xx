package com.wsc201817;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		//我们要给学员讲解switch 的应用语法
		//此处我们结合一个实际场 景来讲解---一个商场管理系统的主菜单
		//1 在屏幕上印制菜单
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.println("*************************");
		System.out.println("*\t1 炒饭");
		System.out.println("*\t2 盖饭");
		System.out.println("*\t3 牛肉粉");
		System.out.println("*\t4 面条");
		System.out.println("*\t5 退         出");
		System.out.println("*************************");
		System.out.println("请选择(1-5)：");
        int choice=input.nextInt();
        switch(choice){
           case 1:
        	   System.out.println("炒饭");
        	   continue;
           case 2:
        	   System.out.println("盖饭");
        	   continue;
           case 3:
        	   System.out.println("牛肉粉");
        	   continue;
           case 4:
        	   System.out.println("面条");
        	   continue;
           case 5:
        	   System.out.println("您点选了\"退         出\"");
        	   break;
           default:
        	   System.out.println("选择出错");
        	   continue;
        }
       break;      
	} System.out.println("欢迎下次光临");

}
}
