package com.ssc201824;

public class _01 {
	public static void main(String[] args) {
		for (int i = 9; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(i + "*" + j + "=" + i * j + "   ");
			}
			System.out.println();
		}
	}
}
