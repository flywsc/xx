package com.ssc201824;

import java.util.Random;
import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		String persion[][] = new String[5][3];
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(9000) + 1000;

		b:while (true) {
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("     1.注册          ");
			System.out.println("     2.查看注册成员          ");
			System.out.println("     3.抽奖         ");
			System.out.println("************************");
			System.out.println();
			System.out.print("请选择菜单");
			int chioce = -1;

			if (input.hasNextInt()) {
				chioce = input.nextInt();
			} else {
				System.out.println("输入出错.");
				input = new Scanner(System.in);
				continue;
			}

			a: switch (chioce) {
			case 1:
				String[] in = new String[3];
				System.out.println("（奖客富翁系统）>注册");
				System.out.println("请填写个人注册信息");
				System.out.print("用户名：");
				in[0] = input.next();
				System.out.print("密码");
				in[1] = input.next();
				in[2] = Integer.toString(a);
				System.out.println();
				// 合适的空位置，将in放进去
				// 如果位置已满，则提示用户，无法再注册新用户
				int index = -1;
				for (int i = 0; i < persion.length; i++) {
					if (persion[i][0] == null) {
						index = i;
						break;
					}
				}

				if (index != -1) {
					persion[index] = in;
				} else {
					System.out.println("成员已满，您无法注册");
				}
				System.out.println("注册成功!  请记住您的会员卡号");
				System.out.println("用户名" + in[0] + "");
				System.out.println("密码" + in[1] + "");
				System.out.println("会员卡号" + a + "");

				System.out.print("要继续吗？ （y/n）");
				String ch = input.next();
				if (ch.equals("n")) {// 选择n直接退出
					break;
				} else {// 否则可以登录
					System.out.println("（奖客富翁系统）>登录");
					System.out.println("请输入用户名");
					String user1 = input.next();
					System.out.print("请输入您的密码");
					String key1 = input.next();
					if (in[0].equals(user1) && in[1].equals(key1)) {
						System.out.println("欢迎您，登录成功！");
					}
				}
				continue;
			case 2:// 查看信息
				System.out.println("您选择了查看个人注册信息");
				for (int i = 0; i < persion.length; i++) {
					for (int j = 0; j < persion[i].length; j++) {
						System.out.print(persion[i][j] + " \t");
						continue;
					}
				}
				continue;
			case 3:
				System.out.println("（奖客富翁系统）>登录>抽奖");
				int yushe[] = { 4564, 1135, 5416, 1315, 9874 };
				System.out.println("请输入您的会员卡号");
				int card = input.nextInt();
				/*
				c:for (int k = 0; k < 5; k++) {
					if (card == yushe[k]) {
						System.out.println("恭喜您，中奖了");
						System.out.println(yushe[k]);
						break c;
					}  else   {
						System.out.println("很遗憾，您没有中奖");
						
					}
				}
				*/
				  
			default:
				break;
			}// 这是switch结尾
			break;
		} // 这是while的结尾
		
		System.out.println("系统退出,谢谢使用");
	}
}
