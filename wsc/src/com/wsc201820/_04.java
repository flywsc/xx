package com.wsc201820;

public class _04 {
	public static void main(String[] args) {

		String s1 = "kdjvsdnhvlkfndslnzlkfdlkbdzljJFDZSOIJBFGIBH/L. NBHDPFFFFFKLBNFDKNBFDLKN";
		int[] small = new int[26];// ����Сд��ĸ����
		int[] big = new int[26];// �����д��ĸ����
		int len = s1.length();// ��ȡ�ַ�������

		for (int i = 0; i < len; i++) {
			char ch = s1.charAt(i);
			if (ch > 'A' && ch < 'Z') {// �ж��ǲ��Ǵ�д
				big[ch - 65]++;
			} else if (ch > 'a' && ch < 'z') {// �ж��ǲ���Сд
				small[ch - 97]++;
			}
		}
		System.out.println("�ַ����еĴ�д��ĸ��");
		for (int i = 0; i < 26; i++) {
			if (big[i] != 0) {
				System.out.print((char) +(i + 65) + ":" + big[i]+"\t");

			}
		}
		System.out.println();
		System.out.println("�ַ����е�Сд��ĸ��");
		for (int i = 0; i < 26; i++) {
			if (small[i] != 0) {

				System.out.print((char) +(i + 97) + ":" + small[i]+"\t");
			}
		}

	}
}
