package cn.titaniume.base.chapter06.objpractice.sumcase;


/**
 * ���������ʱ��ΧԽСԽ��
 * @author titaniume
 * 2018��1��6������1:40:19
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
		System.out.println("�����:"+sum);
	}
}
