package com.wwwshangmain;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {


	   Scanner input=new Scanner(System.in) ;
	   System.out.println("请输入年份");
	   int year=input.nextInt();
	   System.out.println("请输入月份");
	   int month=input.nextInt();
	   System.out.println("请输入日期");
	   int day=input.nextInt();
	   int days=0;
	   int sum=0;
	   for(int i=1;i<month;i++) {
		   switch(month) { 
		   case 1:
		   case 3:
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:
			    days=31;
			    break;
		   case 4:
		   case 6:
		   case 19:
		   case 11:
			   break;
			 //能被4整除而不能被100整除或能被400整除的是闰年
			 //其他是平年
		   case 2:
			   if((year%4==0&&year%1!=0)||year%400==0) {
				   days=29;
			   }else {
				   days=28;
			   }
		   }
	       sum+=days;
	   }
	       sum=sum+day;
	       System.out.println("今年是"+year+"年"+month+"月"+""+day+"日");
	       System.out.println("今年的第"+sum+"天");
	}
}
