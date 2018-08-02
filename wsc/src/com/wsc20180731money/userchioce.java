package com.wsc20180731money;

import java.util.Scanner;

public class userchioce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm ATM=new atm();
		Scanner input=new Scanner(System.in);
		System.out.println("***********************");
        System.out.println("****欢迎进入自动取款系统****");
        ATM.sum=10000;             
        chioce(ATM, input);
        
	}

	public static void chioce(atm ATM, Scanner input) {
		while(true) {
        	 System.out.print("请输入你要选择的操作  1.查询     2.存钱     3.取钱     4.退卡");
            int choice=input.nextInt();
        	switch(choice) {
        	case 1:
        	ATM.atm_check();
        	System.out.println("返回上一层请输入y");       	
        	if("y".equals(input.next())) {
        		break;
        	}else {
        		System.out.println("你的选择有误，自动为你退卡");
        	}
        	continue;
        	case 2:
        		System.out.println("请输入你要存的金额");
        		int sum_in=input.nextInt();
        		ATM.sum+=sum_in;
        		ATM.sum();
        		System.out.println("返回上一层请输入y");
            	if("y".equals(input.next())) {           		
            		break;         		
            	}else {
            		System.out.println("你的选择有误，自动为你退卡");
            	}
            	continue;
        	case 3:
        		System.out.println("请选择你要取多少钱");
        		int sum_out=input.nextInt();
        		ATM.sum=ATM.sum-sum_out;
        		ATM.sum();
        		System.out.println("返回上一层请输入y");
            	if("y".equals(input.next())) {
            		break;
            	}else {
            		System.out.println("你的选择有误，自动为你退卡");
            	}
            	continue;
        	case 4:        		
        		System.out.println("你选择了退卡");
        		return;
        
        	}
       
       }
	}

}
