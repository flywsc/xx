package com.wsc201821;

import java.util.Arrays;
/**
 * 
 * @author Administrator
 *我是我士串
 */
public class _01 {
	/**
	 * 
	 * @param args这是一个主程序的入口
	 */
	public static void main(String[] args) {
     
     int a[]= {1,2,3,4,5,6,7,8,9};
     int b[]=Arrays.copyOf(a, 11);//复制数组
     for(int tmp:b) {//传一个参数
    	 System.out.println(tmp);
     }
	}
}
