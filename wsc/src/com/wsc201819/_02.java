package com.wsc201819;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ɾ���������һ����
		System.out.println("������Ҫɾ���Ĳ�");
		Scanner input = new Scanner(System.in);
		String shuru = input.next();
		String[] menu = { "�ײ�", "���", "����", "С��", "����", "��֭" };
		
		int index = -1;// ����һ��ָ��
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(shuru)) {//
				index = i;
				break;
			}
		}
		if (index != -1) {
			for (int j = index; j < menu.length - 1; j++) {
				menu[j] = menu[j + 1];
			   
			}
			 menu[menu.length - 1] = null;
		}
		for (int j = 0; j < menu.length ; j++) {//
			System.out.println(menu[j]);
		}
	}
}
