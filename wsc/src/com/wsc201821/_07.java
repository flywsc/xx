package com.wsc201821;

public class _07 {
	public static void main(String[] args) {
		// ʹ�ù��췽����ֱ���ַ�����ʵ����
		char chararray[] = { 't', 'i', 'm', 'e' };
		String a = new String(chararray);
		System.out.println(a);

		// ����2
		// ��ȡָ��λ���ַ�
		char chararrya1[]= {'ʱ','��','��','��','��','Ǯ','��','��','��','��','��'};
		String b=new String(chararrya1,2,7);//2����ʼ����λ�ã�������������7������������
		System.out.println(b);

	}
}
