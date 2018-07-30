package com.wwwshangmain;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //假设一个人去买衣服
		//总共有五家店铺
		//每家进去最多只能买三件
		//可以选择去每一家
		//最后统计在哪家买了几件衣服，一共买了几件衣服
		
		int count=0;
		Scanner input=new Scanner(System.in);		
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println("欢迎光临第"+(i+1)+"家店");
			b:for(int j=0;j<3;j++) {				
				System.out.println("请选择您要离开还是要看看  y or n");				
				a:for(int i1=0;;i1++) {
					String chocie=input.nextLine();	
					if("y".equals(chocie)||"n".equals(chocie)) {
	 				        if("y".equals(chocie)) {
							System.out.println("欢迎下次光临");
							break b;
						    }else {		   
						    count+=1;
						    System.out.println("您买了1件衣服");
						    break a;
						}
						}else {
							System.out.println("您的输入有误，请重新输入");
						}
				}
			
//				if("y".equals(chocie)) {
//					System.out.println("欢迎下次光临");
//					break;
//				}		   
//			    count+=1;
//			    System.out.println("您买了1件衣服");
//			    
//				
//			}
		}
	     System.out.println("您一共买了"+count+"件衣服");      
		System.out.println("请慢走，欢迎下次光临");
	}

	}
	}
