package cn.titaniume.base.chapter05.paramproblems;
/*
	��������û�����ֵĶ���

	ʹ�ó�����
		A:���÷���,�÷���������ʹ��һ�ε�ʱ�����á�
		B:��Ϊʵ�ʲ�������
*/

//����ѧ���࣬дһ��love����
class Student  {
	public void love() {
		System.out.println("ѧ��ϲ���ż�");
	}
}

class StudentDemo {
	public void test(Student s) {
		s.love();
	}
}

//������
class NoNameObject {
	public static void main(String[] args) {
		/*
		//��������
		StudentDemo s = new StudentDemo();
		s.love();
		s.love();

		//��������
		new StudentDemo().love();
		new StudentDemo().love();
		*/

		//�����ֵ����
		//StudentDemo sd = new StudentDemo();
		//StudentDemo s = new StudentDemo();
		//sd.test(s);

		//û�����ֵ����
		//StudentDemo sd = new StudentDemo();
		//sd.test(new StudentDemo());

		//��������һ��
		new StudentDemo().test(new Student());
	}
}