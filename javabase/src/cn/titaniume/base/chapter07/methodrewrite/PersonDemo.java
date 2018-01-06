package cn.titaniume.base.chapter07.methodrewrite;


/*
������дע�����
	A:������˽�з������ܱ���д
	B:������д���෽��ʱ������Ȩ�޲��ܸ���
		����һ�����ɡ�
	C:���ྲ̬����������Ҳ����ͨ����̬����������д��
*/
class Person{
	
	public Person(){
		System.out.println("person");
	}
	
	public void show(){
		System.out.println("show Person");
	}
	protected void show2() {
		System.out.println("show2 person");
	}

	public void show3() {
		System.out.println("show3 person");
	}

	public static void show4() {
		System.out.println("show4 person");
	}

}

class Student extends Person{
	
	@Override
	public void show() {
		System.out.println("show student");
	}

	public void show2() {
		System.out.println("show2 student");
	}

	public void show3() {
		System.out.println("show3 student");
	}

	public static void show4() {
		System.out.println("show4 student");
	}
}

public class PersonDemo {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.show2();
		s.show3();
		s.show4();
	}

}
