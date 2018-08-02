package com.www20180726canshuPRO;

import java.util.Scanner;

public class opearation {
    Scanner input=new Scanner(System.in);
     student[]st=new student[5];
  public void minu(){//菜单系统显示
	    	System.out.println("***************************");
	    	System.out.println();
	    	System.out.println("      欢迎进入学员管理系统     ");
	    	System.out.println();
	    	System.out.println("****************************");
	    	System.out.println("请选择你的操作   1.初始化   2.增加   3.删除   4.修改   5.查找   0.退出");
	    }
  
    public void chuShiHua(String name,int key,int weight,int height){//初始化成员
	   	for(int i=0;i<st.length;i++){
	    	student st1=new student();
	    	System.out.print("请输入姓名");
	    	st[i].name=input.next();
	    	System.out.print("请输入密码");
	    	st[i].key=input.next();
	    	System.out.print("请输入身高");
	    	st[i].height=input.next();
	    	System.out.print("请输入体重");
	    	st[i].weight=input.next();
	    
    	    System.out.println("是否继续   y ____n");
	    if("y".equals(input.next())){
	    	  continue;
	    }else{
	    	System.out.println("输入结束");
	    	break;
	    }	    	
	    	}
	    	 show(); 
    }
   public void strt(){
	  
	  
	   while(true){
			System.out.println("请输入你的选择");
			int chioce=input.nextInt();
			switch(chioce){//1.初始化   2.增加   3.删除   4.修改   5.查找			 
			case 1: 
				chuShiHua(null, chioce, chioce, chioce);
			    	System.out.println("请选择是否继续  y____n");
				
			case 2:
				add();
			case 3:
				delete();
			case 4:
				xiugai();
			case 5:
				check();
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
    public void check(){
    	System.out.print("请输入姓名");
        String	new_name=input.next();
    	    System.out.print("请输入密码");
    	    String new_key=input.next();  
    	    int index=-1;	
          	for(int k=0;k<st.length&&st[k]!=null;k++) {
    			if(new_name.equals(st[k].name)&&new_key.equals(st[k].key)) {
    				index=k;//记下k 的位置				
    				break;
    			}
    		}
    	    if(index!=-1) {
    	    	System.out.println("你输入的名字在第"+(index+1)+"找到");
    	    }else{
    	    	System.out.println("没有找到你输入的内容");
    	    } 		
    }
    public void xiugai() {//修改
     	System.out.print("请输入姓名");
        String	new_name=input.next();
    	    System.out.print("请输入密码");
    	    String new_key=input.next();   
      	int index=-1;	
      	for(int k=0;k<st.length&&st[k]!=null;k++) {
			if(new_name.equals(st[k].name)&&new_key.equals(st[k].key)) {
				index=k;//记下k 的位置				
				break;
			}
		}
	    if(index!=-1) {
	    	System.out.println("你输入的名字在第"+(index+1)+"找到");
	    	for(int k=0;k<st.length;k++) {
	    		System.out.print("请输入姓名");
		    	st[index].name=input.next();
		    	System.out.print("请输入密码");
		    	st[index].key=input.next();
		    	System.out.print("请输入身高");
		    	st[index].height=input.next();
		    	System.out.print("请输入体重");
		    	st[index].weight=input.next();
		    	System.out.println("是否继续   y ____n");
			    if("y".equals(input.next())){
			    	  	System.out.println("修改成功");
			    	  	continue;
			    }else{
			    	System.out.println("输入结束");
			    	break;
			    }
		    
	    	}	      
	    }else {
	    	System.out.println("没有找到你输入的内容");
	    }
	    show();    
    }
    public void delete() {//删除
      	System.out.print("请输入姓名");
        String	new_name=input.next();
    	    System.out.print("请输入密码");
    	    String new_key=input.next();   
      	int index=-1;	
      	for(int k=0;k<st.length&&st[k]!=null;k++) {
			if(new_name.equals(st[k].name)&&new_key.equals(st[k].key)) {
				index=k;//记下k 的位置				
				break;
			}
      	}
      	 if(index!=-1) {
      	 	for(int k=0;k<st.length;k++) {	    		
		    	st[index].name=null;		   
		    	st[index].key=null;		    	
		    	st[index].height=null;		    	
		    	st[index].weight=null;		    
		    	System.out.println("修改成功");
	    	}	      
      	}
      	show();    
    } 
    public void add(){//增加
    	System.out.print("请输入姓名");
      	int index=-1;	
      	for(int k=0;k<st.length&&st[k]!=null;k++) {
			if(st[k]!=null) {
				index=k;//记下k 的位置				
				break;
			}
		}
    	
      	if(index!=-1) {
	    	System.out.println("你输入的名字在第"+(index+1)+"找到");
	    	for(int k=0;k<st.length;k++) {
	    		System.out.print("请输入新姓名");
		    	st[index].name=input.next();
		    	System.out.print("请输入新密码");
		    	st[index].key=input.next();
		    	System.out.print("请输入新身高");
		    	st[index].height=input.next();
		    	System.out.print("请输入新体重");
		    	st[index].weight=input.next();
		    	System.out.println("修改成功");
		    	System.out.println("是否继续   y ____n");
			    if("y".equals(input.next())){
			    	  continue;
			    }else{
			    	System.out.println("输入结束");
			    	break;
			    } 
	    }
	    }else {
	    	System.out.println("没有找到你输入的内容");
    	}	   
      	show();    
    }
	public void show(){
	     	for(int i=0;i<st.length;i++) {
				if(st[i]==null) {
				continue;	
				}else
				System.out.println(st[i]);
			}
	        
	    	}
   
    	
    }

