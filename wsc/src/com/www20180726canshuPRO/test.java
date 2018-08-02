package com.www20180726canshuPRO;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		opearation op=new opearation ();
		Scanner input=new Scanner (System.in);
		op.minu();
		System.out.println("请输入你的选择");
		int chioce=input.nextInt();
		while(true){
			switch(chioce){//1.初始化   2.增加   3.删除   4.修改   5.查找
			case 1: 
				for(int i=0;i<op.st.length;i++){
			    	student st1=new student();
			  
			    	System.out.print("请输入姓名");
			    op.st[i].name=input.next();
			    	System.out.print("请输入密码");
			    	op.st[i].key=input.next();
			    	System.out.print("请输入身高");
			    	op.st[i].height=input.next();
			    	System.out.print("请输入体重");
			    	op.st[i].weight=input.next();
			    	System.out.println("是否继续   y ____n");
			 	if("y".equals(input.next())){
			 	    	  continue;
			 	    }else{
			 	    	System.out.println("输入结束");
			 	    	break;
			 	    }	    	
				}
			case 2:
				op.add();
			case 3:
				op.delete();
			case 4:
				op.xiugai();
			case 5:
				 op.check();
					System.out.println("是否继续   y ____n");
				    if("y".equals(input.next())){				    	  
				    	break;
				    }else{
				    	System.out.println("自动返回上一层");
				    	break;
				    }
			case 0:
				break;
				default:
					System.out.println("输入出错");
					break;
			}break;
		}
	}
}
