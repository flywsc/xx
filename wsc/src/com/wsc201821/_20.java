package com.wsc201821;

public class _20 {
	public static void main(String[] args) {
         //�ַ����ָ�
		String cut = "192.168.43.1";
		String cut1[] = cut.split("\\.");
		//ֻ��Ϊ.���ָ�
		String cut2[] = cut.split("\\.",2);
		//��һ��2�����Ǵ���ָ����
		// ֧��������ʽ
		for (int i = 0; i < cut2.length; i++) {
			System.out.println("["+cut2[i]+"]");
		}
	}
}
