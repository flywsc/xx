package com.wsc201818;

import java.util.Random;

public class _03 {
	public static void main(String[] args) {

		Random rd = new Random();
		int suihi=rd.nextInt(12);
        int bools[]= {10,10,10,10,10,10,10,10,10,10,10,10};
        bools[suihi]=11;
        int left=bools[0]+bools[1]+bools[2]+bools[3]+bools[4];//��߷�01234
        int right=bools[5]+bools[6]+bools[7]+bools[8]+bools[9];//�ұ߷�56789
      
        int left1=bools[0]+bools[1];//��ߴ���ַ�01
        int left2=bools[2]+bools[3];//�ұߴ���ַ�23
        
        
        int right1=bools[5]+bools[6];//�ұߴ���ַ�56
        int right2=bools[7]+bools[8];//�ұߴ���ַ�78
        if(left>right) {
        	if(left1>left2) {
        		if(bools[0]>bools[1]) {
        			
                	System.out.println("�����������Ϊ"+suihi+"bools[0]");
        		}
        		}else {
        			
                	System.out.println("�����������Ϊ"+suihi+"bools[1]");
        		}
        
        		
        		
        	if(left1<left2) {
        		if(bools[2]>bools[3]) {
        			
                	System.out.println("�����������Ϊ"+suihi+"bools[2]");		
        	   }else {
        		   System.out.println("�����������Ϊ"+suihi+"bools[3]");	
        		   }
        	   }
        }else {//����ȱȣ�����������4��λ��
        	if(bools[11]>bools[10]) {
        	bools[11]=suihi;
        	System.out.println("�����������Ϊ"+suihi+bools[11]);
        	}else {
        		bools[10]=suihi;
            	System.out.println("�����������Ϊ"+suihi+bools[10]);
        	}
       
        }else if{
        	
        }
	
	}
}
