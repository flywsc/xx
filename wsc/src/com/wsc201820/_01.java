package com.wsc201820;

import java.util.Random;

public class _01 {
	public static void main(String[] args) {
		String[] Books_1 = { "Html Css Js 前端", "Java 语言基础逻辑", "数据库高级设计知识", "Java 面向对象", "Jsp & Servlet", "Java 企业级框架",
				"" };
		int[] Hours_1 = { 48, 60, 32, 75, 70, 120, 0 };

		String[] Books_2 = { "jQuery 前端高级框架", "Ajax 高级交互模式", "微信公众号、小程序开发", "vue.js 前端流行框架" };
		int[] Hours_2 = { 20, 32, 16, 10 };
		// 以上带 _1 的数组是课程名称及对应学时
		// _2 的数组是选修课名称及对应学时
		// 要求：学员可以根据随机数，从选修课数组中筛选一门课程进行学习，
		// 被选出的课程要插入到_1 的数组中去，对应学时也要插入进学时数组，
		// 假设课程数组的课程名称是按由小到大排好序的，选修课程 须插到正确位置，
		// 最后，统计出选修课插入后的总学时
		Random rd = new Random();
		int suiji = rd.nextInt(4);
		String Books_22 = Books_2[suiji];
		int Hours_22 = Hours_2[suiji];
		int index = Books_1.length - 1;
		int sum = 0;
		System.out.println("选的课程为:" + Books_22 + "      对应课时为" + Hours_22);
		for (int i = 0; i < Books_1.length; i++) {
			if (Books_1[i].compareTo(Books_22) > 0) {
				index = i;
				break;
			}
		}
		if (index == Books_1.length) {
			Books_1[index] = Books_22;
			Hours_1[index] = Hours_22;
		} else {
			for (int i = Books_1.length - 2; i >= index; i--) {
				Books_1[i + 1] = Books_1[i];
				Hours_2[i + 1] = Hours_2[i];
			}
				Books_1[index] = Books_22;
				Hours_2[index] = Hours_22;
			
		}
		for (int i = 0; i < Hours_1.length; i++) {
			sum += Hours_1[i];
		}
		sum = sum + Hours_2[suiji];
		
        for(int i=1;i<Books_1.length;i++) {
        	System.out.println(Books_1[i]);
        }
		System.out.println("总课时为" + sum);
	}
}