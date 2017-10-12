package lean_java;

import java.time.*;

/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��12�� ����5:20:16 
 * ��˵�� 
 */
public class CalendarTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		// ����dateΪ�³�����ȥ��ȥ������
		date = date.minusDays(today - 1);
		DayOfWeek weekday = date.getDayOfWeek(); 
		int value = weekday.getValue();		//��ȡ�³�������
		
		//��ӡ����
		System.out.println("����һ   ���ڶ�  ������    ������    ������  ������  ������");
		for (int i=1; i< value; i++)
			System.out.print("     ");

		while (date.getMonthValue() == month)
		{
			System.out.printf("%4d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);  // ����һ��
			if (date.getDayOfWeek().getValue() == 1) System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1) System.out.println();
	}
}
