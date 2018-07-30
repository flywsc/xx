package com.ssc201824;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
        System.out.println("请输入要打印的行数"); 
		Scanner input=new Scanner(System.in);
        int score=input.nextInt();
		for (int i = score; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		}
}
