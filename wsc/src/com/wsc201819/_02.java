package com.wsc201819;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 删除数组里的一个数
		System.out.println("请输入要删除的菜");
		Scanner input = new Scanner(System.in);
		String shuru = input.next();
		String[] menu = { "白菜", "青菜", "肉类", "小吃", "凉菜", "果汁" };
		
		int index = -1;// 定义一个指针
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(shuru)) {//
				index = i;
				break;
			}
		}
		if (index != -1) {
			for (int j = index; j < menu.length - 1; j++) {
				menu[j] = menu[j + 1];
			   
			}
			 menu[menu.length - 1] = null;
		}
		for (int j = 0; j < menu.length ; j++) {//
			System.out.println(menu[j]);
		}
	}
}
