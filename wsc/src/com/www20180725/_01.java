package com.www20180725;

import java.util.Random;
import java.util.Scanner;

public class _01 {
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
		boolean falg = false;
		int index1 = -1;
		int index2 = -1;
		int find = sc.nextInt();
		for (int i = 0; i < demo.length; i++) {
			for (int j = 0; j < demo[i].length; j++) {
				if (find == demo[i][j]) {
					index1 = i;
					index2 = j;
					falg = true;
					break;
				}
			}
		}
		if (falg) {
			System.out.println("�����������������ĵ�" + (index1 + 1) + "��" + "��" + (index2 + 1) + "��");

		} else {
			System.out.println("�������ֵ������������");
		}
	}
}
