package cn.titaniume.base.chapter06.construcionmethod;

/*
类的组成：
	成员变量
	构造方法
	成员方法

给类的成员变量赋值有几种方式：
	A:setXxx()方法
	B:带参构造方法

练习：
	Phone:
		成员变量：brand,price,color
		构造方法：无参,带参
		成员方法：setXxx()/getXxx()
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
		System.out.println("姓名是："+name+",年龄是："+age);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		//无参+setXxx
		Students s1 = new Students();
		s1.setName("林青霞");
		s1.setAge(28);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("----------------------------");

		//带参
		Students s2 = new Students("王重阳",82);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
		
	}

}
