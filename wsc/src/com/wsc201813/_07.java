package com.wsc201813;

public class _07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for (; i <= 100; i++) {
			System.out.print(i);

			if (i % 3 == 0) {
				System.out.print("filp\t");

			}
			if (i % 5 == 0) {
				System.out.print("fiop\t");

			}
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print("flifiop\t");
			}

			System.out.println();
		}
	}
}