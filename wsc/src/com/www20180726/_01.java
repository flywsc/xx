package com.www20180726;
//创建一个水杯
public class _01 {
           //定义属性
	public  String color;
	public String size;
	public String material;//材料
	  
	  public void drink() {
	   //喝水
	  System.out.println("我调用了“喝水这一方法");
	  }

      public void decorate() {
       //装饰    	  
    	  System.out.println("我调用了装饰这一方法");
      }
     public void shuibei() {
    	 System.out.println("这个水杯是"+color+",有"+size+"寸"+",用"+material+"做成的");
     }
}
