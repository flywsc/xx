package com.www20180726duixiang;

public class score {
  public float getAvg(studet st) {//这里是直接把一个对象作为参数传进去
	  float avg=(st.java+st.c+st.html)/3;//整形可以直接转为浮点型，如果是小数就要加f
	  return avg; 
  }
}
