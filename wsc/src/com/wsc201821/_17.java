package com.wsc201821;

public class _17 {
	public static void main(String[] args) {

      String a=new String ("abc1");
      String b=new String ("ABC1");
      boolean c=a.equals(b);//��һ���Ƿִ�Сд
      boolean d=a.equalsIgnoreCase(b);//�ڶ����ǲ��ִ�Сд
      System.out.println(c);
      System.out.println(d);
      
      //�������
      String a1="ABC1";
      String b1="ABC1";
      System.out.println(a1==b1);//�������ַ����������ȵĻ�������ȵ�
	}
}
