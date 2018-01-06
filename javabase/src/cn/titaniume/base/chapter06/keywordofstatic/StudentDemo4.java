package cn.titaniume.base.chapter06.keywordofstatic;

//��̬�������Ǳ����ж�����ģ��Ǿ�̬����ÿ���������еġ�
class Student1 {
	String name;
	int age;
	static String classNumber;

	public Student1(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public Student1(String name,int age,String classNumber) {
		this.name = name;
		this.age = age;
		this.classNumber = classNumber;
	}

	public void show() {
		System.out.println(name+"---"+age+"---"+classNumber);
	}
}

public class StudentDemo4 {

	public static void main(String[] args) {
		Student1 s1 = new Student1("����",28,"sgyy001");
		Student1 s2 = new Student1("С��",20);
		Student1 s3 = new Student1("����",18);

		s1.show();
		s2.show();
		s3.show();

		s2.name = "�ܲ�";
		s2.classNumber = "sgyy007";

		s1.show();
		s2.show();
		s3.show();

	}

}
