package com.wsc20180727;

import java.util.Scanner;

public class testcard {
	public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
	 card ca=new card();
	 System.out.println("��������Ŀ�����");
	 ca.card=input.next();
	 System.out.println("��Ļ����Ƕ���");
	 ca.jifen=input.nextInt();
	 
	 if("��".equals(ca.card)&& ca.jifen>1000) {
		 
	 }else	  if( ca.jifen>500) {
		 System.out.println("��������500��");
	 }else {
		 System.out.println("�Բ�������������������лʹ��");
		
	 }
	}
}
