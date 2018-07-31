package com.wsc20180731;

import java.util.Scanner;

public class menu {
	public boolean judge;

	public void show() {
		String[][]people= {{"张三","123"},{"李四","456"},{"王五","789"}};
		boolean judge = false;
		Scanner input=new Scanner(System.in);
		if (!judge) {
		    System.out.print("输入用户名");
		    String user=input.next();
		    System.out.print("输入密码");
		    String key=input.next();
			for (int i = 0; i < people.length; i++) {
             if(user.equals(people[i][0])&&key.equals(people[i][1])) {
            	 judge=true;
            	 System.out.println("验证用户，密码正确。  登录成功！");
            	 break;
             } 
			} 
		if(!judge) {
			System.out.println("用户名或密码不正确");
		}
		
		}
	}
	
	public void menu0(){
		   System.out.println("\t欢迎使用我行我素购物管理系统");
		   System.out.println("\t\t1. 登录系统");
		   System.out.println("\t\t2. 退出");
		   System.out.println("\t....................");
	   }
	   
	   public void menu1(){
		   System.out.println("\t欢迎使用我行我素购物管理系统主菜单");
		   System.out.println("\t....................");
		   System.out.println("\t\t1. 客户信息管理");
		   System.out.println("\t\t2. 真情回馈");
		   System.out.println("\t....................");
	   }
	   
	   public void menu2(){
		   System.out.println("\t欢迎使用我行我素购物管理系统 > 真情回馈");
		   System.out.println("\t....................");
		   System.out.println("\t\t1. 幸运大放送");
		   System.out.println("\t\t2. 幸运抽奖");
		   System.out.println("\t....................");
	   }
	   
	   public void tips(){
		   System.out.println("请选择：");
	   }
	   
}
