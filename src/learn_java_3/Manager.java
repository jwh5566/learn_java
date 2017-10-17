package learn_java_3;
/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��17�� ����5:04:59 
 * ��˵�� 
 */
public class Manager extends Employee {
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day){
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double b){
		bonus = b;
	}
	
	
}
