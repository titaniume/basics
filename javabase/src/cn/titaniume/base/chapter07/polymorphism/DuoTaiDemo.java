package cn.titaniume.base.chapter07.polymorphism;

/*
	��̬��ͬһ�������ڲ�ͬʱ�̱��ֳ��ֵĲ�ͬ״̬��

	������
		A:ˮ(ˮ������ˮ����)

		B:è�Ͷ��
			���ұߵ�ֵ��ֵ����ߣ�����ܶ�ͨ������˵�����ԡ�
			���� d = new ����();
			���� dd = new è();
			è m = new è();
			è mm = new ����();  ����

			���� dd = new è();

	�������������?
		A:�м̳й�ϵ	
		B:�з�����д	
		C:�и�������ָ���������
*/
class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		//DuoTaiDemo a = new DuoTaiDemo();
		//Dog d = new Dog();

		//��̬
		Animal a = new Dog();
	}
}