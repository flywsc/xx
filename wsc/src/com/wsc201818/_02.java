package com.wsc201818;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       
       int i=1;
       do {
    	   System.out.println("������һ������������0����");
    	   if(input.hasNextInt()) {
    		   i=input.nextInt();
    		   System.out.print("�������������"+i+"\n");
    	   }else {
    		   System.out.println("�������ݲ���ȷ");
    		   input=new Scanner(System.in);
    	   }
       }while(i!=0);
       System.out.println("�������");
	}

}
