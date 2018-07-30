package com.wsc201813;

public class _01 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				
			}System.out.println();
		}
	}

}
