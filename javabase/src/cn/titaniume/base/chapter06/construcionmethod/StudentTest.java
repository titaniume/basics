package cn.titaniume.base.chapter06.construcionmethod;

/*
�����ɣ�
	��Ա����
	���췽��
	��Ա����

����ĳ�Ա������ֵ�м��ַ�ʽ��
	A:setXxx()����
	B:���ι��췽��

��ϰ��
	Phone:
		��Ա������brand,price,color
		���췽�����޲�,����
		��Ա������setXxx()/getXxx()
				  show()

	PhoneTest:
		main
*/
class Students{
	
	private String name;
	private int age;

	public Students() {}

	public Students(String name,int age) {
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

	public void show() {
		System.out.println("�����ǣ�"+name+",�����ǣ�"+age);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		//�޲�+setXxx
		Students s1 = new Students();
		s1.setName("����ϼ");
		s1.setAge(28);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("----------------------------");

		//����
		Students s2 = new Students("������",82);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
		
	}

}
