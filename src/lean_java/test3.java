package lean_java;

import java.time.*;


/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��12�� ����4:59:54 
 * ��˵�� 
 */
public class test3 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
//		date = date.minusDays(daysToSubtract)
		System.out.printf("month: %d, today: %d", month, today);
	}
}
