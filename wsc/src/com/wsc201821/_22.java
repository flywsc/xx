package com.wsc201821;

public class _22 {
	public static void main(String[] args) {
        //�ַ���ȥ���հ�
		
        String st1="  a       b  c de      f ";
        String st2=st1.trim();
        //�����ֻȥ����β�հ�
        String st3=st1.replaceAll("\\s", "");
        //�����ȥ�����пհ�
        // \\s��������ʽ����հ����ݣ������ǿ��ַ���
        System.out.println(st2);
        System.out.println(st3);
	}
}
