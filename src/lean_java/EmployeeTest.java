package lean_java;

import java.time.*;


/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��13�� ����11:19:25 
 * ��˵�� 
 */
public class EmployeeTest {
	public static void main(String[] args) {
		//����3��Ա��������
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Carcker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		//����ÿ���˹���5%
		for (Employee e: staff)
			e.raiseSalary(5);
		
		// ��ӡ����Ա����Ϣ
		for (Employee e: staff)
			System.out.println("name: " + e.getName() + ",slary: " +e.getSalary() + ",hireday: " + e.getHireDay());
	}
}


class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;

	}
	
}