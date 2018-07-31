package com.wsc20180731name;

import java.util.Scanner;

public class testcoustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coustomer cs = new coustomer();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < cs.names.length; i++) {
			System.out.println("输入你将要增加的名字");
			String name = input.next();
			cs.add_name(name);
			System.out.println("要继续加入名字吗        请选择 y_n");
			if ("n".equals(input.next())) {
				break;
			}
		if(i==cs.names.length-1) {
			System.out.println("存储空间不足,无法继续加入名字");
			break;
		}
		}

		cs.show();

	}

}
