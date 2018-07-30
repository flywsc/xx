package com.wsc201820;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		System.out.println("请输入要打印的个数");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int[] r = new int[11];
		int sum = 0;
		int c[] = new int[a + 1];
		int[] b = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };

		for (int i = 3; i < b.length - 1; i++) {
			
				sum = b[i] + b[i + 1];
			
			System.out.println(sum);
		}
		for (int j = 0; j < a; j++) {
			r[j] = sum;
			
		}

	}
}
