package com.www20180725;

import java.util.Random;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[][] demo = new int[10][10];
		for (int i = 0; i < demo.length; i++) {
			for (int j = 0; j < demo[i].length; j++) {
				demo[i][j] = rd.nextInt(100);
				System.out.print(demo[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("请输入你要查找的值");
		boolean falg = false;//记录是否存在
	    String []regain=new String[100];
		int count=0;//定义一个计数器
		int find = sc.nextInt();//要找的数字
		for (int i = 0; i < demo.length; i++) {//先遍历输出，赋值
			for (int j = 0; j < demo[i].length; j++) {
				if (find == demo[i][j]) {										
					regain[count++]="("+(i+1)+", "+(j+1)+")";//把一个坐标的位置给一个字符串
				}
			}
		}
			if(count>0) {//如果计数器大于0就证明有符合的
			for(int j=0;j<count;j++) {
				System.out.println(regain[j]);
			}
		}else {
			System.out.println("没有找到你输入的数组");
		
		}
		
	}
	}	
