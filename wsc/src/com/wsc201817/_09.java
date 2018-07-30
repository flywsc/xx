package com.wsc201817;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	    double []scors=new double[5];
	    for(int i=0;i<scors.length;i++) {
	    	System.out.println("ÇëÊäÈëµÚ"+(i+1)+"Êý×Ö"); 
	    	scors[i]=input.nextDouble();	 
	    }
	    int  sum=0;
	    for(int i=0;i<scors.length;i++) {
	    	for( int j=0;j<scors.length-1;j++) {
	    		if(scors[j]<scors[sum]) {
	    			sum=j;
	    		}
	    	}
	    int temp=scors(scors.[length-1]);
	  System.out.println(scors);
	    }
	}

}
