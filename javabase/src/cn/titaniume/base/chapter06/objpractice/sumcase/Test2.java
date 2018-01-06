package cn.titaniume.base.chapter06.objpractice.sumcase;


/**
 * 定义变量的时候范围越小越好
 * @author titaniume
 * 2018年1月6日下午1:40:19
 */
class Demos{
	public int sum(int x,int y){
		return x + y;
	}
}

public class Test2 {
	
	public static void main(String[] args) {
		Demos  demos = new Demos();
		int sum = demos.sum(12, 18);
		System.out.println("结果是:"+sum);
	}
}
