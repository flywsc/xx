package com.wsc201820;

public class _05 {
	public static void main(String[] args) {

		int[] b = { 15, 25, 62, 45, 41, 87, 21, 2, 31, 541, 31, 316, 132, 12 };
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = 0; j < b.length - 1 - i; j++) {
				if (b[j]< b[j + 1]) {
					int temp = 0;
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
	    	}
		}  
		for (int i = 0; i < b.length - 1; i++) {
			System.out.println(b[i]);
		}
	} 
}
