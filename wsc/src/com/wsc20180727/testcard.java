package com.wsc20180727;

import java.util.Scanner;

public class testcard {
	public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
	 card ca=new card();
	 System.out.println("请输入你的卡类型");
	 ca.card=input.next();
	 System.out.println("你的积分是多少");
	 ca.jifen=input.nextInt();
	 
	 if("金卡".equals(ca.card)&& ca.jifen>1000) {
		 
	 }else	  if( ca.jifen>500) {
		 System.out.println("回馈积分500！");
	 }else {
		 System.out.println("对不起，您不满足条件，感谢使用");
		
	 }
	}
}
