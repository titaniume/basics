package cn.titaniume.base.chapter07.inherit;

/**
 * ����
 * @author titaniume
 * 2018��1��6������8:00:18
 */
class Person{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name,int age){
		this.name =  name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void eat(){
		System.out.println("�Է�");
	}
	
	
	public void sleep(){
		System.out.println("˯��");
	}
}

/**
 * ѧ����
 * @author titaniume
 * 2018��1��6������8:01:56
 */
class Student extends Person{
	public Student(){}
	
	public Student(String name,int age){
		super(name, age);  //ʹ�ø�����вι��췽��
	}
}


/**
 * ��ʦ��
 * @author titaniume
 * 2018��1��6������8:04:38
 */
class Teacher extends Person{
	
}




public class ExtendsDemo5 {

	public static void main(String[] args) {
		//ѧ����
		Student stu  = new Student();
		stu.setName("����");
		stu.setAge(18);
		System.out.println(stu.getName()+"-----"+stu.getAge());
		stu.eat();
		stu.sleep();
		
		System.out.println("----------------");
		
		Student stu2  = new Student("����",19);
		System.out.println(stu2.getName()+"-----"+stu2.getAge());
		stu2.eat();
		stu2.sleep();
		
		System.out.println("----------------");
		
		//��ʦ��
		Teacher t  = new Teacher();
		t.setName("����ʦ");
		t.setAge(25);
		System.out.println(t.getName()+"-----"+t.getAge());
		t.eat();
		t.sleep();
	}

}
