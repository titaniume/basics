package cn.titaniume.base.chapter05.classdefinition;

/*
	��һ������������
		ѧ�����
			���ԣ�ѧ�ţ�����������
			��Ϊ��ѧϰ���Է���˯��

	�ڶ�����������ת��Ϊ��
		ѧ���ࣺ
			��Ա������ѧ�ţ�����������
			��Ա������ѧϰ���Է���˯��

	��������������Ӣ������
		Student:
			��Ա������sid��name��age
			��Ա������study()��eat()��sleep()

	���Ĳ���д��������
		��Ա��������ʵ����һ��������ֻ�������������з����⣬����Ҳ���Բ�����ʼ��ֵ��
		��Ա��������ʵ����һ��������ֻ��������Ҫstatic�ˡ�

	��ϰ��
		�ֻ�
*/
//�����ҵ�ѧ����
class Student {
	//��Ա����
	//ѧ��
	String sid;
	//����
	String name;
	//����
	int age;

	//��Ա����
	//ѧϰ�ķ���
	public void study() {
		System.out.println("ѧ����ѧϰ");
	}

	//�Է��ķ���
	public void eat() {
		System.out.println("ѧ��Ҫ�Է�");
	}

	//˯���ķ���
	public void sleep() {
		System.out.println("ѧ����˯��");
	}
}