package cn.titaniume.base.chapter08.classofabstra;



/*
������ĳ�Ա�ص㣺
	A:��Ա����
		�����Ǳ�����Ҳ�����ǳ���
	B:���췽��
		�й��췽�������ǲ���ʵ������
		���⣺���췽����ʲô����?
			����������ʸ������ݵĳ�ʼ��
	C:��Ա����
		�����г��󷽷���Ҳ�����зǳ��󷽷���
		���󷽷���ǿ��Ҫ��������ĳЩ���顣
		�ǳ��󷽷������ڸ�����ֱ��ʹ�ã�����˴���ĸ����ԡ�
*/

abstract class Animal1 {
	int num = 10;
	final int num2 = 20;

	public Animal1() {}

	public void method() {
		System.out.println("method");
	}

	public abstract void function();
}

class Dog1 extends Animal1  {
	public void show() {
		num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
	}

	public void function() {}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.show();

	}

}
