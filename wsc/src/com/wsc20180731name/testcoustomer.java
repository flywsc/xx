package com.wsc20180731name;

import java.util.Scanner;

public class testcoustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coustomer cs = new coustomer();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < cs.names.length; i++) {
			System.out.println("�����㽫Ҫ���ӵ�����");
			String name = input.next();
			cs.add_name(name);
			System.out.println("Ҫ��������������        ��ѡ�� y_n");
			if ("n".equals(input.next())) {
				break;
			}
		if(i==cs.names.length-1) {
			System.out.println("�洢�ռ䲻��,�޷�������������");
			break;
		}
		}

		cs.show();

	}

}
