package lean_java;

import java.util.Scanner;

/** 
* @author ���� : jwh5566
* @version ����ʱ�䣺2017��10��11�� ����7:30:05 
* ��˵�� 
*/
public class Retirement {

	public static void main(String[] args) {
		// read inputs
		Scanner in = new Scanner(System.in);
		System.out.println("����Ҫ����Ǯ����?");
		double goal = in.nextDouble();
		
		System.out.println("��ÿ��׬����Ǯ?");
		double payment = in.nextDouble();
		
		System.out.println("��Ϣ�Ƕ���?");
		double interestRate = in.nextDouble();
		
		double blance = 0;
		int years = 0;
		
		// �����˻����
		while (blance <goal)
		{
			blance += payment;
			double interest = blance * interestRate / 100;
			blance += interest;
			years++;
		}
		System.out.println("�㽫��"+ years +"�������");
	}

}
