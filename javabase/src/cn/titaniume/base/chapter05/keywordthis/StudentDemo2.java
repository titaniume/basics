package cn.titaniume.base.chapter05.keywordthis;

class Student2 {
	// ����
	private String name;
	// ����
	private int age;

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

	// ��ʾ������г�Ա�����ķ���
	public void show() {
		System.out.println("�����ǣ�" + name + ",�����ǣ�" + age);
	}
}

public class StudentDemo2 {
	public static void main(String[] args) {
		// ��������
		Student2 s = new Student2();

		// ʹ�ó�Ա����
		s.show();

		// ����Ա������ֵ
		s.setName("����ϼ");
		s.setAge(28);

		// �ٴ�ʹ�ó�Ա����
		s.show();

		System.out.println("�����ǣ�" + s.getName() + ",�����ǣ�" + s.getAge());
	}
}
