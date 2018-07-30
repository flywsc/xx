package com.www20180726;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
        
		 Scanner sc=new Scanner(System.in);
		 youke persion=new  youke();
		 System.out.print("请输入你的名字");
		  persion.name=sc.next(); 
		  System.out.print("如果继续请输入你的年龄");
		  persion.age=sc.nextInt();		   
		
		  if(persion.age>5) {
			  persion.shuchu();
		  }else {
			  persion.shuchu1(); 
		  }
		   System.out.println("是否继续，y_n");
		   persion.chioce=sc.next();
		   if(persion.equals(persion.chioce)) {
			  persion.tuichu();
		  }else {
			  System.out.println("请继续");
		  }
		  
		  
	}
}
