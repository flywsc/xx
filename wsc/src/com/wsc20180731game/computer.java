package com.wsc20180731game;

import java.util.Random;


public class computer {
   String computer_name1;
   String computer_name2;
   String computer_name3;
   String computer_chioce;
   int computer_score=0;  
   int computerChioce;
   public void computerShow() {
	   Random rd=new Random();
	   computerChioce=(rd.nextInt(3)+1);
	   if(computerChioce==1) {
       	System.out.println("计算机选择了剪刀");
       }else if(computerChioce==2) {
       	System.out.println("计算机选择了石头");
       }else if(computerChioce==3) {
       	System.out.println("计算机选择了布");
   }
   }
}
