package com.ssc201824;

import java.util.Random;
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		System.out.println("*****欢迎进入奖客富翁系统*****");
		System.out.println("     1.注册          ");
		System.out.println("     2.登录          ");
		System.out.println("     3.抽奖         ");
		System.out.println("************************");
		System.out.println();
		System.out.print("请选择菜单");
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(9000) + 1000;
		// 生成从0-指定数（不包括指定数）的整数
		int choice = input.nextInt();
		a: switch (choice) {
		case 1:// 提示注册
			System.out.println("（奖客富翁系统）>注册");
			System.out.println("请填写个人注册信息");
			System.out.print("用户名：");
			String user = input.next();
			System.out.print("密码");
			int key = input.nextInt();
			System.out.println("注册成功!  请记住您的会员卡号");
			System.out.println("用户名" + user + "");
			System.out.println("密码" + key + "");
			System.out.println("会员卡号" + a + "");
			System.out.print("要继续吗？ （y/n）");
			String ch = input.next();
			if (ch.equals("n")) {
				break a;
			}
			System.out.println("（奖客富翁系统）>登录");
			System.out.println("请输入用户名");
			String user1 = input.next();
			System.out.print("请输入您的密码");
			int key1 = input.nextInt();	
			System.out.println("登录成功");
			System.out.print("要继续吗？ （y/n）");
			String ch1 = input.next();
			if (ch1.equals("n")) {
				break a;
			} else {
				System.out.println("（奖客富翁系统）>登录>抽奖");
				int yushe[] = { 4564, 1135, 5416, 1315, 9874 };
				System.out.println("请输入您的会员卡号");
				int card = input.nextInt();
				for (int k = 0; k < 5; k++) {
					if (card == yushe[k]) {
						System.out.println("恭喜您，中奖了");
						break;
					} else {
						System.out.println("很遗憾，您没有中奖");
						
					}
				}break a;
			}
		default:
			System.out.println("您的输入有误");
			break;
		}
		int yushe[] = { 4564, 1135, 5416, 1315, 9874 };
		for (int temp : (yushe)) {
		System.out.println("本日的幸运数字为" + temp);
		}
		System.out.println("系统退出，谢谢使用！");
	}
}
