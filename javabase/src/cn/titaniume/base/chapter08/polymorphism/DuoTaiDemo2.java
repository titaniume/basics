package cn.titaniume.base.chapter08.polymorphism;

/*
	��η����������й�����?
		A:����������󼴿ɡ�
		B:��̬��ת������
			����ת��
				���ӵ���
				��������ָ���������
			����ת��
				�Ӹ�����
				��������תΪ�������

	����װ������

		���ӣ�����():������,����Ϸ():������,age:20
		���ӵ�������():JavaSE��age:40

		//��̬
		���ӵ� k�� = new ����(); //Android�ܻ𣬶�JavaSE��Android����������JavaSE�ܻ�
								 //��̫æ������װ��ȥ���Ρ�ճ��С���ӣ������۾�������ת��
		System.out.println(k��.age); //40
		k��.����(); //������
		//k��.����Ϸ(); //����

		//�ؼ���
		���� k = (����)k��; //ȥ��С���ӣ�ȥ���۾�������ת��
		System.out.println(k.age); //20
		k.����(); //������
		k.����Ϸ();
*/
class  Animal1 {
	public void eat(){}
}

class Dog1 extends Animal1 {
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
	
	public void help() {
		System.out.println("�����԰�����������ץС͵");
	}
}

class Cat1 extends Animal1 {
		public void eat(){
			System.out.println("è������");
		}
}

class DuoTaiDemo2 {
	public static void main(String[] args) {
		//��̬
		Animal1 a = new Dog1();	//����ת��
		a.eat();
		//a.help(); //���뿴���

		//����ת��
		Dog1 d = (Dog1)a;
		d.eat();
		d.help();
		System.out.println("-------------");

		//�ᱨ����?
		a = new Cat1(); ////����ת��
		a.eat();

		Cat1 c = (Cat1)a;
		c.eat();

		//Dog dd = (Dog)a; //ClassCastException
		//dd.eat();
		//dd.help();
	}
}