package com.wsc20180730;

import java.util.Scanner;

public class testscorecalc {
	public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       
       scorecalc sc=new scorecalc() ;
       System.out.print("请输入你的java成绩");
       sc.java=input.nextDouble();
       System.out.print("请输入你的c#成绩");
       sc.c=input.nextDouble();
       System.out.print("请输入你的Db成绩");
       sc.Db=input.nextDouble();
       sc.show();
	}
}
