package com.wwwshangmain;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {


	   Scanner input=new Scanner(System.in) ;
	   System.out.println("���������");
	   int year=input.nextInt();
	   System.out.println("�������·�");
	   int month=input.nextInt();
	   System.out.println("����������");
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
			 //�ܱ�4���������ܱ�100�������ܱ�400������������
			 //������ƽ��
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
	       System.out.println("������"+year+"��"+month+"��"+""+day+"��");
	       System.out.println("����ĵ�"+sum+"��");
	}
}
