package com.wsc201820;

import java.util.Random;

public class _01 {
	public static void main(String[] args) {
		String[] Books_1 = { "Html Css Js ǰ��", "Java ���Ի����߼�", "���ݿ�߼����֪ʶ", "Java �������", "Jsp & Servlet", "Java ��ҵ�����",
				"" };
		int[] Hours_1 = { 48, 60, 32, 75, 70, 120, 0 };

		String[] Books_2 = { "jQuery ǰ�˸߼����", "Ajax �߼�����ģʽ", "΢�Ź��ںš�С���򿪷�", "vue.js ǰ�����п��" };
		int[] Hours_2 = { 20, 32, 16, 10 };
		// ���ϴ� _1 �������ǿγ����Ƽ���Ӧѧʱ
		// _2 ��������ѡ�޿����Ƽ���Ӧѧʱ
		// Ҫ��ѧԱ���Ը������������ѡ�޿�������ɸѡһ�ſγ̽���ѧϰ��
		// ��ѡ���Ŀγ�Ҫ���뵽_1 ��������ȥ����ӦѧʱҲҪ�����ѧʱ���飬
		// ����γ�����Ŀγ������ǰ���С�����ź���ģ�ѡ�޿γ� ��嵽��ȷλ�ã�
		// ���ͳ�Ƴ�ѡ�޿β�������ѧʱ
		Random rd = new Random();
		int suiji = rd.nextInt(4);
		String Books_22 = Books_2[suiji];
		int Hours_22 = Hours_2[suiji];
		int index = Books_1.length - 1;
		int sum = 0;
		System.out.println("ѡ�Ŀγ�Ϊ:" + Books_22 + "      ��Ӧ��ʱΪ" + Hours_22);
		for (int i = 0; i < Books_1.length; i++) {
			if (Books_1[i].compareTo(Books_22) > 0) {
				index = i;
				break;
			}
		}
		if (index == Books_1.length) {
			Books_1[index] = Books_22;
			Hours_1[index] = Hours_22;
		} else {
			for (int i = Books_1.length - 2; i >= index; i--) {
				Books_1[i + 1] = Books_1[i];
				Hours_2[i + 1] = Hours_2[i];
			}
				Books_1[index] = Books_22;
				Hours_2[index] = Hours_22;
			
		}
		for (int i = 0; i < Hours_1.length; i++) {
			sum += Hours_1[i];
		}
		sum = sum + Hours_2[suiji];
		
        for(int i=1;i<Books_1.length;i++) {
        	System.out.println(Books_1[i]);
        }
		System.out.println("�ܿ�ʱΪ" + sum);
	}
}