package com.wsc201821;

public class _15 {
	private static char[] temp;

	// �ַ�������ַ�������
	public static void main(String[] args) {
		String demo = "����һ���ַ���";
		char[] ch = demo.toCharArray();
//        for(int i=0;i<demo.length();i++) {����ķ���ֵ��int
//        	System.out.println(ch[i]);
//        }
		for (char temp : ch) {// ��ס����ֵ��char
			System.out.println(temp);
		}
	}
}
