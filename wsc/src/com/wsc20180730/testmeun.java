package com.wsc20180730;

import java.util.Scanner;

public class testmeun {
	private static boolean ture;

	public static void main(String[] args) {
		/**menu me = new menu();
		me.menu1();
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ��");
		int chioce=input.nextInt();
		while (true) {
			switch (chioce) {
			case 0:
				me.menu1();
				System.out.println("��ѡ��");
				int chioce3 = input.nextInt();
				
				if(chioce3==1) {
					break;
				}else {
				me.ch1();	
				}
				
			case 1://ѡ���¼�����Դ�ӡ�ڶ����¼�˵�
				me.menu2();//��ӡ�ڶ���˵�
				System.out.print("��ѡ��");
				int chioce1 = input.nextInt();
				if(chioce1==0) {
				me.ch0();
				break;
				
				}else if(chioce1==1){
				System.out.println("�Բ�����û��Ȩ�޷��ʣ��Զ������������");
                me.menu3();
                System.out.print("��ѡ��");
				int chioce2 = input.nextInt();
				if(chioce2==0) {
					me.ch1();
					break;
				}else {
					System.out.println("��ѡ��");
					int chioce4 = input.nextInt();
					if(chioce4==1) {
						System.out.println("��ѡ�������˴����");
					}else if(chioce4==2) {
						System.out.println("��ѡ�������˳齱");
					}else {
						System.out.println("�����������");
						me.ch0();
					}
				}
				}
                
			case 2:
				System.out.println("��лʹ��");
				break;
			}
			break;
		}*/
		menu me = new menu();
		me.menu1();
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ��");
		int chioce=input.nextInt();
        
		while(true) {
		 switch(chioce)	{ 
         case 0:
				 me.menu1();
				 System.out.print("��ѡ��");
				 int chioce0=input.nextInt();
				 switch(chioce0) {
				 case 1:
					 System.out.println("��ѡ���˵�¼ϵͳ");
				     me.menu2();
				     break;
				 case 2: 
					 System.out.println("ллʹ��");
					 break;
				 }
			 case 1:
					 me.menu2();
					 System.out.print("��ѡ��");
					 int chioce1=input.nextInt();
					 switch(chioce1) {
					 case 1:
						 System.out.println("��ѡ���˿ͻ�����ϵͳ");
						 System.out.println("�Բ������Ȩ�޲���ʹ��,���Զ������������");
						 me.menu3();
						 System.out.print("��ѡ��");
						 int chioce2=input.nextInt();
				         if(chioce2==1) {
				        	 System.out.println("��ѡ�������˴����");
				        	 break;
				         }else if(chioce2==2){
				        	 System.out.println("��ѡ�������˳齱");
				        	 break;
				         }else if(chioce==0){
				        	 me.ch0();
				        	 break;
				         }
					     break;
					 case 2: 
						 System.out.println("��ѡ�����������");
						 me.menu3();
						 System.out.print("��ѡ��");
						 int chioce3=input.nextInt();
				         if(chioce3==1) {
				        	 System.out.println("��ѡ�������˴����");
				        	 break;
				         }else if(chioce3==2){
				        	 System.out.println("��ѡ�������˳齱");
				        	 break;
				         }else if(chioce==0){
				        	 me.ch1();
				        	 break;
				         }
				         break;
					 case 0:
						 me.ch0();
					     break;
					 }
					 break;
			 case 2:
				System.out.println("ллʹ��");
				 break;
				 
		 }
		 
     }
	}
}
