package com.wsc20180731money;

public class people {
    atm at=new atm();
	public void  user() {
      at.sum=at.inmoney-at.outmoney;
      at.atm_check();  
     }
    public void inmoney() {
    	System.out.println("你选择了存钱");
    	
    }

    public void outmoney() {
    	System.out.println("你选择了取钱");
    }
}
