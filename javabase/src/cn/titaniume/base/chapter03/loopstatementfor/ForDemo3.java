package cn.titaniume.base.chapter03.loopstatementfor;

/**
 * 5�Ľ׳� 
 * 	n! = n*(n-1)*(n-2)*...*3*2*1
 * n! = n*(n-1)!
 * @author titaniume
 *����2:38:132018��1��4��
 */
public class ForDemo3 {

	public static void main(String[] args) {
		//�����۳˱���
		int jc = 1;
		for (int i = 1; i <=5; i++) {
			jc *=i;
		}
		System.out.println("5�Ľ׳��ǣ�"+jc);

	}

}
