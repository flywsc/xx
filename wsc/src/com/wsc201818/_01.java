package com.wsc201818;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] song = { "����", "����", "����", "����", "����", " " };
		Scanner input = new Scanner(System.in);
		System.out.println("����ǰ");
		for (int i = 0; i < song.length; i++) {
			System.out.print(song[i] + "  ");
		}
		System.out.println("��������ĸ���");
		String xin = input.next();
		int aa = song.length - 1;
		for (int i = 0; i <= song.length; i++) {
			if (song[i].compareTo(xin) > 0) {
				aa = i;
				break;
			}
		}
		if (aa == song.length - 1) {
			song[aa] = xin;
		} else {
			for (int j = song.length - 2; j <= 0; j--) {
				song[j + 1] = song[j];
			}
			song[aa] = xin;
		}
		System.out.println("�����");
		for (int i = 0; i < song.length; i++) {
			System.out.println(song[i]);
		}
	}

}
