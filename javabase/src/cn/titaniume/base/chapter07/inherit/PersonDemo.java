package cn.titaniume.base.chapter07.inherit;
/*
学生类和老师。定义两个功能(吃饭，睡觉)

学生类：
	成员变量：姓名，年龄
	成员方法：getXxx()/setXxx(),eat(),sleep()
老师类：
	成员变量：姓名，年龄
	成员方法：getXxx()/setXxx(),eat(),sleep()

提取出共性的东西定义到一个类中：
人类：
	成员变量：姓名，年龄
	成员方法：getXxx()/setXxx(),eat(),sleep()

学生类 继承 人类
老师类 继承 人类

继承的好处：
	A:提高了代码的复用性
	B:提高了代码的维护性
	C:让类与类之间产生了关系，是多态的前提

继承的弊端：类的耦合性很强
	设计原则：低耦合，高内聚。
	耦合：类与类的关系。
	内聚：自己完成事情的能力。
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
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}
}

//学生类
class Student1 extends Person1  {
	public Student1() {}

	/*
	public Student1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	*/
}

//老师类
class Teacher1 extends Person1 {
}


public class PersonDemo {

	public static void main(String[] args) {
		//学生类
		Student1 s = new Student1();
		s.setName("张三");
		s.setAge(18);
		System.out.println(s.getName()+"---"+s.getAge());
		s.eat();
		s.sleep();
		System.out.println("--------------------------");

		//老师类
		Teacher1 t = new Teacher1();
		t.setName("王祖蓝");
		t.setAge(25);
		System.out.println(t.getName()+"---"+t.getAge());
		t.eat();
		t.sleep();

	}

}
