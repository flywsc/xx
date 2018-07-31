package com.wsc20180731game;

import java.util.Scanner;

public class game {
	public void init() {

		Scanner input = new Scanner(System.in);

		play play1 = new play();
		computer computer1 = new computer();
		System.out.print("请输入你的名字");		
		play1.play_name = input.next();
		System.out.println("选择对战的角色");
		System.out.println("请输入你的选择1.刘备     2.关羽     3.张飞");
		computer1.computer_chioce = input.next();
		computer1.computer_name1 = "刘备";
		computer1.computer_name2 = "关羽";
		computer1.computer_name3 = "张飞";
		
		if (computer1.computer_chioce.equals("1")) {
			System.out.println("你选择刘备与你对战");
		} else if (computer1.computer_chioce.equals("2")) {
			System.out.println("你选了关羽与你对战");
		} else if (computer1.computer_chioce.equals("3")) {
			System.out.println("你选了张飞与你对战");
		}
	}

	public void stat() {
		
		Scanner input = new Scanner(System.in);

		int sum = 0;// 记录总次数
		int cpmptuerSum=0;
		int playSum=0;
		play playstat = new play();
		computer computerstat = new computer();
		System.out.println("要开始了哦");
		while (true) {
			playstat.playShow();
			computerstat.computerShow();
			switch (playstat.playChioce) {
			case 1:
				sum ++;
				switch (computerstat.computerChioce) {
				case 1:
					System.out.println("平局");
					break;
				case 2:
					System.out.println("你输了");
					cpmptuerSum ++;
					break;
				case 3:
					System.out.println("你赢了");
					playSum ++;
					break;
				}
				break;
			case 2:
				sum ++;
				switch (computerstat.computerChioce) {
				case 1:
					System.out.println("你赢了");
					playSum ++;
					break;
				case 2:
					System.out.println("平局");
					break;
				case 3:
					System.out.println("你输了");
					cpmptuerSum++;
					break;
				}
				break;
			case 3:
				sum ++;
				switch (computerstat.computerChioce) {
				case 1:
					System.out.println("你输了");
					cpmptuerSum ++;
					break;
				case 2:
					System.out.println("你赢了");
					playSum ++;
					break;
				case 3:
					System.out.println("平局");
					break;
				}
			}
			System.out.println("要继续吗y_n");
			String c = input.next();
			if (c.equals("y")) {
				continue;
			} else {
				System.out.println("一共对战" + sum + "局");
				System.out.println("你的积分" +playSum);
				System.out.println("电脑积分" + cpmptuerSum);
				break;
			}

		}

	}

}
