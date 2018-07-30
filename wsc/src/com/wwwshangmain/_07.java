package com.wwwshangmain;

import java.util.Random;
import java.util.Scanner;

public class _07 {
           public static void main(String[] args) {
            System.out.println("请输入要打印的行数");   
	       String paixu[]= {"a","b","c","g","j","a,","s","h","s","f","k","l"};
	       Random rd=new Random();
	       Scanner input=new Scanner(System.in);
           int in=input.nextInt();
           /*
           for(int i=0;i<in;i++) {
        	   for(int j=0;j<=i;j++) {
        		   System.out.print("*");
        	   }
           System.out.println();
           }
*/

           for(int i=0;i<=in;i++) {
        	   for(int j=0;j<2*i+1;j++) {
        		   System.out.print("*");
        	   }
           System.out.println();
           }
           }
}
