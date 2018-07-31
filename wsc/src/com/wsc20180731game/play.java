package com.wsc20180731game;

import java.util.Scanner;

public class play {
    String  play_name;
    int play_score=0;
     Scanner input=new Scanner(System.in);
    int playChioce;
    public void playShow() {
    	
    	System.out.println("请出拳   1.剪刀     2.石头     3.布"     );
    	playChioce=input.nextInt();
        if(playChioce==1) {
        	System.out.println("您选择了剪刀");
        }else if(playChioce==2) {
        	System.out.println("您选择了石头");
        }else if(playChioce==3) {
        	System.out.println("您选择了布");
    }
    }
}
