package com.wsc201821;

public class _13 {
	public static void main(String[] args) {

		String a = "we are the world";
		int b = a.indexOf("e");// �ӵ�һ������������
		int c = a.indexOf("e", 2);// a��Ҫ��ȡ���ַ���,�ǵ��ַ�Ҫ��˫����
		System.out.println(c);
		System.out.println("���ֵ��ַ�������Ϊ" + b + "��λ��");

		// ���µ��ǴӺ���������ǰ��
		String d = "letitgo!letitgo!letitgo!";
		int e = d.indexOf("t");
		System.out.println("��һ�γ��ֵ�����λ����" + e);// �ӵ�һ��������
		int f = d.indexOf("g", 2);// �ӵڶ�����ʼ������,
		System.out.println("�ӵڶ�����ʼ�����ң���һ�γ��ֵ�����λ����" + f);

	}
}
