package cn.titaniume.base.chapter06.codeblock;

/*
 ִ�й��̣���̬����� --> �������� --> ���췽�� --> �ֲ������

 ��̬����飺ִֻ��һ�Ρ�
 �������⣺ÿ�δ�������ִ�С�
 */
class Student {
	static {
		System.out.println("��̬�����1");
	}

	{
		System.out.println("��������1");
	}

	public Student() {
		{
			System.out.println("���췽��");
		}
	}

	static {
		System.out.println("��̬�����2");
	}

	{
		System.out.println("��������2");
	}
}

public class CodeTest {

	public static void main(String[] args) {
		Student s = new Student();
		Student ss = new Student();

	}

}
