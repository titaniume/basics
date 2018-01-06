package cn.titaniume.base.chapter06.objpractice.empcase;

/**
定义一个员工类,自己分析出几个成员，
然后给出成员变量，构造方法，getXxx()/setXxx()方法，
以及一个显示所有成员信息的方法。并测试。

Employee：
	成员变量：员工编号,姓名,职位
	构造方法：无参，带参
	成员方法：getXxx()/setXxx()方法，show()
*/
class Employee{
	
	private int empno;
	private String empName;
	private String job;
	
	public Employee(){
		
	}
	
	public Employee(int empno,String empName,String job){
			this.empno=empno;
			this.empName=empName;
			this.job=job;
	}
	
	public void setEmpno(int empno){
		this.empno = empno;
	}
	
	public int getEmpno(){
		return empno;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	

	public void show() {
		System.out.println("员工编号是："+empno+",姓名是："+empName+",职位是："+job);
	}
	
	
}



public class EmployeeDemo {

	public static void main(String[] args) {
		//无参
		Employee emp = new Employee();
		emp.setEmpno(111);
		emp.setEmpName("张三");
		emp.setJob("java开发工程师");
		emp.show();
		
		
		
		//带参
		Employee emp2 = new Employee(122, "李四", "项目经理");
		emp2.show();
		
	}

}
