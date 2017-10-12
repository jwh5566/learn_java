package lean_java;

import java.time.*;


/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月12日 下午4:59:54 
 * 类说明 
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
