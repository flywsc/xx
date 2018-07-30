package com.wwwshangmain;

import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {

          System.out.println("请输入要打印的行数");
          Scanner rd=new Scanner(System.in);
          int sorce=rd.nextInt();
          int n=2*sorce-1;
          for(int i=0;i<=5;i++) {
        	  for(int j=0;j<i;j++) {
        		  System.out.print("");
         	  }
              for(int k=1;k<2*i-1;k++ ) {
            	  System.out.print("×");
              }
                  System.out.println("");       
          }
          
          
	
	}
}
