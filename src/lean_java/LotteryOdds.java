package lean_java;

import java.util.Scanner;


/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��11�� ����10:41:02 
 * ��˵�� 
 */
public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("��Ҫȡ��������?");
		int k = in.nextInt();
		
		System.out.print("����Ҫȡ����������Ƕ���?");
		int n = in.nextInt();
		
		int lotteryOdds = 1;
		for (int i=1; i<=k; i++)
			lotteryOdds = lotteryOdds * (n-i+1)/i;
		System.out.printf("��Ӯ�ĸ�����%d��֮һ, ף�����!", lotteryOdds);
	}
}
