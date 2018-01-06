package cn.titaniume.base.chapter07.inherit;
/*
ѧ�������ʦ��������������(�Է���˯��)

ѧ���ࣺ
	��Ա����������������
	��Ա������getXxx()/setXxx(),eat(),sleep()
��ʦ�ࣺ
	��Ա����������������
	��Ա������getXxx()/setXxx(),eat(),sleep()

��ȡ�����ԵĶ������嵽һ�����У�
���ࣺ
	��Ա����������������
	��Ա������getXxx()/setXxx(),eat(),sleep()

ѧ���� �̳� ����
��ʦ�� �̳� ����

�̳еĺô���
	A:����˴���ĸ�����
	B:����˴����ά����
	C:��������֮������˹�ϵ���Ƕ�̬��ǰ��

�̳еı׶ˣ��������Ժ�ǿ
	���ԭ�򣺵���ϣ����ھۡ�
	��ϣ�������Ĺ�ϵ��
	�ھۣ��Լ���������������
*/

class Person1{
	private String name;
	private int age;
	
	public Person1(){}
	public Person1(String nane,int age){
		this.name= name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}

//ѧ����
class Student1 extends Person1  {
	public Student1() {}

	/*
	public Student1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	*/
}

//��ʦ��
class Teacher1 extends Person1 {
}


public class PersonDemo {

	public static void main(String[] args) {
		//ѧ����
		Student1 s = new Student1();
		s.setName("����");
		s.setAge(18);
		System.out.println(s.getName()+"---"+s.getAge());
		s.eat();
		s.sleep();
		System.out.println("--------------------------");

		//��ʦ��
		Teacher1 t = new Teacher1();
		t.setName("������");
		t.setAge(25);
		System.out.println(t.getName()+"---"+t.getAge());
		t.eat();
		t.sleep();

	}

}
