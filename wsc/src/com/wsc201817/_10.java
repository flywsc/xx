package com.wsc201817;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入要打印的层数");
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		for (int i =1; i <= score; i++) {
			for (int j = 1; j <=score; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}

			}
			System.out.println();
		}

		for (int i = score-1; i >= 0; i--) {
			for (int j = 1; j <= score-1; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
