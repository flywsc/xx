package com.wsc20180731;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 menu me=new menu();
	        Scanner input=new Scanner(System.in);
	        
	        
	        int level=0;
	        int choice=-1;
	        
	        while(true){
	        	switch(level){
		        	case 0:
		        		me.menu0();
		        		
		        		
		        		me.tips();
		        		choice=input.nextInt();
		        		
		        		switch(choice){
			        		case 1:
			        			me.show();
			        			if(me.judge) {
			        			level=1;
			        			choice=-1;
			        			}else {
			        				level=0;
				        			choice=-1;
			        			}
			        			continue;
			        		case 2:
			        			System.out.println("�˳�ϵͳ����ӭ�´ι���.");
			        			break;//�����ڲ�switch
			        		default:
			        			System.out.println("����������.");
			        			continue;
		        		}
		        		
		        		
		        		break;//�������switch
		        	case 1:
		        		me.menu1();
		        		
		        		//��ʾ�û�ѡ��˵���
		        		me.tips();
	                    choice=input.nextInt();
		        		
		        		switch(choice){
		        		    case 0:
		        		    	level=0;
			        			choice=-1;
			        			continue;
			        		case 1:
			        			level=1;
			        			choice=-1;
			        			System.out.println("�Բ�����û��Ȩ�޷���");
			        			continue;
			        		case 2:
			        			level=2;
			        			choice=-1;
			        			continue;//�����ڲ�switch
			        		default:
			        			System.out.println("�������.");
			        			level=1;
			        			choice=-1;
			        			continue;
		        		}
		        		
		        	case 2:
		        		me.menu2();
		        		
		        		//��ʾ�û�ѡ��˵��� 
		        		me.tips();
	                    choice=input.nextInt();
		        		
		        		switch(choice){
		        		    case 0:
		        		    	level=1;
			        			choice=-1;
			        			continue;
			        		case 1:
			        			
			        			System.out.println("��ѡ�������˴����");
			        			continue;
			        		case 2:
			        			System.out.println("��ѡ�������˳齱");
			        			continue;//�����ڲ�switch
			        		default:
			        			System.out.println("�������.");
			        			
			        			choice=-1;
			        			continue;
		        		}
		        	    
	        	}
	        	
	        	break;//������ѭ�� 
	        }
	        
	        
	        System.out.println("�������");
	}

}
