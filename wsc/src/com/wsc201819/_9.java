package com.wsc201819;

import java.util.Random;

public class _9 {
	public static void main(String[] args) {

		int[] init = new int[10];
		int[] all_candy = new int[10];
		int[] half_candy = new int[10];
		int count = 0;
		Random rd = new Random();
		for (int i = 0; i < all_candy.length; i++) {
			init[i] = (rd.nextInt(15) + 1);
			all_candy[i] = init[i];
		}
		while (!june(all_candy)) {
			/*
			boolean flag=true;
			for(int i = 0; i < all_candy.length-1; i++ ){
			 if(all_candy[i]!=all_candy[i+1]) {
				 flag=false;
				 break;
			 }
			}
			if(flag) {
				break;
			}
			*/
			count++;
			for (int i = 0; i < all_candy.length; i++) {
				if (all_candy[i] % 2 != 0) {
					all_candy[i] += 1;
				} 
					half_candy[i] = all_candy[i] / 2;
					all_candy[i] = half_candy[i];
				
			}
			for (int i = 0; i < all_candy.length; i++) {
				if (i != all_candy.length - 1) {
					all_candy[i + 1] = half_candy[i] + all_candy[i + 1];
				} else {
					all_candy[0] = all_candy[0] + half_candy[all_candy.length - 1];
				}
			}
		} 
		System.out.println("经过" + count + "次   " );
		for (int i = 0; i < all_candy.length; i++) {
			System.out.println("经过" + count + "次   " + "小孩手中唐相等" + "数量为" + all_candy[i]+"\t");
		}
	}
    //一个main方法
	public static boolean june(int[] arr) {
		boolean val = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				val = false;
				break;
			}
		}
		return val;

	}

}
