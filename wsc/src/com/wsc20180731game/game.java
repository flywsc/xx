package com.wsc20180731game;

import java.util.Scanner;

public class game {
	public void init() {

		Scanner input = new Scanner(System.in);

		play play1 = new play();
		computer computer1 = new computer();
		System.out.print("�������������");		
		play1.play_name = input.next();
		System.out.println("ѡ���ս�Ľ�ɫ");
		System.out.println("���������ѡ��1.����     2.����     3.�ŷ�");
		computer1.computer_chioce = input.next();
		computer1.computer_name1 = "����";
		computer1.computer_name2 = "����";
		computer1.computer_name3 = "�ŷ�";
		
		if (computer1.computer_chioce.equals("1")) {
			System.out.println("��ѡ�����������ս");
		} else if (computer1.computer_chioce.equals("2")) {
			System.out.println("��ѡ�˹��������ս");
		} else if (computer1.computer_chioce.equals("3")) {
			System.out.println("��ѡ���ŷ������ս");
		}
	}

	public void stat() {
		
		Scanner input = new Scanner(System.in);

		int sum = 0;// ��¼�ܴ���
		int cpmptuerSum=0;
		int playSum=0;
		play playstat = new play();
		computer computerstat = new computer();
		System.out.println("Ҫ��ʼ��Ŷ");
		while (true) {
			playstat.playShow();
			computerstat.computerShow();
			switch (playstat.playChioce) {
			case 1:
				sum ++;
				switch (computerstat.computerChioce) {
				case 1:
					System.out.println("ƽ��");
					break;
				case 2:
					System.out.println("������");
					cpmptuerSum ++;
					break;
				case 3:
					System.out.println("��Ӯ��");
					playSum ++;
					break;
				}
				break;
			case 2:
				sum ++;
				switch (computerstat.computerChioce) {
				case 1:
					System.out.println("��Ӯ��");
					playSum ++;
					break;
				case 2:
					System.out.println("ƽ��");
					break;
				case 3:
					System.out.println("������");
					cpmptuerSum++;
					break;
				}
				break;
			case 3:
				sum ++;
				switch (computerstat.computerChioce) {
				case 1:
					System.out.println("������");
					cpmptuerSum ++;
					break;
				case 2:
					System.out.println("��Ӯ��");
					playSum ++;
					break;
				case 3:
					System.out.println("ƽ��");
					break;
				}
			}
			System.out.println("Ҫ������y_n");
			String c = input.next();
			if (c.equals("y")) {
				continue;
			} else {
				System.out.println("һ����ս" + sum + "��");
				System.out.println("��Ļ���" +playSum);
				System.out.println("���Ի���" + cpmptuerSum);
				break;
			}

		}

	}

}
