package cn.titaniume.base.chapter04.methodoverload;

/**
 * 
 * @author titaniume
 * �������أ�
 * 		��ͬһ�����У��������һ�����ϵ�ͬ��������ֻҪ���ǵĲ����������߲������Ͳ�ͬ���ɡ�
 * 		�ͷ���ֵ�����޹ء�
 * 2018��1��4������9:20:26
 */
public class MethodDemo {

	public static void main(String[] args) {
		//������дһ�����ܣ�ʵ���������ݵ����
		System.out.println(sum(10, 20));
		//������дһ�����ܣ�ʵ���������ݵ����
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
