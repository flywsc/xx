package com.wsc20180731;

import java.util.Scanner;

public class menu {
	public boolean judge;

	public void show() {
		String[][]people= {{"����","123"},{"����","456"},{"����","789"}};
		boolean judge = false;
		Scanner input=new Scanner(System.in);
		if (!judge) {
		    System.out.print("�����û���");
		    String user=input.next();
		    System.out.print("��������");
		    String key=input.next();
			for (int i = 0; i < people.length; i++) {
             if(user.equals(people[i][0])&&key.equals(people[i][1])) {
            	 judge=true;
            	 System.out.println("��֤�û���������ȷ��  ��¼�ɹ���");
            	 break;
             } 
			} 
		if(!judge) {
			System.out.println("�û��������벻��ȷ");
		}
		
		}
	}
	
	public void menu0(){
		   System.out.println("\t��ӭʹ���������ع������ϵͳ");
		   System.out.println("\t\t1. ��¼ϵͳ");
		   System.out.println("\t\t2. �˳�");
		   System.out.println("\t....................");
	   }
	   
	   public void menu1(){
		   System.out.println("\t��ӭʹ���������ع������ϵͳ���˵�");
		   System.out.println("\t....................");
		   System.out.println("\t\t1. �ͻ���Ϣ����");
		   System.out.println("\t\t2. �������");
		   System.out.println("\t....................");
	   }
	   
	   public void menu2(){
		   System.out.println("\t��ӭʹ���������ع������ϵͳ > �������");
		   System.out.println("\t....................");
		   System.out.println("\t\t1. ���˴����");
		   System.out.println("\t\t2. ���˳齱");
		   System.out.println("\t....................");
	   }
	   
	   public void tips(){
		   System.out.println("��ѡ��");
	   }
	   
}
