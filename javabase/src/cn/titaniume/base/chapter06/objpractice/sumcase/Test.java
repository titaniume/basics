package cn.titaniume.base.chapter06.objpractice.sumcase;







class Demo{
	private int x;
	private int y;
	
	

	public Demo() {}

	public Demo(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//��Ա�����Ѿ���x,y�ˡ������û�б�Ҫ�ڶ�����
	/*
	public int sum(int x,int y) {
		return x + y;
	}
	*/
	
	public int sum(){
		return x+y;
	}
	
}





public class Test {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.setX(12);
		demo.setY(14);
		int sum = demo.sum();
		System.out.println("�����:"+sum);

	}

}
