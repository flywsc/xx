package com.wwwshangmain;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����һ����ȥ���·�
		//�ܹ�����ҵ���
		//ÿ�ҽ�ȥ���ֻ��������
		//����ѡ��ȥÿһ��
		//���ͳ�����ļ����˼����·���һ�����˼����·�
		
		int count=0;
		Scanner input=new Scanner(System.in);		
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println("��ӭ���ٵ�"+(i+1)+"�ҵ�");
			b:for(int j=0;j<3;j++) {				
				System.out.println("��ѡ����Ҫ�뿪����Ҫ����  y or n");				
				a:for(int i1=0;;i1++) {
					String chocie=input.nextLine();	
					if("y".equals(chocie)||"n".equals(chocie)) {
	 				        if("y".equals(chocie)) {
							System.out.println("��ӭ�´ι���");
							break b;
						    }else {		   
						    count+=1;
						    System.out.println("������1���·�");
						    break a;
						}
						}else {
							System.out.println("����������������������");
						}
				}
			
//				if("y".equals(chocie)) {
//					System.out.println("��ӭ�´ι���");
//					break;
//				}		   
//			    count+=1;
//			    System.out.println("������1���·�");
//			    
//				
//			}
		}
	     System.out.println("��һ������"+count+"���·�");      
		System.out.println("�����ߣ���ӭ�´ι���");
	}

	}
	}
