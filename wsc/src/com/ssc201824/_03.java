package com.ssc201824;

import java.util.Random;
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("     1.ע��          ");
		System.out.println("     2.��¼          ");
		System.out.println("     3.�齱         ");
		System.out.println("************************");
		System.out.println();
		System.out.print("��ѡ��˵�");
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(9000) + 1000;
		// ���ɴ�0-ָ������������ָ������������
		int choice = input.nextInt();
		a: switch (choice) {
		case 1:// ��ʾע��
			System.out.println("�����͸���ϵͳ��>ע��");
			System.out.println("����д����ע����Ϣ");
			System.out.print("�û�����");
			String user = input.next();
			System.out.print("����");
			int key = input.nextInt();
			System.out.println("ע��ɹ�!  ���ס���Ļ�Ա����");
			System.out.println("�û���" + user + "");
			System.out.println("����" + key + "");
			System.out.println("��Ա����" + a + "");
			System.out.print("Ҫ������ ��y/n��");
			String ch = input.next();
			if (ch.equals("n")) {
				break a;
			}
			System.out.println("�����͸���ϵͳ��>��¼");
			System.out.println("�������û���");
			String user1 = input.next();
			System.out.print("��������������");
			int key1 = input.nextInt();	
			System.out.println("��¼�ɹ�");
			System.out.print("Ҫ������ ��y/n��");
			String ch1 = input.next();
			if (ch1.equals("n")) {
				break a;
			} else {
				System.out.println("�����͸���ϵͳ��>��¼>�齱");
				int yushe[] = { 4564, 1135, 5416, 1315, 9874 };
				System.out.println("���������Ļ�Ա����");
				int card = input.nextInt();
				for (int k = 0; k < 5; k++) {
					if (card == yushe[k]) {
						System.out.println("��ϲ�����н���");
						break;
					} else {
						System.out.println("���ź�����û���н�");
						
					}
				}break a;
			}
		default:
			System.out.println("������������");
			break;
		}
		int yushe[] = { 4564, 1135, 5416, 1315, 9874 };
		for (int temp : (yushe)) {
		System.out.println("���յ���������Ϊ" + temp);
		}
		System.out.println("ϵͳ�˳���ллʹ�ã�");
	}
}
