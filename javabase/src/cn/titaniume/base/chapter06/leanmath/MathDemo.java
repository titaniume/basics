package cn.titaniume.base.chapter06.leanmath;


/**
 * ����ѧ�������
 * �ص㣺û�й��췽������Ϊ���ĳ�Ա���Ǿ�̬�ġ�
 * 
 * ����1����ȡ�����
 * 		public static double random():��ֵ���ڵ��� 0.0 ��С�� 1.0
 * ����2����ȡ1-100֮��������    
 * @author titaniume
 * 2018��1��6������3:06:53
 */
public class MathDemo {
	public static void main(String[] args) {
		
	//��ȡ�����
	double d = Math.random();
	System.out.println(d);
	
	for (int i = 0; i < 10; i++) {
		//System.out.println(Math.random());
		System.out.println(Math.random()*100);
	}
	
	//������λ�ȡ1-100֮����������?
	for (int i = 0; i < 100; i++) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
	}
	
	
	}
}
