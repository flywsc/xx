package com.wsc20180730;

public class demo {
    String name;
    public void show() {
    	String name="�ֲ������ĸ��Ǽ���this�ؼ���";
    	System.out.println(name);
    }
    public void show1() {
    	String name=this.name;
    	System.out.println(name);
    }
}
