package cn.titaniume.base.chapter06.objpractice.regtanclecase;

/**
 * ����һ���������ඨ���ܳ������������Ȼ����һ��Test���в���
 * @author titaniume
 * 2018��1��6������1:52:05
 */
class Regtancle{
	
	private int length;
	private int width;
	
	public Regtancle(){}
	public Regtancle(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	public  void setLength(int length){
		this.length = length;
	}
	
	public int getLength(){
		return length;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	
	/**
	 * �����ܳ�
	 * @param length
	 * @param width
	 * @return
	 */
	public int perimeter(){
		
		return (length + width)/2;
	}
	
	
	/**
	 * �������
	 * @param length
	 * @param width
	 * @return
	 */
	public int area(){
		
		return length * width;
	}

}


public class TestRegtancle {

	public static void main(String[] args) {
		
		//�޲ε���
		Regtancle reg = new Regtancle();
		reg.setLength(18);
		reg.setWidth(20);
		int perimeter = reg.perimeter();
		System.out.println("�ܳ���:"+perimeter);
		
		int area = reg.area();
		System.out.println("�����:"+area);

		
		//����
		Regtancle reg2 = new Regtancle(18, 20);
		int perimeter2 = reg2.perimeter();
		System.out.println("�ܳ���:"+perimeter2);
		
		int area2 = reg2.area();
		System.out.println("�����:"+area2);

	}

}
