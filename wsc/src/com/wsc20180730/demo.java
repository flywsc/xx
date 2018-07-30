package com.wsc20180730;

public class demo {
    String name;
    public void show() {
    	String name="局部变量的覆盖加了this关键字";
    	System.out.println(name);
    }
    public void show1() {
    	String name=this.name;
    	System.out.println(name);
    }
}
