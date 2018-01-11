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
		System.out.println("吃饭!");
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
		System.out.println("基础班学习java");
			
		}
		
	}
	

	class JobStudent extends Student { 
		public JobStudent() {}
	
		public JobStudent(String name,int age,String classId) {
			super(name,age,classId);
		}
	
		public void study() {
			System.out.println("就业班学生学习JavaEE+Android");
		}
	}
	
	class StudentDemo{
		
		public static void main(String[] args) {
			BasicStudent bs = new BasicStudent();
			bs.setName("小孩");
			bs.setAge(18);
			bs.setClassId("一年级三班");
			System.out.println(bs.getName()+"---------"+bs.getAge());
			System.out.println("----------------------------------");
			BasicStudent bs2 = new BasicStudent("小刘", 20, "一年级二班");
			System.out.println(bs2.getName()+"---------"+bs2.getAge());
			
			//多态使用
			Student s = new BasicStudent();
			s.setName("张方");
			s.setAge(23);
			s.setClassId("一年级1");
			System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getClassId());
			s.eat();
			s.study();
			System.out.println("--------------------------------------------------");
			Student s2 = new BasicStudent("xiao冬",23,"一年级2");
			System.out.println(s2.getName()+"---"+s2.getAge()+"---"+s2.getClassId());
			s2.eat();
			s2.study();
		}
	}
	
	


