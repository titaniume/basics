package cn.titaniume.base.chapter08.polymorphismcase;

//��ʳ�Ļ�
class Person{
	public void eat(){
		System.out.println("person eat");
	}
}

class SouthPerson extends Person{

	@Override
	public void eat() {
		System.out.println("�Ϸ���ϲ�����׷�");
	}
	
}

class NorthPerson extends Person{

	@Override
	public void eat() {
		System.out.println("������ϲ��������");
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
