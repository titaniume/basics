package cn.titaniume.base.chapter06.objpractice.empcase;

/**
����һ��Ա����,�Լ�������������Ա��
Ȼ�������Ա���������췽����getXxx()/setXxx()������
�Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�

Employee��
	��Ա������Ա�����,����,ְλ
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx()������show()
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
		System.out.println("Ա������ǣ�"+empno+",�����ǣ�"+empName+",ְλ�ǣ�"+job);
	}
	
	
}



public class EmployeeDemo {

	public static void main(String[] args) {
		//�޲�
		Employee emp = new Employee();
		emp.setEmpno(111);
		emp.setEmpName("����");
		emp.setJob("java��������ʦ");
		emp.show();
		
		
		
		//����
		Employee emp2 = new Employee(122, "����", "��Ŀ����");
		emp2.show();
		
	}

}
