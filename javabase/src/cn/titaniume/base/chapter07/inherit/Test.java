package cn.titaniume.base.chapter07.inherit;
/*
	ѧ�������ʦ��������������(�Է���˯��)
*/
//ѧ����
class Student2 {
	private String name;
	private int age;

	public Student2() {}

	public Student2(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}
//��ʦ��
class Teacher2 {
	private String name;
	private int age;

	public Teacher2() {}

	public Teacher2(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}
//������
class Test {
	public static void main(String[] args) {
		//����ѧ��
		Student2 s = new Student2();
		s.setName("����ϼ");
		s.setAge(28);
		System.out.println(s.getName()+"---"+s.getAge());
		s.eat();
		s.sleep();
		System.out.println("-------------------------");

		Student2 s2 = new Student2("������",18);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.eat();
		s2.sleep();
		System.out.println("-------------------------");

		//������ʦ
		Teacher2 t = new Teacher2();
		t.setName("������");
		t.setAge(31);
		System.out.println(t.getName()+"---"+t.getAge());
		t.eat();
		t.sleep();
		System.out.println("-------------------------");

		Teacher2 t2 = new Teacher2("�����",21);
		System.out.println(t2.getName()+"---"+t2.getAge());
		t2.eat();
		t2.sleep();
	}
}