package com.wsc20180730;
public class menu {
	int chioce;
	int chioce2;
	private int chioce3;
   public void menu1() {
	   System.out.println("欢迎使用我行我素购物管理系统");
	   System.out.println("\t1.登录系统");
	   System.out.println("\t2.退出");
	   System.out.println("********************");
    
   }
   public void menu2() {
	   System.out.println("我行我素购物管理系统主菜单");
	   System.out.println("******************");
	   System.out.println("\t1.客户信息管理");
	   System.out.println("\t2.真情回馈");
	   System.out.println("******************");
       
   }
  public void menu3() {
	  System.out.println("我行我素管理购物系统>真情回馈");
	  System.out.println("********************");
	  System.out.println("\t1.幸运大放送");
	  System.out.println("\t2.幸运抽奖");
  }
  
  public int ch0() {	   
	  System.out.println("首页");
	  return 0;
	  
	  }
	
  public int ch1() {
		  System.out.println("返回上一层");
		  return 1;
	  
	 
  }
  public int ch2() {
	  System.out.println("返回最后一层");
	  return 2;
  }
}

