package cn.titaniume.base.chapter07.inheritexecu;

/*
	猫：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()，catchMouse()
	狗：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()，lookDoor()
	测试类：
		main(String[] args):
*/
//猫类
class Cat1 {
	private String name;
	private int age;

	public Cat1() {}

	public Cat1(String name,int age) {
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
		System.out.println(name+"---"+age);
	}

	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
}
//狗类
class Dog1 {
	private String name;
	private int age;

	public Dog1() {}

	public Dog1(String name,int age) {
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
		System.out.println(name+"---"+age);
	}

	public void lookDoor() {
		System.out.println("狗可以看门");
	}
}
//测试类
class Test {
	public static void main(String[] args) {
		//猫类测试
		Cat1 c = new Cat1();
		c.setName("加菲猫");
		c.setAge(3);
		c.show();
		c.catchMouse();
		System.out.println("------------");
		Cat1 cc = new Cat1("tom猫",6);
		cc.show();
		cc.catchMouse();
		System.out.println("------------");

		//练习1：自己写出狗的测试
		Dog1 d = new Dog1();
		d.setName("啸天");
		d.setAge(5);
		d.show();
		d.lookDoor();
		System.out.println("------------");

		Dog1 dd = new Dog1("旺财",8);
		dd.show();
		dd.lookDoor();
	}
}

//练习2：请把猫狗案例改为继承的版本，自己分析，自己测试。等会讲