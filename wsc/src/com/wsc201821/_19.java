package com.wsc201821;

public class _19 {
	public static void main(String[] args) {

         String st="��ͷһ��һ��";
         String st1=st.replace("һ", "Ҽ");
         //�滻�ַ���������Ϊ�ַ�����
         //һ��Ҫ�滻������
         //Ҽ���µ��ַ���
         System.out.println(st1);
         
         
         String st2="123456abc";
         String st3=st2.replaceAll("\\d", "???");
         //�����滻Ԫ�ַ�
         System.out.println(st3);
         
         
         String st4="jAva";
         String st5=st4.replaceFirst("A", "O");
         System.out.println(st5);
         //ֻ�滻һ��
	}
}
