package cn.titaniume.base.chapter08.interfacescase;
/*
��������һ��������Ƶ�ʱ����Ӿ���Ŀ�ʼ������������Щ���Ե����ݣ����ϵ����ϳ�ȡ��
�����Ĺ��̣��Ӿ��嵽����
ʵ�ֵĹ��̣��ӳ��󵽾��塣
ʹ�õ�ʱ��ʹ�õ��Ǿ���Ķ���

è������,�������ߵĶ��⹦��

�˶�Ա��(�ӿ�)
	��Ա���������ߡ�

è��(������)
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx���Է���˯��

����(������)
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx���Է���˯��

è���кܶ๲�Ե����ݣ���������Ҫ������ȡ��

���(������)
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx���Է�()��˯��(){}

�����ࣺ
	����(������)
		è(������)
			�߱����߹��ܵ�è(������)
		��(������)
			�߱����߹��ܵĹ�(������)
	�˶�Ա(�ӿ�)


��̬��ǰ�᣺
	A:�м̳л���ʵ�ֹ�ϵ
	B:�з�������д
	C:�и�����߸��ӿ�����ָ���������

��̬�ı�����ʽ��
	�������̬
	�������̬
	�ӿڶ�̬

����Ŀǰ��õ��Ǿ����ഴ������ʹ�á�
*/
//�˶�Ա�ӿ�
interface Sport {
	//���߹���
	public abstract void jump();
}

//���������
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

	//˯��
	public void sleep() {
		System.out.println("������Ҫ˯��");
	}

	//�Է�
	public abstract void eat();
}

//è
class Cat extends Animal {
	
	public Cat(){}
	public Cat(String name,int age){
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("è���㣡");
	}
	
}

//�����ߵ�è
class JumpCat extends Cat implements Sport{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	@Override
	public void jump() {
		System.out.println("����һ�����ߵ�è!");
	}
	
}


//��
class Dog extends Animal{
	
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	

	@Override
	public void eat() {
		System.out.println("���ڳ�è��!");
	}
	
}

//�����ߵĹ�
class JumpDog extends Dog implements Sport{
	public JumpDog(){}
	public JumpDog(String name,int age){
		super(name,age);
	}
	@Override
	public void jump() {
		System.out.println("����һ����	�ߵĹ�!");
	}
	
}
public class AnimalDemo {

	public static void main(String[] args) {
		//�޲�
		JumpCat jc = new JumpCat();
		jc.setName("è1");
		jc.setAge(18);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.sleep();
		jc.eat();
		jc.jump();
		
		System.out.println("--------------------------------");
		//����
		JumpCat jc1 = new JumpCat("è2", 19);	
		System.out.println(jc1.getName()+"---"+jc1.getAge());
		jc1.sleep();
		jc1.eat();
		jc1.jump();
		
		
		System.out.println("--------------------------------");
		//��̬
		Animal am = new JumpCat();
		am.setName("�ҵ�è");
		am.setAge(12);
		System.out.println(am.getName()+"---"+am.getAge());
		am.sleep();
		am.eat();
		//am.jump();
		
		System.out.println("--------------------------------");
		//��̬
		Sport s = new JumpCat();
		s.jump();
		//s.eat();
		//s.sleep();
	}

}
