package com.wsc201821;

import java.util.Arrays;
/**
 * 
 * @author Administrator
 *������ʿ��
 */
public class _01 {
	/**
	 * 
	 * @param args����һ������������
	 */
	public static void main(String[] args) {
     
     int a[]= {1,2,3,4,5,6,7,8,9};
     int b[]=Arrays.copyOf(a, 11);//��������
     for(int tmp:b) {//��һ������
    	 System.out.println(tmp);
     }
	}
}
