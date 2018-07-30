package com.wsc201816;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("请输入第" + i + "位的学生成绩");
			int score = input.nextInt();
			sum += score;
			if (i < 85) {
				continue;
			} 
				cont++;
			
		}
		System.out.println(sum);
		System.out.println(cont);
	}
}