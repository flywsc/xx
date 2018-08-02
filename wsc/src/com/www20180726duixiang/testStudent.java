package com.www20180726duixiang;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub       
		studet st=new studet();
        score sc=new score();
        st.c=80;
        st.html=85;
        st.java=90;
        System.out.println("学生平局成绩是"+   sc.getAvg(st));//实例化的对象来调用它的方法，最后把参数传给他		
	}

}
