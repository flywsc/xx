package com.wsc20180727;

import java.util.Scanner;

public class test_people {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		people pe=new people();
        Scanner input=new Scanner(System.in);
        System.out.print("��������������");
       
        pe.name=input.next();
        System.out.print("��������������");
        pe.key=input.next();
        pe.show();
        while(true) {
        	System.out.println("������Ҫ�޸�����");
        	System.out.print("����������������");
        	pe.newkey=input.next();
        	System.out.print("���ٴ���������������");
        	pe.newkey1=input.next();
        	if((pe.newkey).equals(pe.newkey1)) {
        		pe.key=pe.newkey1;
        		pe.show1();
        		System.out.println("�޸ĳɹ�");
        		break;
        	}else {
        		System.out.println("����������������������");
        	}
        	 
        }
	}

}
