package com.wwwshangmain;

import java.util.Random;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
         
		int demo[]= {1,2,3,4,5,6,7,8,0};
		Random rd=new Random();
		
		int produce=rd.nextInt(10);
        System.out.println("�������������Ϊ"+produce+"");
        int index=0;
		for(int i=0;i<demo.length;i++) {
			if(produce==demo[i]) {
				index=i;
				break;
			}
		}
		if(index<=demo.length) {
			for(int i=demo.length-2;i>index;i--) {
				demo[i+1]=demo[i];				
			}		
		}else {
			demo[demo.length-1]=produce;
		}
		demo[index]=produce;
		for(int i=0;i<demo.length;i++) {
			System.out.println(demo[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
        //�������в���һ���ַ�
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ���������");
		Random rd=new Random();
		int _input=input.nextInt();
		int _rd=rd.nextInt();
		int count=0;
		int demo[]= {1,5,6,8,4,2,3,5};
		for(int i=0;i<demo.length;i++) {
		           if(_rd==demo[i]) {//��������������ж����ַ��Ƿ����
		        	   count=i;//�ҵ����ָ��ĵ�λ�ã�Ҳ����Ҫ�����λ��
		        	   break;//�ҵ���ֱ���Ƴ�
		           }
		
			if(i<demo.length-1 ) {//���ָ�뻹�ڳ�������
				demo[i]=demo[i+1];//�������һλ
			}else {
				_rd=demo[demo.length-1];//�������������͵������һ��
			}
		
		for(int k=0;k<demo.length;k++) {
			System.out.print(demo[k]);
		}
		}
	  */
	    	
	    }
	}

