package com.www20180725;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		System.out.println("������Ҫ��ӡ������");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int clos = 2 * rows - 1;// ���������

		int[][] yh = new int[rows][clos];// �ȱ�������
		for (int i = 0; i < yh.length; i++) {
			for (int j = 0; j < yh[i].length; j++) {
				if ((j == rows - 1 - i) || j == (rows - 1 + i)) {// ����1��λ��
					yh[i][j] = 1;// ��ô�͸�ֵ���������
				} else if (j > rows - 1 - i && j < rows - 1 + i) {// ���뵽���棬���Ǳ���Ҫ��1������
					if ((j - (rows - 1 - i)) % 2 == 0) {// �������������λ�þ������֣����������0
						yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j + 1];// ��һ�����߼���ϵ�ֵ��ֵ����
					}
				}
			}
		}
		for (int i = 0; i < yh.length; i++) {// ��������������
			for (int j = 0; j < yh[i].length; j++) {
				if (yh[i][j] == 0) {
					System.out.print(" ");// ������λ�ó�����0�Ļ������һ���ո�
				} else {// ������������
					System.out.print(yh[i][j]);// ���λ�ò�����
				}
			}
			System.out.println();// �����Ժ��ڻ���
		}
        //���ڴ�ӡ��һ�������������
		for (int i = yh.length-2; i > 0; i--) {// ��������������
			for (int j = 0; j < yh[i].length; j++) {
				if ((j == rows - 1 - i) || j == (rows - 1 + i)) {// ����1��λ��
					yh[i][j] = 1;// ��ô�͸�ֵ���������
				} else if (j > rows - 1 - i && j < rows - 1 + i) {// ���뵽���棬���Ǳ���Ҫ��1������
					if ((j - (rows - 1 - i)) % 2 == 0) {// �������������λ�þ������֣����������0
						yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j + 1];// ��һ�����߼���ϵ�ֵ��ֵ����
					}
				}

			}
		}
		for (int i = yh.length-2; i >= 0; i--) {
			for (int j = 0; j < yh[i].length; j++) {
				if (yh[i][j] == 0) {
					System.out.print(" ");// ������λ�ó�����0�Ļ������һ���ո�
				} else {// ������������
					System.out.print(yh[i][j]);// ���λ�ò�����
				}
			}
		System.out.println();
		}	
	}
}
