package cn.titaniume.base.chapter03.loopstatementfor;

/**
 * 5的阶乘 
 * 	n! = n*(n-1)*(n-2)*...*3*2*1
 * n! = n*(n-1)!
 * @author titaniume
 *下午2:38:132018年1月4日
 */
public class ForDemo3 {

	public static void main(String[] args) {
		//定义累乘变量
		int jc = 1;
		for (int i = 1; i <=5; i++) {
			jc *=i;
		}
		System.out.println("5的阶乘是："+jc);

	}

}
