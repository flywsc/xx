package com.wsc201821;

public class _03 {
	public static void main(String[] args) {
		// 冒泡排序
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int tmp = 0;
		for (int i = 1; i < a.length; i++) {// 10个只需要比九轮，所以从一开始
			for (int j = 0; j < a.length - i; j++) {// 每次比一轮，减少一个，所以减去i
				if (a[j] <a[j + 1]) {// 如果前一个数大于后面一个
					//可以通过改变大小来排序升序和降序
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.println("冒泡排序的结果是：");
		for (int tmp1 : a) {
			System.out.print(tmp1 + "  ");

		}

	}
}
