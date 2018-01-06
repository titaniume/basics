package cn.titaniume.base.chapter07.inherit;

/**
 * 人类
 * @author titaniume
 * 2018年1月6日下午8:00:18
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
		System.out.println("吃饭");
	}
	
	
	public void sleep(){
		System.out.println("睡觉");
	}
}

/**
 * 学生类
 * @author titaniume
 * 2018年1月6日下午8:01:56
 */
class Student extends Person{
	public Student(){}
	
	public Student(String name,int age){
		super(name, age);  //使用父类的有参构造方法
	}
}


/**
 * 老师类
 * @author titaniume
 * 2018年1月6日下午8:04:38
 */
class Teacher extends Person{
	
}




public class ExtendsDemo5 {

	public static void main(String[] args) {
		//学生类
		Student stu  = new Student();
		stu.setName("张三");
		stu.setAge(18);
		System.out.println(stu.getName()+"-----"+stu.getAge());
		stu.eat();
		stu.sleep();
		
		System.out.println("----------------");
		
		Student stu2  = new Student("李四",19);
		System.out.println(stu2.getName()+"-----"+stu2.getAge());
		stu2.eat();
		stu2.sleep();
		
		System.out.println("----------------");
		
		//老师类
		Teacher t  = new Teacher();
		t.setName("梦老师");
		t.setAge(25);
		System.out.println(t.getName()+"-----"+t.getAge());
		t.eat();
		t.sleep();
	}

}
