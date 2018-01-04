package cn.titaniume.base.chapter04.methodoverload;

/**
 * 
 * @author titaniume
 * 方法重载：
 * 		在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * 		和返回值类型无关。
 * 2018年1月4日下午9:20:26
 */
public class MethodDemo {

	public static void main(String[] args) {
		//需求：请写一个功能，实现两个数据的求和
		System.out.println(sum(10, 20));
		//需求：请写一个功能，实现三个数据的求和
		System.out.println(sum(10, 20,30));
		System.out.println(sum(3,4,5));

	}
	
	public static int sum(int a, int b){	
		return a + b;
	}
	
	public static int sum(int a, int b,int c){	
		return a + b;
	}

}
