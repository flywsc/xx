package com.www20180725;

import java.util.Random;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[][] demo = new int[10][10];
		for (int i = 0; i < demo.length; i++) {
			for (int j = 0; j < demo[i].length; j++) {
				demo[i][j] = rd.nextInt(100);
				System.out.print(demo[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("��������Ҫ���ҵ�ֵ");
		boolean falg = false;//��¼�Ƿ����
	    String []regain=new String[100];
		int count=0;//����һ��������
		int find = sc.nextInt();//Ҫ�ҵ�����
		for (int i = 0; i < demo.length; i++) {//�ȱ����������ֵ
			for (int j = 0; j < demo[i].length; j++) {
				if (find == demo[i][j]) {										
					regain[count++]="("+(i+1)+", "+(j+1)+")";//��һ�������λ�ø�һ���ַ���
				}
			}
		}
			if(count>0) {//�������������0��֤���з��ϵ�
			for(int j=0;j<count;j++) {
				System.out.println(regain[j]);
			}
		}else {
			System.out.println("û���ҵ������������");
		
		}
		
	}
	}	
