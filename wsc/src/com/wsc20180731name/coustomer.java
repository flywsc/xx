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
	    	System.out.println("������������ڵ�"+(index+1)+"�ҵ�");
	    	names[index]=_new;
	    	System.out.println("�޸ĺ���û�");
	    	show();
	    }else {
	    	System.out.println("û���ҵ������������");
	    }
	}
    public void shanchu(String _old1) {
    	int index1=-1;//��һ�������ҵ�Ҫɾ�������ֵ�λ��
		for(int k=0;k<names.length&&names[k]!=null;k++) {
			if(_old1.endsWith(names[k])) {
				index1=k;
				break;
			}
		}
		if(index1!=-1) {//�жϽ���ѭ��û��
	    	System.out.println("������������ڵ�"+(index1+1)+"�ҵ�");
	    	names[index1]=null;
	    	System.out.println("�޸ĺ���û�");
	    	for(int i=0;i<names.length;i++) {
				if(names[i]==null) {
				continue;	
				}
				System.out.println(names[i]);
			}
	    }else {
	    	System.out.println("û���ҵ������������");
	    }
	}
    
}

