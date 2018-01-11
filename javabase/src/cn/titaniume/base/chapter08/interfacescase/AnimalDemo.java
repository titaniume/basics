package cn.titaniume.base.chapter08.interfacescase;
/*
我们在做一个程序设计的时候，请从具体的开始分析，看有哪些共性的内容，不断的向上抽取。
分析的过程：从具体到抽象。
实现的过程：从抽象到具体。
使用的时候：使用的是具体的对象。

猫狗案例,加入跳高的额外功能

运动员：(接口)
	成员方法：跳高。

猫：(具体类)
	成员变量：姓名，年龄
	构造方法：无参，带参
	成员方法：getXxx()/setXxx，吃饭，睡觉

狗：(具体类)
	成员变量：姓名，年龄
	构造方法：无参，带参
	成员方法：getXxx()/setXxx，吃饭，睡觉

猫狗有很多共性的内容，所以我们要进行提取：

动物：(抽象类)
	成员变量：姓名，年龄
	构造方法：无参，带参
	成员方法：getXxx()/setXxx，吃饭()，睡觉(){}

抽象类：
	动物(抽象类)
		猫(具体类)
			具备跳高功能的猫(具体类)
		狗(具体类)
			具备跳高功能的狗(具体类)
	运动员(接口)


多态的前提：
	A:有继承或者实现关系
	B:有方法的重写
	C:有父类或者父接口引用指向子类对象

多态的表现形式：
	具体类多态
	抽象类多态
	接口多态

我们目前最常用的是具体类创建对象并使用。
*/
//运动员接口
interface Sport {
	//跳高功能
	public abstract void jump();
}

//动物抽象类
abstract class Animal {
	private String name;
	private int age;

	public Animal(){}

	public Animal(String name,int age) {
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

	//睡觉
	public void sleep() {
		System.out.println("动物们要睡觉");
	}

	//吃饭
	public abstract void eat();
}

//猫
class Cat extends Animal {
	
	public Cat(){}
	public Cat(String name,int age){
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("猫吃鱼！");
	}
	
}

//会跳高的猫
class JumpCat extends Cat implements Sport{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	@Override
	public void jump() {
		System.out.println("这是一个跳高的猫!");
	}
	
}


//狗
class Dog extends Animal{
	
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	

	@Override
	public void eat() {
		System.out.println("狗在吃猫肉!");
	}
	
}

//会跳高的狗
class JumpDog extends Dog implements Sport{
	public JumpDog(){}
	public JumpDog(String name,int age){
		super(name,age);
	}
	@Override
	public void jump() {
		System.out.println("这是一个跳	高的狗!");
	}
	
}
public class AnimalDemo {

	public static void main(String[] args) {
		//无参
		JumpCat jc = new JumpCat();
		jc.setName("猫1");
		jc.setAge(18);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.sleep();
		jc.eat();
		jc.jump();
		
		System.out.println("--------------------------------");
		//带参
		JumpCat jc1 = new JumpCat("猫2", 19);	
		System.out.println(jc1.getName()+"---"+jc1.getAge());
		jc1.sleep();
		jc1.eat();
		jc1.jump();
		
		
		System.out.println("--------------------------------");
		//多态
		Animal am = new JumpCat();
		am.setName("我的猫");
		am.setAge(12);
		System.out.println(am.getName()+"---"+am.getAge());
		am.sleep();
		am.eat();
		//am.jump();
		
		System.out.println("--------------------------------");
		//多态
		Sport s = new JumpCat();
		s.jump();
		//s.eat();
		//s.sleep();
	}

}
