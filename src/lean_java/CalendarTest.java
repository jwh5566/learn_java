package lean_java;

import java.time.*;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月12日 下午5:20:16 
 * 类说明 
 */
public class CalendarTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		// 设置date为月初，减去过去的天数
		date = date.minusDays(today - 1);
		DayOfWeek weekday = date.getDayOfWeek(); 
		int value = weekday.getValue();		//获取月初的星期
		
		//打印日历
		System.out.println("星期一   星期二  星期三    星期四    星期五  星期六  星期天");
		for (int i=1; i< value; i++)
			System.out.print("     ");

		while (date.getMonthValue() == month)
		{
			System.out.printf("%4d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);  // 增加一天
			if (date.getDayOfWeek().getValue() == 1) System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1) System.out.println();
	}
}
