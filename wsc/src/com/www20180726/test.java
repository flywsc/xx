package com.www20180726;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
        
		 Scanner sc=new Scanner(System.in);
		 youke persion=new  youke();
		 System.out.print("�������������");
		  persion.name=sc.next(); 
		  System.out.print("��������������������");
		  persion.age=sc.nextInt();		   
		
		  if(persion.age>5) {
			  persion.shuchu();
		  }else {
			  persion.shuchu1(); 
		  }
		   System.out.println("�Ƿ������y_n");
		   persion.chioce=sc.next();
		   if(persion.equals(persion.chioce)) {
			  persion.tuichu();
		  }else {
			  System.out.println("�����");
		  }
		  
		  
	}
}
