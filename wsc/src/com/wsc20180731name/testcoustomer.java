package com.wsc20180731name;

import java.util.Scanner;

public class testcoustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coustomer cs = new coustomer();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < cs.names.length; i++) {
			System.out.print("输入你将要增加的名字");
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
		
		System.out.print("是否进行修改y_ _n");
		if("y".equals(input.next())) {
			System.out.print("请输入要修改的名字");
			String _old=input.next();
			System.out.print("请输入要修改的新名字");
			String _new=input.next();
			System.out.println();
			cs.xiugai(_old,_new);
		}else {
			System.out.println("你选择不修改");
		}
		System.out.print("是否进行删除y_ _n");
	  if("y".equals(input.next())) {
		  System.out.print("请输入要删除的名字");
			String _old1=input.next();
			
			System.out.println();
			cs.shanchu(_old1);
	  }else {
		  System.out.println("你选择了不删除");
	  }
	}

}
