package com.wwwshangmain;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args){
   
		 Scanner input = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in);
		 System.out.print("��������ݣ�");
		 int year = sc.nextInt();
		 System.out.print("�������·ݣ�");
		 int month = sc.nextInt();
		 System.out.print("�������գ�");
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
		 //�ܱ�4���������ܱ�100�������ܱ�400������������
	     //������ƽ��
	     days = 29;
		 } else {
		 days = 28;
		        }
		 break;
		 }
		 }
		 count = count + days;//ѭ�����
		 }
		 count = count + day;//����������
		 System.out.println(year + "��" + month + "��" + day + "����" + year + "��ĵ�" + count + "��");
		 } else {
		   System.out.println("�����������");
		 }
	}							
	}