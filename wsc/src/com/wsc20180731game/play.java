package com.wsc20180731game;

import java.util.Scanner;

public class play {
    String  play_name;
    int play_score=0;
     Scanner input=new Scanner(System.in);
    int playChioce;
    public void playShow() {
    	
    	System.out.println("���ȭ   1.����     2.ʯͷ     3.��"     );
    	playChioce=input.nextInt();
        if(playChioce==1) {
        	System.out.println("��ѡ���˼���");
        }else if(playChioce==2) {
        	System.out.println("��ѡ����ʯͷ");
        }else if(playChioce==3) {
        	System.out.println("��ѡ���˲�");
    }
    }
}
