package com.wsc201816;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ʮ������");
		int num = input.nextInt();
        
		String total=" " ;
		int _bit ;
		while (true) {
			_bit=num%8;
			total = _bit + total;
			num = num / 8;
			if (num<8) {
				total = num + total;
				break;
			}
		}
		System.out.println("�˽�������"+total);
	}
}
