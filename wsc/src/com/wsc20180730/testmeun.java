package com.wsc20180730;

import java.util.Scanner;

public class testmeun {
	private static boolean ture;

	public static void main(String[] args) {
		/**menu me = new menu();
		me.menu1();
		Scanner input = new Scanner(System.in);
		System.out.print("请选择");
		int chioce=input.nextInt();
		while (true) {
			switch (chioce) {
			case 0:
				me.menu1();
				System.out.println("请选择");
				int chioce3 = input.nextInt();
				
				if(chioce3==1) {
					break;
				}else {
				me.ch1();	
				}
				
			case 1://选择登录，所以打印第二层登录菜单
				me.menu2();//打印第二层菜单
				System.out.print("请选择");
				int chioce1 = input.nextInt();
				if(chioce1==0) {
				me.ch0();
				break;
				
				}else if(chioce1==1){
				System.out.println("对不起您没有权限访问，自动进入真情回馈");
                me.menu3();
                System.out.print("请选择");
				int chioce2 = input.nextInt();
				if(chioce2==0) {
					me.ch1();
					break;
				}else {
					System.out.println("请选择");
					int chioce4 = input.nextInt();
					if(chioce4==1) {
						System.out.println("您选择了幸运大放送");
					}else if(chioce4==2) {
						System.out.println("您选择了幸运抽奖");
					}else {
						System.out.println("你的输入有误");
						me.ch0();
					}
				}
				}
                
			case 2:
				System.out.println("感谢使用");
				break;
			}
			break;
		}*/
		menu me = new menu();
		me.menu1();
		Scanner input = new Scanner(System.in);
		System.out.print("请选择");
		int chioce=input.nextInt();
        
		while(true) {
		 switch(chioce)	{ 
         case 0:
				 me.menu1();
				 System.out.print("请选择");
				 int chioce0=input.nextInt();
				 switch(chioce0) {
				 case 1:
					 System.out.println("你选择了登录系统");
				     me.menu2();
				     break;
				 case 2: 
					 System.out.println("谢谢使用");
					 break;
				 }
			 case 1:
					 me.menu2();
					 System.out.print("请选择");
					 int chioce1=input.nextInt();
					 switch(chioce1) {
					 case 1:
						 System.out.println("你选择了客户管理系统");
						 System.out.println("对不起，你的权限不能使用,将自动进入真情回馈");
						 me.menu3();
						 System.out.print("请选择");
						 int chioce2=input.nextInt();
				         if(chioce2==1) {
				        	 System.out.println("您选择了幸运大放送");
				        	 break;
				         }else if(chioce2==2){
				        	 System.out.println("您选择了幸运抽奖");
				        	 break;
				         }else if(chioce==0){
				        	 me.ch0();
				        	 break;
				         }
					     break;
					 case 2: 
						 System.out.println("您选择了真情回馈");
						 me.menu3();
						 System.out.print("请选择");
						 int chioce3=input.nextInt();
				         if(chioce3==1) {
				        	 System.out.println("您选择了幸运大放送");
				        	 break;
				         }else if(chioce3==2){
				        	 System.out.println("您选择了幸运抽奖");
				        	 break;
				         }else if(chioce==0){
				        	 me.ch1();
				        	 break;
				         }
				         break;
					 case 0:
						 me.ch0();
					     break;
					 }
					 break;
			 case 2:
				System.out.println("谢谢使用");
				 break;
				 
		 }
		 
     }
	}
}
