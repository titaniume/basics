package cn.titaniume.base.chapter06.leanmath;


/**
 * 做数学运算的类
 * 特点：没有构造方法，因为它的成员都是静态的。
 * 
 * 需求1：获取随机数
 * 		public static double random():该值大于等于 0.0 且小于 1.0
 * 需求2：获取1-100之间的随机数    
 * @author titaniume
 * 2018年1月6日下午3:06:53
 */
public class MathDemo {
	public static void main(String[] args) {
		
	//获取随机数
	double d = Math.random();
	System.out.println(d);
	
	for (int i = 0; i < 10; i++) {
		//System.out.println(Math.random());
		System.out.println(Math.random()*100);
	}
	
	//我们如何获取1-100之间的随机数呢?
	for (int i = 0; i < 100; i++) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
	}
	
	
	}
}
