package com.wsc201821;

public class _16 {
	public static void main(String[] args) {
      //�ж�֮�ַ����Ƿ����
		String in="8888888888888888888B8888888888888888888888";
	    boolean in1=in.contains("B");//�ж��Ƿ����
	    boolean in2=in.contains("D");
	    
	    System.out.println(in1);
	    System.out.println(in2);
	    //��������һ���ڵڼ�λ
	    int out=in.indexOf("B");
	    System.out.println("�������ڵ�"+(out+1)+"λ");
	}
}
