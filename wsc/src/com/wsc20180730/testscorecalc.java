package com.wsc20180730;

import java.util.Scanner;

public class testscorecalc {
	public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       
       scorecalc sc=new scorecalc() ;
       System.out.print("���������java�ɼ�");
       sc.java=input.nextDouble();
       System.out.print("���������c#�ɼ�");
       sc.c=input.nextDouble();
       System.out.print("���������Db�ɼ�");
       sc.Db=input.nextDouble();
       sc.show();
	}
}
