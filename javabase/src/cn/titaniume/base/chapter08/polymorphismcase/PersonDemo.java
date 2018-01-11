package cn.titaniume.base.chapter08.polymorphismcase;

//饮食文化
class Person{
	public void eat(){
		System.out.println("person eat");
	}
}

class SouthPerson extends Person{

	@Override
	public void eat() {
		System.out.println("南方人喜欢吃米饭");
	}
	
}

class NorthPerson extends Person{

	@Override
	public void eat() {
		System.out.println("北方人喜欢吃面条");
	}
	
}




public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		
		SouthPerson sp = new SouthPerson();
		sp.eat();
		
		Person ps = new NorthPerson();
		ps.eat();
	}

}
