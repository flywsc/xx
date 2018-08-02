package com.www20180726duixiangShuZhu;

public class higth {

	public float avg(student[] st) {
		float avg = 0;// 用于计算平局值
		float sum = 0;// 用于计算总数
		for (int i = 0; i < st.length; i++) {
			sum += st[i].height;
		}
		return sum / st.length;// 返回平均值
	}
}
