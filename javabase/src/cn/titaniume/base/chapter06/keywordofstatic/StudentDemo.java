package cn.titaniume.base.chapter06.keywordofstatic;

/*
�༶���Ӧ���Ǳ��༶ÿ���˶�����ģ����Զ���һ����Ӧ�ÿ����ˡ�
�����������䣬ÿ����Ӧ���ǲ�һ���ģ����ԣ�ÿ�����󣬶�Ӧ�ö����Լ��ġ�

��java�У���ʲô����ʾ��Ա�����Ǳ��������? static
*/
class Student{
	//����
	String name;
	//����
	int age;
	//�༶���
	//String classNumber;
	static String classNumber;

	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name,int age,String classNumber) {
		this.name = name;
		this.age = age;
		this.classNumber = classNumber;
	}

	public void show() {
		System.out.println(name+"---"+age+"---"+classNumber);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		//����ѧ������
		Student s1 = new Student("����ϼ",28,"20150306");
		s1.show();

		/*
		StudentDemo s2 = new StudentDemo("����",35,"20150306");
		s2.show();

		StudentDemo s3 = new StudentDemo("����",33,"20150306");
		s3.show();
		*/
		Student s2 = new Student("����",35);
		s2.show();

		Student s3 = new Student("����",33);
		s3.show();

	}

}
