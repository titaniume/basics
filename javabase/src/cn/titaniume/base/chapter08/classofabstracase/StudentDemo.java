package cn.titaniume.base.chapter08.classofabstracase;


abstract class Student {
	private String name;
	
	private int age;
	
	private String classId;
	
	public Student() {
		
	}

	public Student(String name, int age, String classId) {
		super();
		this.name = name;
		this.age = age;
		this.classId = classId;
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

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public void eat(){
		System.out.println("�Է�!");
	}
	
	public abstract void study();
}
	
	class BasicStudent extends Student {
		
		public BasicStudent(){}
		
		public BasicStudent(String name,int age,String classId){
			super(name, age, classId);
		}
		@Override
		public void study() {
		System.out.println("������ѧϰjava");
			
		}
		
	}
	

	class JobStudent extends Student { 
		public JobStudent() {}
	
		public JobStudent(String name,int age,String classId) {
			super(name,age,classId);
		}
	
		public void study() {
			System.out.println("��ҵ��ѧ��ѧϰJavaEE+Android");
		}
	}
	
	class StudentDemo{
		
		public static void main(String[] args) {
			BasicStudent bs = new BasicStudent();
			bs.setName("С��");
			bs.setAge(18);
			bs.setClassId("һ�꼶����");
			System.out.println(bs.getName()+"---------"+bs.getAge());
			System.out.println("----------------------------------");
			BasicStudent bs2 = new BasicStudent("С��", 20, "һ�꼶����");
			System.out.println(bs2.getName()+"---------"+bs2.getAge());
			
			//��̬ʹ��
			Student s = new BasicStudent();
			s.setName("�ŷ�");
			s.setAge(23);
			s.setClassId("һ�꼶1");
			System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getClassId());
			s.eat();
			s.study();
			System.out.println("--------------------------------------------------");
			Student s2 = new BasicStudent("xiao��",23,"һ�꼶2");
			System.out.println(s2.getName()+"---"+s2.getAge()+"---"+s2.getClassId());
			s2.eat();
			s2.study();
		}
	}
	
	


