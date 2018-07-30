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

		System.out.println("请输入你要查找的值");
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
			System.out.println("您输入的数字在数组的第" + (index1 + 1) + "行" + "第" + (index2 + 1) + "列");

		} else {
			System.out.println("您输入的值不存在数组中");
		}
	}
}
