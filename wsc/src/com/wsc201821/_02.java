package com.wsc201821;
/**
 * ��һ������
 */
import java.util.Arrays;

public class _02 {
	public static void main(String[] args) {
     int a[]= {1,2,3,4,5,6,7,8,9,10};
     int b[]=Arrays.copyOfRange(a, 1,6);//����ָ��λ�������λ��1.�ǿ�ʼλ�ã���������6�����Ƶ�����Ϊ6��λ�ã�������������һ��ʼ
    //�����6����Ҫ��ǰ���1��
     //���ھ�û���κ�����
     for( int tmp:b) {
    	 System.out.println(tmp);
     }

	
	}
}
