package com.wsc201821;

public class _03 {
	public static void main(String[] args) {
		// ð������
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int tmp = 0;
		for (int i = 1; i < a.length; i++) {// 10��ֻ��Ҫ�Ⱦ��֣����Դ�һ��ʼ
			for (int j = 0; j < a.length - i; j++) {// ÿ�α�һ�֣�����һ�������Լ�ȥi
				if (a[j] <a[j + 1]) {// ���ǰһ�������ں���һ��
					//����ͨ���ı��С����������ͽ���
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.println("ð������Ľ���ǣ�");
		for (int tmp1 : a) {
			System.out.print(tmp1 + "  ");

		}

	}
}
