package cn.titaniume.base.chapter05.encapsulation;

/*
 private��Ӧ�ó�����
 a:�ѳ�Ա������˽�л�
 b:�����ṩ������getXxx()��setXxx()����
 */
class Student1 {
	private String name;
	private int age;

	// ���name����get��set����
	public void setName(String n) {
		// ������������ʵҲ�ǿ��Զ�name��һЩ�жϵ�
		name = n;
	}

	public String getName() {
		return name;
	}

	// ���age����get��set
	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}
}

public class StudentDemo2 {
	public static void main(String[] args) {
		// ��������
		Student1 s = new Student1();
		// �����Ա������ֵ
		System.out.println(s.getName() + "---" + s.getAge());

		// ����Ա������ֵ
		s.setName("����ϼ");
		s.setAge(28);

		// �ٴ������Ա������ֵ
		System.out.println(s.getName() + "---" + s.getAge());
	}
}
