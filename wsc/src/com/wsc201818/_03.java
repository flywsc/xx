package com.wsc201818;

import java.util.Random;

public class _03 {
	public static void main(String[] args) {

		Random rd = new Random();
		int suihi=rd.nextInt(12);
        int bools[]= {10,10,10,10,10,10,10,10,10,10,10,10};
        bools[suihi]=11;
        int left=bools[0]+bools[1]+bools[2]+bools[3]+bools[4];//左边分01234
        int right=bools[5]+bools[6]+bools[7]+bools[8]+bools[9];//右边分56789
      
        int left1=bools[0]+bools[1];//左边大就又分01
        int left2=bools[2]+bools[3];//右边大就又分23
        
        
        int right1=bools[5]+bools[6];//右边大就又分56
        int right2=bools[7]+bools[8];//右边大就又分78
        if(left>right) {
        	if(left1>left2) {
        		if(bools[0]>bools[1]) {
        			
                	System.out.println("产生的随机数为"+suihi+"bools[0]");
        		}
        		}else {
        			
                	System.out.println("产生的随机数为"+suihi+"bools[1]");
        		}
        
        		
        		
        	if(left1<left2) {
        		if(bools[2]>bools[3]) {
        			
                	System.out.println("产生的随机数为"+suihi+"bools[2]");		
        	   }else {
        		   System.out.println("产生的随机数为"+suihi+"bools[3]");	
        		   }
        	   }
        }else {//左边先比，不满足就输出4号位置
        	if(bools[11]>bools[10]) {
        	bools[11]=suihi;
        	System.out.println("产生的随机数为"+suihi+bools[11]);
        	}else {
        		bools[10]=suihi;
            	System.out.println("产生的随机数为"+suihi+bools[10]);
        	}
       
        }else if{
        	
        }
	
	}
}
