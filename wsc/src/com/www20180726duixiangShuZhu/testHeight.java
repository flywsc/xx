package com.www20180726duixiangShuZhu;

import java.util.Scanner;

public class testHeight {

	public static void main(String[] args) {
		student[] sts = new student[6];// 用new关键字定义一个新的数组
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		higth hg = new higth();// 把身高实例化类

		for (int i = 0; i < sts.length; i++) {//循环来赋值
			System.out.println("请输入第" + (i + 1) + "学生的身高");
			student st = new student();//每一次都要分配一个新的空间，不然会覆盖
			st.height = input.nextInt();
			sts[i] = st;
		//这里是分配一个空间，在把这个空间赋值
		}

		for (int i = 0; i < sts.length; i++) {
			System.out.println("学生的身高是" + sts[i].height + "cm");//用数组的第i个元素来调用身高
			//之前就给身高赋值了，所以可以循环输出
		}
		System.out.println("平均身高是" + hg.avg(sts) + "cm");
	}

}
