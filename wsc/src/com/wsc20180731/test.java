package com.wsc20180731;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 menu me=new menu();
	        Scanner input=new Scanner(System.in);
	        
	        
	        int level=0;
	        int choice=-1;
	        
	        while(true){
	        	switch(level){
		        	case 0:
		        		me.menu0();
		        		
		        		
		        		me.tips();
		        		choice=input.nextInt();
		        		
		        		switch(choice){
			        		case 1:
			        			me.show();
			        			if(me.judge) {
			        			level=1;
			        			choice=-1;
			        			}else {
			        				level=0;
				        			choice=-1;
			        			}
			        			continue;
			        		case 2:
			        			System.out.println("退出系统，欢迎下次光临.");
			        			break;//跳出内层switch
			        		default:
			        			System.out.println("你的输入出错.");
			        			continue;
		        		}
		        		
		        		
		        		break;//跳出外层switch
		        	case 1:
		        		me.menu1();
		        		
		        		//提示用户选择菜单项
		        		me.tips();
	                    choice=input.nextInt();
		        		
		        		switch(choice){
		        		    case 0:
		        		    	level=0;
			        			choice=-1;
			        			continue;
			        		case 1:
			        			level=1;
			        			choice=-1;
			        			System.out.println("对不起，您没有权限访问");
			        			continue;
			        		case 2:
			        			level=2;
			        			choice=-1;
			        			continue;//跳出内层switch
			        		default:
			        			System.out.println("输入出错.");
			        			level=1;
			        			choice=-1;
			        			continue;
		        		}
		        		
		        	case 2:
		        		me.menu2();
		        		
		        		//提示用户选择菜单项 
		        		me.tips();
	                    choice=input.nextInt();
		        		
		        		switch(choice){
		        		    case 0:
		        		    	level=1;
			        			choice=-1;
			        			continue;
			        		case 1:
			        			
			        			System.out.println("您选择了幸运大放送");
			        			continue;
			        		case 2:
			        			System.out.println("您选择了幸运抽奖");
			        			continue;//跳出内层switch
			        		default:
			        			System.out.println("输入出错.");
			        			
			        			choice=-1;
			        			continue;
		        		}
		        	    
	        	}
	        	
	        	break;//跳出死循环 
	        }
	        
	        
	        System.out.println("购物结束");
	}

}
