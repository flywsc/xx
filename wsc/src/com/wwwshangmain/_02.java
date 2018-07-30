package com.wwwshangmain;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args){
   
		 Scanner input = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in);
		 System.out.print("请输入年份：");
		 int year = sc.nextInt();
		 System.out.print("请输入月份：");
		 int month = sc.nextInt();
		 System.out.print("请输入日：");
		 int day = sc.nextInt();
		 int count = 0;
		 int days = 0;
		 if (year > 0 && month > 0 && month < 13 && day > 0 && day < 32) {
		 for (int i = 1; i < month; i++) {
		 switch (i) {
		 case 1:case 3: case 5: case 7: case 8: case 10: case 12:
	     days = 31;
		 break;
		 case 4: case 6:case 9:case 11: 
		 days = 30;
		 break;
		 case 2: {
		 if ((year % 4 == 0 && year % 1 != 0) || (year % 400 == 0)) {
		 //能被4整除而不能被100整除或能被400整除的是闰年
	     //其他是平年
	     days = 29;
		 } else {
		 days = 28;
		        }
		 break;
		 }
		 }
		 count = count + days;//循环相加
		 }
		 count = count + day;//最后加上天数
		 System.out.println(year + "年" + month + "月" + day + "日是" + year + "年的第" + count + "天");
		 } else {
		   System.out.println("数据输入错误！");
		 }
	}							
	}