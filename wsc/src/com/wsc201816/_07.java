package com.wsc201816;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input=new Scanner(System.in);

//		int a=0;
//		int cols=2*a-1;
//		int b=a-1;
//		for(int i=0;i<a;i++){
//			System.out.print("\t\t");
//			for(int j=0;j<cols;j++){
//				if(j>=b-i&&j<=b+i){
//					System.out.print("*");
//				}else{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		
//		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= 3-i; j++) {
			System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
			System.out.print("* ");
			}
			System.out.println(" ");
			}
			
//		for( int a=0;a<=5;a++) {
//			for(int b=0;b<=2*(a-1);b++) {
//				System.out.print("");
//				for(int c=0;c<=2*b-1;b++) {
//					System.out.print(c);
//				}
//					
//			}
//		}
			
	}

}
