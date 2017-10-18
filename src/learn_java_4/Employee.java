package learn_java_4;

import java.time.LocalDate;

/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��18�� ����3:53:52 
 * ��˵�� 
 */
public class Employee extends Person{

	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public String getDescription() {
		return String.format("an employee with a salary of$%.2f", salary);
	}
	
}