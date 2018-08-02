package com.wsc20180731money;

public class atm {
      String user;//查看用户信息
      int inmoney;//这是存的钱
      int sum;//这是余额
      int outmoney;//这是取出去的钱
      String _exit;//推卡
   public void atm_check() {
	   System.out.println("您选择了查看个人主页");
	   System.out.println("余额有"+sum);
   } 
  public void atm_exit() {
	   System.out.println("您选择了退卡，谢谢使用");
   }
   public void sum() {
	  
	   System.out.println("您取出"+outmoney+"元");
	   System.out.println("余额有"+sum+"元");
   }
}

