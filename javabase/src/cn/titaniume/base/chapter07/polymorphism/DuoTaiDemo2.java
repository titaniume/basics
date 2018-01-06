package cn.titaniume.base.chapter07.polymorphism;

/*
	��̬�ĳ�Ա�����ص㣺
		A:��Ա����
			���뿴��ߣ����п���ߡ�
		B:��Ա����
			���뿴��ߣ����п��ұߡ�

			Ϊʲô��?
				��Ϊ��Ա��������д��������û�С�
		C:��̬����
			���뿴��ߣ����п���ߡ�

			��̬������ʵû����д��һ˵����Ϊ���Ǹ�����ء�
*/
class Animal1 {
	public int age = 40;

	
	public void show() {
		System.out.println("show animal");
	}
	
	public static void method() {
		System.out.println("method animal");
	}
}

class Dog1 extends Animal1 {
	public int age = 20;

	public void show() {
		System.out.println("show dog");
	}

	public static void method() {
		System.out.println("method dog");
	}
}

class DuoTaiDemo2 {
	public static void main(String[] args) {
		//��̬
		Animal1 a = new Dog1();
		System.out.println(a.age);
		//System.out.println(a.num);
		a.show();

		a.method();
	}
}
