package com.wwwshangmain;

public class _01 {
	public static void main(String[] args) {
		//冒泡排序
		int a[] = { 1, 2, 3, 56, 545, 121, 3, 25, 1, 5, 4, 869, 1 };
		int num = 0;
		for (int i = 0; i < a.length-1 ; i++) {					
			for (int j = 0; j < a.length -1- i; j++) {
				if (a[j]< a[j + 1]) {//这里可以改变
					num = a[j];
					a[j] = a[j + 1];
					a[j + 1] = num;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
