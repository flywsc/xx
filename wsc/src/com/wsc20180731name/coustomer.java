package com.wsc20180731name;

public class coustomer {
    
	String []names=new String[5];
	public void add_name( String newname) {
		for(int i=0;i<names.length;i++) {
			if(names[i]==null) {
				names[i]=newname;
				break;
			}
		}
	}
	public void show() {
		for(int i=0;i<names.length;i++) {
			if(names[i]==null) {
			break;	
			}
			System.out.println(names[i]);
		}
	}
	public void xiugai(String _old,String _new) {
	    int index=-1;
		for(int k=0;k<names.length&&names[k]!=null;k++) {
			if(_old.endsWith(names[k])) {
				index=k;
				break;
			}
		}
	    if(index!=-1) {
	    	System.out.println("你输入的名字在第"+(index+1)+"找到");
	    	names[index]=_new;
	    	System.out.println("修改后的用户");
	    	show();
	    }else {
	    	System.out.println("没有找到你输入的内容");
	    }
	}
    public void shanchu(String _old1) {
    	int index1=-1;//这一步就是找到要删除人名字的位置
		for(int k=0;k<names.length&&names[k]!=null;k++) {
			if(_old1.endsWith(names[k])) {
				index1=k;
				break;
			}
		}
		if(index1!=-1) {//判断进入循环没有
	    	System.out.println("你输入的名字在第"+(index1+1)+"找到");
	    	names[index1]=null;
	    	System.out.println("修改后的用户");
	    	for(int i=0;i<names.length;i++) {
				if(names[i]==null) {
				continue;	
				}
				System.out.println(names[i]);
			}
	    }else {
	    	System.out.println("没有找到你输入的内容");
	    }
	}
    
}

