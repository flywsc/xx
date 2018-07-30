package com.www20180725;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		System.out.println("请输入要打印的行数");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int clos = 2 * rows - 1;// 这个是列数

		int[][] yh = new int[rows][clos];// 先遍历数组
		for (int i = 0; i < yh.length; i++) {
			for (int j = 0; j < yh[i].length; j++) {
				if ((j == rows - 1 - i) || j == (rows - 1 + i)) {// 出现1的位置
					yh[i][j] = 1;// 那么就赋值给这个坐标
				} else if (j > rows - 1 - i && j < rows - 1 + i) {// 进入到里面，但是必须要在1的里面
					if ((j - (rows - 1 - i)) % 2 == 0) {// 满足这个条件的位置就是数字，不满足就是0
						yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j + 1];// 上一排两边肩膀上的值赋值给他
					}
				}
			}
		}
		for (int i = 0; i < yh.length; i++) {// 遍历输出这个数组
			for (int j = 0; j < yh[i].length; j++) {
				if (yh[i][j] == 0) {
					System.out.print(" ");// 如果这个位置出现是0的话就输出一个空格
				} else {// 否则就输出数字
					System.out.print(yh[i][j]);// 这个位置不换行
				}
			}
			System.out.println();// 打完以后在换行
		}
        //现在打印那一个倒的杨辉三角
		for (int i = yh.length-2; i > 0; i--) {// 遍历输出这个数组
			for (int j = 0; j < yh[i].length; j++) {
				if ((j == rows - 1 - i) || j == (rows - 1 + i)) {// 出现1的位置
					yh[i][j] = 1;// 那么就赋值给这个坐标
				} else if (j > rows - 1 - i && j < rows - 1 + i) {// 进入到里面，但是必须要在1的里面
					if ((j - (rows - 1 - i)) % 2 == 0) {// 满足这个条件的位置就是数字，不满足就是0
						yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j + 1];// 上一排两边肩膀上的值赋值给他
					}
				}

			}
		}
		for (int i = yh.length-2; i >= 0; i--) {
			for (int j = 0; j < yh[i].length; j++) {
				if (yh[i][j] == 0) {
					System.out.print(" ");// 如果这个位置出现是0的话就输出一个空格
				} else {// 否则就输出数字
					System.out.print(yh[i][j]);// 这个位置不换行
				}
			}
		System.out.println();
		}	
	}
}
