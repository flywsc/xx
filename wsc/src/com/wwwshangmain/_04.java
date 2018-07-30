package com.wwwshangmain;

import java.util.Random;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
         
		int demo[]= {1,2,3,4,5,6,7,8,0};
		Random rd=new Random();
		
		int produce=rd.nextInt(10);
        System.out.println("产生的随机数字为"+produce+"");
        int index=0;
		for(int i=0;i<demo.length;i++) {
			if(produce==demo[i]) {
				index=i;
				break;
			}
		}
		if(index<=demo.length) {
			for(int i=demo.length-2;i>index;i--) {
				demo[i+1]=demo[i];				
			}		
		}else {
			demo[demo.length-1]=produce;
		}
		demo[index]=produce;
		for(int i=0;i<demo.length;i++) {
			System.out.println(demo[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
        //从数组中插入一个字符
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您要插入的数字");
		Random rd=new Random();
		int _input=input.nextInt();
		int _rd=rd.nextInt();
		int count=0;
		int demo[]= {1,5,6,8,4,2,3,5};
		for(int i=0;i<demo.length;i++) {
		           if(_rd==demo[i]) {//产生个随机数，判断与字符是否相等
		        	   count=i;//找到这个指针的的位置，也就是要插入的位置
		        	   break;//找到就直接推出
		           }
		
			if(i<demo.length-1 ) {//如果指针还在长度以内
				demo[i]=demo[i+1];//整体后移一位
			}else {
				_rd=demo[demo.length-1];//否则这个随机数就等于最后一个
			}
		
		for(int k=0;k<demo.length;k++) {
			System.out.print(demo[k]);
		}
		}
	  */
	    	
	    }
	}

