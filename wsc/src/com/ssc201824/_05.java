package com.ssc201824;

import java.util.Random;
import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		String persion[][] = new String[5][3];
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(9000) + 1000;

		b:while (true) {
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
			System.out.println("     1.ע��          ");
			System.out.println("     2.�鿴ע���Ա          ");
			System.out.println("     3.�齱         ");
			System.out.println("************************");
			System.out.println();
			System.out.print("��ѡ��˵�");
			int chioce = -1;

			if (input.hasNextInt()) {
				chioce = input.nextInt();
			} else {
				System.out.println("�������.");
				input = new Scanner(System.in);
				continue;
			}

			a: switch (chioce) {
			case 1:
				String[] in = new String[3];
				System.out.println("�����͸���ϵͳ��>ע��");
				System.out.println("����д����ע����Ϣ");
				System.out.print("�û�����");
				in[0] = input.next();
				System.out.print("����");
				in[1] = input.next();
				in[2] = Integer.toString(a);
				System.out.println();
				// ���ʵĿ�λ�ã���in�Ž�ȥ
				// ���λ������������ʾ�û����޷���ע�����û�
				int index = -1;
				for (int i = 0; i < persion.length; i++) {
					if (persion[i][0] == null) {
						index = i;
						break;
					}
				}

				if (index != -1) {
					persion[index] = in;
				} else {
					System.out.println("��Ա���������޷�ע��");
				}
				System.out.println("ע��ɹ�!  ���ס���Ļ�Ա����");
				System.out.println("�û���" + in[0] + "");
				System.out.println("����" + in[1] + "");
				System.out.println("��Ա����" + a + "");

				System.out.print("Ҫ������ ��y/n��");
				String ch = input.next();
				if (ch.equals("n")) {// ѡ��nֱ���˳�
					break;
				} else {// ������Ե�¼
					System.out.println("�����͸���ϵͳ��>��¼");
					System.out.println("�������û���");
					String user1 = input.next();
					System.out.print("��������������");
					String key1 = input.next();
					if (in[0].equals(user1) && in[1].equals(key1)) {
						System.out.println("��ӭ������¼�ɹ���");
					}
				}
				continue;
			case 2:// �鿴��Ϣ
				System.out.println("��ѡ���˲鿴����ע����Ϣ");
				for (int i = 0; i < persion.length; i++) {
					for (int j = 0; j < persion[i].length; j++) {
						System.out.print(persion[i][j] + " \t");
						continue;
					}
				}
				continue;
			case 3:
				System.out.println("�����͸���ϵͳ��>��¼>�齱");
				int yushe[] = { 4564, 1135, 5416, 1315, 9874 };
				System.out.println("���������Ļ�Ա����");
				int card = input.nextInt();
				/*
				c:for (int k = 0; k < 5; k++) {
					if (card == yushe[k]) {
						System.out.println("��ϲ�����н���");
						System.out.println(yushe[k]);
						break c;
					}  else   {
						System.out.println("���ź�����û���н�");
						
					}
				}
				*/
				  
			default:
				break;
			}// ����switch��β
			break;
		} // ����while�Ľ�β
		
		System.out.println("ϵͳ�˳�,ллʹ��");
	}
}
